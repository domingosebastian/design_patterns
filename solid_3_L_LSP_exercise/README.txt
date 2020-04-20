In this exercise, your task will be more destructive than constructive! ;-)

You have a colleague who talks about how useless SOLID principles are.

At the same time, they have built a test system (test/edu/solid /liskov/PointsTests.java) which proves that type Point2D 
complies with a basic rule of geometry: 
 - the two points p1 and p2 are equal if, and only if, the distance from p1 to p2 equals 0.

Modify the test so that the list test_points has an input that makes the test system fail 
(in particular, it should demonstrate that Point3D is not a safe substitute for Point2D.)

NOTE: as you can see, this exercise is different: the starting point is a test
system that works and the result is one that fails!!
