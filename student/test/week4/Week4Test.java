package week4;

import static org.junit.Assert.*;
import org.junit.Test;
import week4.Week4;

/**
 *
 * @author QUANG
 */
public class Week4Test {
    // Week4 w4t = new Week4();

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void testMax() {

        assertEquals(0, Week4.max(0, 0));
        assertEquals(15, Week4.max(15, 15));
        assertEquals(15, Week4.max(15, 13));
        assertEquals(16, Week4.max(16, -13));
        assertEquals(-12, Week4.max(-15, -12));
    }

    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void testMinOfArray() {

        int a[] = {1, 2, 3, 4, 5};
        int b[] = {1, 0, 4, 6, 7, 8, 9, 5, 6, 4, 3, 6, 3, 5, 2, 6, 25, 225, 3, 35};
        int c[] = {4, 5, 6, 2, 8, 9};
        int d[] = {17, 18, 12, 3, 7, 13};
        int e[] = {34, 35, 13, 45, 23, 45};

        assertEquals(1, Week4.minOfArray(a));
        assertEquals(0, Week4.minOfArray(b));
        assertEquals(2, Week4.minOfArray(c));
        assertEquals(3, Week4.minOfArray(d));
        assertEquals(13, Week4.minOfArray(e));
    }

    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testCalculateBMI() {

        assertEquals("Thua can", Week4.calculateBMI(72, 1.70));
        assertEquals("Binh thuong", Week4.calculateBMI(62, 1.67));
        assertEquals("Beo phi", Week4.calculateBMI(83, 1.50));
        assertEquals("Thieu can", Week4.calculateBMI(45, 1.70));
        assertEquals("Binh thuong", Week4.calculateBMI(65, 1.75));
    }

}
