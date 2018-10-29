import org.junit.*;
// methods for assersion and assuming
import static org.junit.Assert.*;
import static org.junit.Assume.*;

//runner
import org.junit.runner.RunWith;

//Data points and theories
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.DataPoint;

import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;


/** 
* @author Aster Bodden
* @author Abdullah Alaqeel
* By making general Junit Theories for the three relevant properties of the equals() contract in the Object class
* Running these test will show that Liskov's implementation of equals() breaks the transitivity property 
* This property means that if x = y and y = x implies x = z.
* Point3 equals is broken because the equals method has been implemented as in the following pseudo code 
*  equals(object):
*		this.equals(object) if object is Point3 check that all fields are equal 
*		this.equals(object) if object is Point2 treat this as a Point2 
* this causes that two different point3 objects be equal to the same point2 
*            Point3(6,9,2) != Point3(6,9,3) but both ==  Point2(6,9),
*
* Contributions: 
*  Aster Bodden: implementation of Point2 equals method and Point 3 skeleton set up | summary of why p3 equals is wrong
*  Abdullah Alaqee: implemented Junit theories to find which property was the broken one in liskov's implementation 
*/


@RunWith(Theories.class)
public class PointTest{

    @DataPoints public static Point2[] twoD = {
            new Point2(),
            new Point2(6,9),
            new Point2(2,4),
            null
    };

    @DataPoints public static Point3[] threeD = {
            new Point3(),
            new Point3(6,9,2),
            new Point3(6,9,3),
            null
    };

    @Theory
    public void reflexiveTest(Object x){
    	assumeTrue(x != null);
    	System.out.println(x);
        assertTrue(x.equals(x));
    }

    @Theory
    public void SymmetryTest(Object x, Object y) {
        assumeTrue(x != null);
        assumeTrue(y != null);
        System.out.println(x + " <> " + y );
        assertTrue(y.equals(x) == x.equals(y));
    }

    @Theory
    public void transitiveTest(Object x, Object y , Object z){
        assumeTrue(x != null);
        assumeTrue(y != null);
        assumeTrue(z != null);
        System.out.println(x + " <> " + y + " <>" + z);

        assumeTrue(x.equals(y));
        assumeTrue(y.equals(z));

        assertTrue(x.equals(z));
    }


    // my IDE does not run the Theories without atleast one @Test
    @Test
    public void test(){

    }

}