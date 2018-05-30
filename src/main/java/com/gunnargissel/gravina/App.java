package com.gunnargissel.gravina;

import com.gunnargissel.gravina.config.GravinaConfiguration;
import com.gunnargissel.gravina.resources.EchoResource;
import io.dropwizard.Application;
import io.dropwizard.bundles.assets.ConfiguredAssetsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
public class App extends Application<GravinaConfiguration> {

    public static void main(String[] args)  throws Exception  {
        new App().run(args);
    }

    public void initialize(Bootstrap<GravinaConfiguration> bootstrap) {
        //This setting serves static pages at / and will make Dropwizard look for an index.html file if nothing is found at a path
        bootstrap.addBundle(new ConfiguredAssetsBundle("/assets/", "/", "index.html"));
    }

    public void run(GravinaConfiguration conf, Environment env) {
        //This setting serves the application at /api
        env.jersey().setUrlPattern("/api/*");
        env.jersey().register(new EchoResource());
    }
}
