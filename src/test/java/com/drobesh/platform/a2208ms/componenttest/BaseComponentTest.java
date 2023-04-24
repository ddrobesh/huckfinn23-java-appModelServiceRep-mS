package com.drobesh.platform.a2208ms.componenttest;

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


import java.net.InetAddress;

import org.junit.Before;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.server.LocalServerPort;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class BaseComponentTest {

	@LocalServerPort
	protected int randonServerPort;
	@Value("${server.servlet.context-path}")
	protected String contextPath;
	
	//@Value("${apiclient.rest.default.userTypes.guest.username}")
	protected String guestPassword = "";
	//
	protected String guestUsername = "";
	
	@Before
	public void setUp() throws Exception {
		RestAssured.baseURI = "http://" + InetAddress.getLocalHost().getHostName() + ":" + randonServerPort
				+ contextPath;
	}
	
	/**
	 * Base spec with guest user (non Auth)
	 * @return RequestSpecification
	 */
	protected RequestSpecification givenBaseSpec() {
		return RestAssured.given()
				.relaxedHTTPSValidation()
				.accept(ContentType.JSON)
				.contentType(ContentType.JSON)
				.auth()
					.basic(guestUsername, guestPassword);
	}
	
	/**
	 * Base spec with guest user (non Auth)
	 * @return RequestSpecification
	 */
	protected RequestSpecification givenRegisteredBaseSpec() {
		return RestAssured.given()
				.relaxedHTTPSValidation()
				.accept(ContentType.JSON)
				.contentType(ContentType.JSON)
				.auth()
					.basic(guestUsername, guestPassword);
	}	
}
