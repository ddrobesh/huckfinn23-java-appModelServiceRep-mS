package com.drobesh.platform.a2208ms.config;

/**
 * These code and artifact files are intended for demo, learning,
 * discussion, training, and non-commercial purposes ONLY. They
 * may not be intended for Production use while in partial
 * form, but production use for non-commercial demo/learning
 * purposes are encouraged and not disallowed.
 * Without the explicit, written concept of both author and owner,
 * any modifications and/or re-distributions of the framework,
 * code, or file systems is explicitly forbidden. Modifications
 * are allowed for local, learning purposes.
 * Re-distributions or reuse for commercial for-profit
 * purposes are explicitly forbidden.
 *
 * Copyright 2019-2023 All Rights Reserved, David D Drobesh,
 * and 8814 Bothell Properties LLC, and Level8 Partnerships,
 * respectively.
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfiguration {
	/**
	 * io.Swagger MVC controller/config
	 * @return WebMvcConfigurerAdapter
	 */
	@Bean
	public WebMvcConfigurerAdapter fowardToIndex() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addViewControllers(ViewControllerRegistry pRegistry) {
				pRegistry.addViewController("/swagger").setViewName(
						"redirect:/swagger/index.html");
				pRegistry.addViewController("/swagger/").setViewName(
						"redirect:/swagger/index.html");
				pRegistry.addViewController("/docs").setViewName(
						"redirect:/docs/html/index.html");
				pRegistry.addViewController("/docs/").setViewName(
						"redirect:/docs/html/index.html");
			}
		};
	}
}
