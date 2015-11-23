package org.javaee7.movieplex7.client;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MovieBackingBeanTest {
    
    MovieBackingBean mbb;
    
    @Before
    public void setUp() {
        this.mbb = new MovieBackingBean();

    }
    
    
    @Test
    public void setMovieTitle() {
        this.mbb.setMovieName("Fancy movie name");  
        assertEquals("Fancy movie name", this.mbb.getMovieName());
    }
    
    
    @Test
    public void setActors() {
        this.mbb.setActors("Kickass actor");  
        assertEquals("Kickass actor", this.mbb.getActors());
    }

}
