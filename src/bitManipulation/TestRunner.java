package bitManipulation;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestRunner {
    @Test
    public void InsertionTest() {
        int n = 1024;
        int m = 10011; 
        int i = 2;
        int j = 6;

        int result = BitManipulation.Insertion(n, m, i, j);

        if (result != 1100) {
            fail("Bit Insertion did not produce expected value of 1100, or 10001001100");
        }
    }
}