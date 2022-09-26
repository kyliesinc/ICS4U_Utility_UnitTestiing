package UtilityTUnitesting;

// necessary to do the tests
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

//import the class you want to be testing
import UtilityTUnitesting.MathUtility;


public class MathUtilityTest {
    @Test
    public void addTest1(){
        assertEquals(0, MathUtility.add(0,0));
    }

    @Test
    public void addTest2(){
        assertEquals(6, MathUtility.add(5,1));
    }

    @Test
    public void addTest3(){
        assertEquals(-1, MathUtility.add(-2, 1));
    }


    
}
