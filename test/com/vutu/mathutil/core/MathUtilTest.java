/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.vutu.mathutil.core;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vuanh
 */
public class MathUtilTest {
    
    public MathUtilTest() {
    }

    /**
     * Test of getFactorial method, of class MathUtil.
     */
    @Test
    public void testGetFactorial() {
        System.out.println("getFactorial");
        int n = 0;
        long expResult = 1L;
        long result = MathUtil.getFactorial(n);
        System.out.println(expResult);
        System.out.println(result);
        assertEquals(expResult, result);
    }
    
}
