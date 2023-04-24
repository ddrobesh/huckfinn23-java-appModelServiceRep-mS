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

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.drobesh.platform.a2208ms.model.TheModelUser;

public class ResourceTest {

	@SuppressWarnings("rawTypes")
	@Autowired
	Resource resource;
	
	@Autowired
	public Links links;
	
	@Autowired
	public TheModelUser theModelUser;
	
	//@SuppressWarnings({ "rawTypes", "unchecked" })
	@Before
	public void setUp() throws Exception {
		theModelUser = new TheModelUser("007");
		resource = new Resource(theModelUser);
		
		links = new Links("Test");
		resource.setLinks(links);
	}
	
	@Test
	public void testGetContent() throws Exception {
		TheModelUser result;
		
		result = (TheModelUser) resource.getContent();
		assertEquals(theModelUser.getId(), result.getId());
	}
	
	@Test
	public void testGetLinks() throws Exception {
		Links result;
		
		result = resource.getLinks();
		assertEquals(links.getSelf(), result.getSelf());
	}
	
	@Test
	public void testSetLinks() throws Exception {
		Links result;
		links = new Links("Msg");
		resource.setLinks(links);
		
		result = resource.getLinks();
		assertEquals(links.getSelf(), result.getSelf());
	}
	
}
