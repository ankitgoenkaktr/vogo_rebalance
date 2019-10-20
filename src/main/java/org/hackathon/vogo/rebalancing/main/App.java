package org.hackathon.vogo.rebalancing.main;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import org.hackathon.vogo.rebalancing.resource.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class App extends Application<Configuration> {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
 
    @Override
    public void initialize(Bootstrap<Configuration> b) {
    }
 
    @Override
    public void run(Configuration c, Environment e) throws Exception {
        LOGGER.info("Registering REST resources");
        e.jersey().register(new Resource(e.getValidator()));
    }
 
    public static void main(String[] args) throws Exception {
        new App().run(args);
    }
    
   
}
