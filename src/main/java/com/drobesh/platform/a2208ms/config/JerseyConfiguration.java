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

import java.util.logging.Logger;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.drobesh.platform.a2208ms.resource.UserResourceImpl;
import com.drobesh.platform.jackson.jaxrs.JsonParseExceptionMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

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

@Component
//@ApplicationPath("/thisMs/v1") - see application.properties
public class JerseyConfiguration extends ResourceConfig {

	public final static String LOGGER_NAME = "com.drobesh.platform.logging.server.JerseyLogging";
	private static final Logger LOG = Logger.getLogger(LOGGER_NAME);
	
	@Bean
	@Primary
	public ObjectMapper objectMapper() {
//System.out.println("JerseyConfig java .... line 1");		
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
		objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
		objectMapper.enable(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
		objectMapper.enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
		
		return objectMapper;
	}

	/**
	 * This is the main constructor - register Apache Jersey (Glassfish JDK6EE) WS Servlet config
	 */
	@Autowired
	public JerseyConfiguration() {
System.out.println("JerseyConfig java .... line 2 - Register the Drobesh IDP Platform .classes");				
		property(ServletProperties.FILTER_FORWARD_ON_404, true);
//		register(DynamicLoggingFeature.class);
//register(DynamicLoggingFeature.class);
//register(DynamicLoggingFeature.class);
		register(JsonParseExceptionMapper.class);
 		register(ServiceExceptionMapper.class);	// this mS same package
		register(UserResourceImpl.class);	// Main Entry .class
		//
//register(LoggingContextJerseyFilter.class);
	}
}
