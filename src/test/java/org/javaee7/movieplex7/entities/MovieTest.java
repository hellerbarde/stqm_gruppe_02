package org.javaee7.movieplex7.entities;

import org.javaee7.movieplex7.entities.Movie;
import org.junit.Test;

public class MovieTest {
	
	@Test
	public void testMoviesNotEqual() {
		Movie a = new Movie(1);
		Movie b = new Movie(2);
		org.junit.Assert.assertFalse("failure - movies are equal", a.equals(b));
	}
	
	@Test
	public void testMoviesEqual() {
		Movie a = new Movie(42);
		Movie b = new Movie(42);
		org.junit.Assert.assertTrue("failure - movies are not equal", a.equals(b));
	}
	
	@Test
	public void testMoviesHashCode() {
		Movie a = new Movie(42);
		org.junit.Assert.assertEquals("failure - a.hashCode does not return the correct id", 42, a.hashCode());
	}
	
	@Test
	public void testMoviesHashCodeNull() {
		Movie a = new Movie(42);
		a.setId(null);
		org.junit.Assert.assertEquals("failure - a.hashCode does not return the correct id when the id is null", 0, a.hashCode());
	}
	
	
}