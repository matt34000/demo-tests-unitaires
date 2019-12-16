package dev.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void test1() {
		
		int te = StringUtils.levenshteinDistance("Java", "Jawa");
		assertEquals(0, te);
		
		
	}

	@Test
	public void test2() {
		
		int te = StringUtils.levenshteinDistance("Java", null);
		assertEquals(1, te);
		
		
	}

	@Test
	public void test3() {
		
		int te = StringUtils.levenshteinDistance("Java", "0");
		assertEquals(2, te);
		
		
	}	

	@Test
	public void test4() {
		
		int te = StringUtils.levenshteinDistance("Java", "java");
		assertEquals(3, te);
		
		
	}	

	@Test
	public void test5() {
		
		int te = StringUtils.levenshteinDistance("Java", "Javac");
		assertEquals(1, te);
		
		
	}	
	
}
