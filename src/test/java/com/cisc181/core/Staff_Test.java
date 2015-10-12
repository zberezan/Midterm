package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Calendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {
	List Stafflist = new ArrayList();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Date date = new Date();
		//test with 11 digit phone number
		Staff person1 = new Staff("steve", "rick", "john",
				date, "first street","09483920392", "something@something.com",
				"3-5", 3 , 2000000 ,date,
				"Waste Specialist");
		assertTrue(person1.PrintAge()== 0);
	}

	

}
