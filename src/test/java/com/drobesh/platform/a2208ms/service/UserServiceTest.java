package com.drobesh.platform.a2208ms.service;

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
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.doReturn;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import com.drobesh.platform.a2208ms.model.TheModelUser;
import com.drobesh.platform.a2208ms.service.UserServiceImpl;

@RunWith(SpringRunner.class)
//@ContextConfiguration(classes = {UserServiceImpl.class},   // , UserRepositoryImpl.class} )
//	locations="classpath:application.properties" )
@TestPropertySource(locations = "classpath:application-test.properties")
public class UserServiceTest {

	static {
		// add System Properties (application-test.properties resource?)
	}
	
	//@Spy
	//UserRepository
	
	@InjectMocks
	UserService userService = new UserServiceImpl();

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void test1() throws Exception {
		TheModelUser user = new TheModelUser();
		user.setId("007");
		user.setName("david");
//		doReturn(user).when(null).createUser(user);
		
		TheModelUser created = userService.createUser(user);
		assertNotNull(created);
	}

	@Test
	public void test2() throws Exception {
		
	}
	
	@Test
	public void test3() throws Exception {
		
	}
	
	
}
