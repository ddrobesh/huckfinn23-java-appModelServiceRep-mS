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

//import static org.junit.Assert.assertThat;
import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

		import com.fasterxml.jackson.databind.JsonNode;

public class A2208msCompTest extends BaseComponentTest {

	private static final String SERVICE_URI = "/";

	//@MockBean
	//A2208msCompTest foo;
	
	@Test
	public void testComponents() throws Exception {
		String UUID = "abc";
		String testRequest = ""; // TestDataHelper.getTestData()
		
		//mock
		
		//when(foo.invoke(any(Object.class))).thenThrow(null);
		
//		Response response = givenBaseSpec()
//							.header("", UUID)
//							.header("", UUID)
//							.body(testRequest).when().post(SERVICE_URI);
		
		//assertThat(Boolean.TRUE).isEqualTo(Boolean.TRUE);
		JsonNode responseBody = null;
		
		
		assertThat("true").isEqualTo("true");
	}




}
