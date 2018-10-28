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
    	assertTrue(x.equals(x));
    	System.out.println(x);
    }

    @Theory
    public void SymmetryTest(Object x, Object y ){
    	    	System.out.println(x +" "+ y );
    }

    @Theory
    public void transitiveTest(Object x, Object y , Object z){

    }

    // my IDE does not run the Theories without atleast one @Test
    @Test 
    public void test(){

    }

}