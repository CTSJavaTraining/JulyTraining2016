package com.training.sample;

import static org.junit.Assert.assertArrayEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.training.sample.SchoolFirstDay;

public class SchoolFirstDayTest {

	SchoolFirstDay school = new SchoolFirstDay();
	String[] bag1 = { "Books", "Notebooks", "Pens" };
	String[] bag2 = { "Books", "Notebooks", "Pens", "Pencils" };
	
	@BeforeClass
	// Will be performed before all test.
	public void testBeforeClass()
	{
		System.out.println("Setup for test complete.");
	}

	@AfterClass
	// Will be performed after all test.
	public void testAfterClass()
	{
		System.out.println("Test complete.");
	}

	@Before
	// Will be performed before each test.
	public void testBrforeEachTest()
	{
		System.out.println("Setup for test complete.");
	}

	@After
	// Will be performed after each test.
	public void testAfterEachTest()
	{
		System.out.println("Test complete.");
	}
	
	@Test
	public void testPrepareMyBag() {
		System.out.println("Inside testPrepareMyBag()");
		assertArrayEquals(bag1, school.prepareMyBag());
	}

	@Test
	public void testAddPencils() {
		System.out.println("Inside testAddPencils()");
		assertArrayEquals(bag2, school.addPencils());
	}
}
