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
            new Point3(2,5,3),
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