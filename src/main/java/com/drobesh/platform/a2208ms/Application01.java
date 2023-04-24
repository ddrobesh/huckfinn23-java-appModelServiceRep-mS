package com.drobesh.platform.a2208ms;

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

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
// NOTE: add-on/remove .... doingItInJava - HelloDockerRestController - class HelloDockerRestController
import java.util.Date;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello Jersey-Servlet world!
 *
 */
@SpringBootApplication
@ComponentScan(basePackages="com.drobesh.platform")
@EnableAsync
@EnableCaching
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class })
public class Application01 extends SpringBootServletInitializer {

	/**
	 * BETTER - Load application.properties
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder pApplication) {
		return pApplication.sources(Application01.class);
	}
	
	public static void main(String[] args) {
		// SystemPropertiesLoader.addSystemProperties();	system.properties
		//System.setProperty("server.servlet.context-path", "/api/drobesh"); //		instead of application.properties
		System.out.println("*** Print: HelloDockerApplication ... sent into the logs pre-run............");
		SpringApplication.run(Application01.class, args);
		System.out.println("*** Print: HelloDockerApplication ... sent into the logs post-run............");
	}
	
	
//add-on / delete is okay pom.xml build	
	@RestController
	class HelloDockerRestController {
		@RequestMapping("/hello/{name}")
		public String helloDocker(@PathVariable(value = "name") String name) {
			String response = "Hello " + name + " Response received on : " + new Date() + "\n";
			System.out.println(response);
			return response;

		}
	}
	
	/**
	 * CLASSIC - Everyone does this way c2019 old school down dirty
    public static void main(String[] args) {
    	System.out.println("Hello Application01 .... 2208 Eclipse.GitHub.Jenkins.Maven! Note InteliJ Jenkins integration 2022 not yet available.");
    	
        new Application01().configure(new SpringApplicationBuilder(Application01.class)).run(args);
    }
	 */
    
}
