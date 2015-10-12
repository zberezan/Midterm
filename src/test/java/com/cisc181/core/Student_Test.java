package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.core.Student;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Date date = new Date();
		Student student1 = new Student("steve", "rick","jones", date ,"waste enginier",
				"someroad 2", "1234567890","stevetheman@yahoo.net");
		Student student2 = new Student("steve", "rick","jones", date ,"waste enginier",
				"someroad 2", "1234567890","stevetheman@yahoo.net");
		Student student3 = new Student("steve", "rick","jones", date ,"waste enginier",
				"someroad 2", "1234567890","stevetheman@yahoo.net");
		Student student4 = new Student("steve", "rick","jones", date ,"waste enginier",
				"someroad 2", "1234567890","stevetheman@yahoo.net");
		Student student5 = new Student("steve", "rick","jones", date ,"waste enginier",
				"someroad 2", "1234567890","stevetheman@yahoo.net");
		Student student6 = new Student("steve", "rick","jones", date ,"waste enginier",
				"someroad 2", "1234567890","stevetheman@yahoo.net");
		Student student7 = new Student("steve", "rick","jones", date ,"waste enginier",
				"someroad 2", "1234567890","stevetheman@yahoo.net");
		Student student8 = new Student("steve", "rick","jones", date ,"waste enginier",
				"someroad 2", "1234567890","stevetheman@yahoo.net");
		Student student9 = new Student("steve", "rick","jones", date ,"waste enginier",
				"someroad 2", "1234567890","stevetheman@yahoo.net");
		Student student10 = new Student("steve", "rick","jones", date ,"waste enginier",
				"someroad 2", "1234567890","stevetheman@yahoo.net");
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
		fail("Not yet implemented");
	}

}
