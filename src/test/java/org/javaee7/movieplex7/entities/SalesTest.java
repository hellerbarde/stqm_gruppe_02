package org.javaee7.movieplex7.entities;

import org.junit.Test;

public class SalesTest {
	
	@Test
	public void testMoviesNotEqual() {
		Sales a = new Sales(1);
		Sales b = new Sales(2);
		org.junit.Assert.assertFalse("failure - sales are equal", a.equals(b));
	}
	
	@Test
	public void testMoviesEqual() {
		Sales a = new Sales(42);
		Sales b = new Sales(42);
		org.junit.Assert.assertTrue("failure - sales are not equal", a.equals(b));
	}
	
	@Test
	public void testMoviesHashCode() {
		Sales a = new Sales(42);
		org.junit.Assert.assertEquals("failure - a.hashCode does not return the correct id", 42, a.hashCode());
	}
	
	@Test
	public void testMoviesHashCodeNull() {
		Sales a = new Sales(42);
		a.setId(null);
		org.junit.Assert.assertEquals("failure - a.hashCode does not return the correct id when the id is null", 0, a.hashCode());
	}

}