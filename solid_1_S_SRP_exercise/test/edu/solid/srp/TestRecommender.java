package edu.solid.srp;

import java.util.List;

import org.junit.Test;

import edu.solid.srp.BBDD;
import edu.solid.srp.Movie;
import edu.solid.srp.Recommender;

import org.junit.Assert;

public class TestRecommender {

	@Test
	public void basic_test() {
		Recommender r = new Recommender();
		
		List<Movie> recommenations = r.recommendations(BBDD.JOHN);
		
		Assert.assertFalse(recommenations.contains(BBDD.ET));
	}
	
	@Test 
	public void test_format() {
		Recommender r = new Recommender();
		
		String csv = r.recommendationsCSV(BBDD.JOHN);
		
		String expected = "Saving Private Ryan,Spielberg,war";
		
		Assert.assertEquals(expected, csv);

	}

}
