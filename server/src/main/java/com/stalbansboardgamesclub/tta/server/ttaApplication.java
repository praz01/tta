package com.stalbansboardgamesclub.tta.server;

import java.util.Map;

import com.stalbansboardgamesclub.tta.server.config.ttaApplicationConfiguration;

import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;

public final class ttaApplication extends Application<ttaApplicationConfiguration> {
	
	public static void main(final String[] args) throws Exception {
		new ttaApplication().run(args);
	}
	
	public void initialize(final Bootstrap<ttaApplicationConfiguration> bootstrap) {
		bootstrap.addBundle(new AssetsBundle("/tta", "/tta"));
		bootstrap.addBundle(new ViewBundle<ttaApplicationConfiguration>() {
			public Map<String, Map<String, String>> getViewConfiguration(ttaApplicationConfiguration config) {
				return config.getViewConfiguration();
			}
		});
	}

	@Override
	public void run(ttaApplicationConfiguration config, Environment environment) throws Exception {
		
	}

	@Override
	public String getName() { return "tta"; }
}
