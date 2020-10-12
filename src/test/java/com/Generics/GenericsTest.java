package com.Generics;

import static org.junit.Assert.*;
import org.junit.Test;

import com.capg.Generics.Generics;


public class GenericsTest {
	
	@Test
	public void giveMaxNumAtFirstPosition() {
		Generics test = new Generics(10, 5, 3);
		Integer maxNum = (Integer) test.maxNum();
		Integer expec = 10;
		assertEquals(expec, maxNum);
			
	}
	
	@Test
	public void giveMaxNumAtSecondPosition() {
		Generics test = new Generics(6, 12, 3);
		Integer maxNum = (Integer) test.maxNum();
		Integer expec = 12;
		assertEquals(expec, maxNum);
			
	}
	
	@Test
	public void giveMaxNumAtThridPosition() {
		Generics test = new Generics(6, 12, 23);
		Integer maxNum = (Integer) test.maxNum();
		Integer expec = 23;
		assertEquals(expec, maxNum);
			
	}
	
	@Test
	public void giveMaxNumFloatAtFirstPosition() {
		Generics test = new Generics(10.2F, 5.0F, 3.5F);
		Float maxNum = (Float) test.maxNum();
		Float expec = 10.2F;
		assertEquals(expec, maxNum);
			
	}
	
	@Test
	public void giveMaxNumFloatAtSecondPosition() {
		Generics test = new Generics(6.5F, 12.4F, 3.6F);
		Float maxNum = (Float) test.maxNum();
		Float expec = 12.4F;
		assertEquals(expec, maxNum);
			
	}
	
	@Test
	public void giveMaxNumFloatAtThridPosition() {
		Generics test = new Generics(6.2F, 12.45F, 23.54F);
		Float maxNum = (Float) test.maxNum();
		Float expec = 23.54F;
		assertEquals(expec, maxNum);
			
	}

	@Test
	public void givenFirstStringValueShouldReturnTrue() {
		Generics test = new Generics("Peach", "Apple", "Banana");
		String actual = (String) test.maxNum();
		String expected = "Peach";
		assertEquals(expected, actual);
	}

	@Test
	public void givenSecondStringValueShouldReturnTrue() {
		Generics test = new Generics("Apple", "Peach", "Banana");
		String actual = (String) test.maxNum();
		String expected = "Peach";
		assertEquals(expected, actual);
	}

	@Test
	public void givenThirdStringValueShouldReturnTrue() {
		Generics test = new Generics("Banana", "Apple", "Peach");
		String actual = (String) test.maxNum();
		String expected = "Peach";
		assertEquals(expected, actual);
	}}