package com.stalbansboardgamesclub.tta.server.config;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

public class ttaApplicationConfiguration extends Configuration {
	@JsonProperty("views")
	private Map<String, Map<String, String>> viewConfiguration;

	public Map<String, Map<String, String>> getViewConfiguration() {
		return viewConfiguration;
	}
}
