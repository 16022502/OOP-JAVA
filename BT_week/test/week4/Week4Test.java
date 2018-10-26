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

    //  Viết 5 testcase cho phương thức max()
    @Test
    public void testMax1() {
        assertEquals(0, Week4.max(0, 0));
    }
     @Test
    public void testMax2(){
        assertEquals(15, Week4.max(15, 15));
    }
     @Test
    public void testMax3(){
        assertEquals(15, Week4.max(15, 13));
    }
     @Test
    public void testMax4(){
        assertEquals(16, Week4.max(16, -13));
    }
     @Test
    public void testMax5(){
         assertEquals(-12, Week4.max(-15, -12));
    }
    
    
    

    //  Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void testMinOfArray() {

        int a[] = {1, 2, 3, 4, 5};
         assertEquals(1, Week4.minOfArray(a));

    }
    
    @Test
    public void testMinOfArray2(){
        int b[] = {1, 0, 4, 6, 7, 8, 9, 5, 6, 4, 3, 6, 3, 5, 2, 6, 25, 225, 3, 35};
        assertEquals(0, Week4.minOfArray(b));
    } 
    
    @Test
    public void testMinOfArray3(){
        int c[] = {4, 5, 6, 2, 8, 9};
        assertEquals(2, Week4.minOfArray(c));
    } 
    
    @Test
    public void testMinOfArray4(){
        int d[] = {17, 18, 12, 3, 7, 13};
        assertEquals(3, Week4.minOfArray(d));
    } 
    @Test
    public void testMinOfArray5(){
         int e[] = {34, 35, 13, 45, 23, 45};
         assertEquals(13, Week4.minOfArray(e));
    } 
   
    

    //  Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testCalculateBMI1() {
        assertEquals("Thua can", Week4.calculateBMI(72, 1.70));
    }
    
    @Test
    public void testCalculateBMI2() {
        assertEquals("Beo phi", Week4.calculateBMI(83, 1.50));
    }
    
    @Test
    public void testCalculateBMI3() {
        assertEquals("Thua can", Week4.calculateBMI(100, 1.70));
    }

    
    @Test
    public void testCalculateBMI4() {
         assertEquals("Binh thuong", Week4.calculateBMI(65, 1.75));
    }

    @Test
    public void testCalculateBMI5() {
        assertEquals("Beo phi", Week4.calculateBMI(100, 1.50));
    }

}
