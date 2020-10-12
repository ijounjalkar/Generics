package com.Generics;

import static org.junit.Assert.*;
import org.junit.Test;

import com.capg.Generics.Generics;


public class GenericsTest {

	@Test
	public void giveMaxNumAtFirstPosition() {
		Generics test = new Generics();
		Float maxNum = test.maxNum(10.2F, 5.0F, 3.5F);
		Float expec = 10.2F;
		assertEquals(expec, maxNum);
			
	}
	
	@Test
	public void giveMaxNumAtSecondPosition() {
		Generics test = new Generics();
		Float maxNum = test.maxNum(6.5F, 12.4F, 3.6F);
		Float expec = 12.4F;
		assertEquals(expec, maxNum);
			
	}
	
	@Test
	public void giveMaxNumAtThridPosition() {
		Generics test = new Generics();
		Float maxNum = test.maxNum(6.2F, 12.45F, 23.54F);
		Float expec = 23.54F;
		assertEquals(expec, maxNum);
			
	}

}