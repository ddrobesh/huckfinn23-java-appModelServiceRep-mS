package com.drobesh.platform.a2208ms.model;

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

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TheModelUserTest { //extends TestCase {

	@Autowired
	public TheModelUser theModelUser;
	
	@Before
	public void setUp() throws Exception {
		theModelUser = new TheModelUser("DD3152");
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testToString() throws Exception {
		String result;
		theModelUser.setName("David");
		
		result = theModelUser.toString();
		assertEquals("{id:DD3152, name=David}", result);
	}
	
	@Test
	public void testHashCode() throws Exception {
		int result;
		
		theModelUser.setName("David");
		result = theModelUser.hashCode();
		assertEquals(-2013058182, result);
		
		theModelUser.setId(null);
		result = theModelUser.hashCode();
		assertEquals(65806869, result);

		theModelUser.setName(null);
		result = theModelUser.hashCode();
		assertEquals(961, result);
	}
	
	@Test
	public void testEquals() throws Exception {

		Object obj = null;
		boolean result;

		// test 1 - non Null, @Autowired
		obj = null;
		result = theModelUser.equals(obj);
		assertEquals(false, result);

		// test 2 - equals
		obj = theModelUser;
		result = theModelUser.equals(obj);
		assertEquals(true, result);
		
		// test 3 - non-ThisClass
		obj = new ArrayList<Object>();
		result = theModelUser.equals(obj);
		assertEquals(false, result);

		// test 4 - Constructor: Given bad data, not equal
		obj = new TheModelUser("007different","David"); // see above: line 32
		result = theModelUser.equals(obj);
		assertEquals(false, result);

		// test 5 - Constructor: Given null, not equal
		obj = new TheModelUser(null,"David"); // see above: line 32
		result = theModelUser.equals(obj);
		assertEquals(false, result);

		// test 6 - Constructor: Given different users ... why not equal?
		obj = new TheModelUser("999different","David"); // see above: line 32
		theModelUser.setId("00710");
		//theModelUser.setName(theModelUser.getName());
		result = theModelUser.equals(obj);
		assertEquals(false, result);

		// test 7 - Constructor: Given null name, not equal
		obj = new TheModelUser("00710",null); // see above: line 32
		result = theModelUser.equals(obj);
		assertEquals(true, result);

		// test 8 - Setters: Given null name, not equal
		obj = new TheModelUser("00710","David"); // see above: line 32
		theModelUser.setId("00710");
		theModelUser.setName(null);
		result = theModelUser.equals(obj);
		assertEquals(false, result);	
		
		// test 9 - Constructor: 
		obj = new TheModelUser("00710","David"); // see above: line 32
		theModelUser.setId("00710");
		theModelUser.setName("Drobesh");
		result = theModelUser.equals(obj);
		assertEquals(false, result);
		
		// test 10 - Setters: set name, null ID
		//theModelUser.setId(theModelUser.getId());
		theModelUser.setName("David");
		result = theModelUser.equals(obj);
		assertEquals(true, result);		
	}

}
