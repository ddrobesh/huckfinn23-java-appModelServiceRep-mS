package com.drobesh.platform.a2208ms.representation;

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


import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class LinksTest {

	@Autowired
	Links links;
	
	@Before
	public void setUp() throws Exception {
		links = new Links("Test");
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testGetSelf() throws Exception {
		String result;
		
		result = links.getSelf();
		assertEquals("Test", result);
	}
	
	
}
