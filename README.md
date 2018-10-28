CS/SWE 332 Assignment 9 
Due Wednesday, October 31, 2018

Goal: Contract for equals() 

Submit via Blackboard. 
Assignment:

Liskov's implementation of equals() for the Point3 class (see figure 7.16, page 182) is wrong. We know this must be true because Point2 is instantiable and Point3 adds client-visible state (namely the z coordinate). Hence, of the three properties (Liskov substitution principle, symmetry, and transitivity), only two are possible.

Your assignment is to figure out which property is broken. Demonstrate your result with a suitable JUnit test. You'll have to fill in enough of the Point2 and Point3 classes to make them functional, including constructors and an overridden equals() method for Point2. You should code the equals() method in Point2 with Bloch's standard recipe.

Grading Criteria:

Point2 and Point3 classes appropriately coded.
Correctly identified failing property.
Appropriate JUnit tests.
