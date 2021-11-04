package nz.ac.massey.cs._251.tut4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class TestCalc

{
    @Test
    void add() {
        int a = 13;
        int b = 23;
        assertEquals(36, Calc.add(a,b));
    }


}