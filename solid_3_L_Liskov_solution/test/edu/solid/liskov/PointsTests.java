package edu.solid.liskov;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import edu.solid.liskov.Point2D;

public class PointsTests {

	private final Point2D referencia = new Point3D(3,5,1);
	private final List<Point2D> test_points = Arrays.asList(
			                                         new Point2D(2,3), 
			                                         new Point2D(3,5), 
			                                         new Point2D(4,3)
			                                         );
	
	
	@Test
	public void test_iguales_si_solo_si_distancia_0() {
		
		for (Point2D punto: test_points) {
			Assert.assertEquals("test para " + referencia + " y " + punto,
					             referencia.equals(punto), 
					             referencia.distance(punto) == 0);
		}
	}

}
