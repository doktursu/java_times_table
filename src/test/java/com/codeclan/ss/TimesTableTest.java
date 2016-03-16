package com.codeclan.ss;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for TimesTable App.
 */
public class TimesTableTest 
{

	@Test
	public void testTimesTableConstructor() {
		TimesTable t = new TimesTable(35, 48);
		System.out.println(t);
	}
	
}
