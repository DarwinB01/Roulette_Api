package com.roulette.api;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Allow configuration to use framework
 * 
 * @author Darwin Bonilla
 * @version 1.0
 *
 */
public class ServletInitializer extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(RouletteApiApplication.class);
	}

}
