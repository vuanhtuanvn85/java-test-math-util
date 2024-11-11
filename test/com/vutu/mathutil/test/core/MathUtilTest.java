/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.vutu.mathutil.test.core;
//
//import org.junit.jupiter.api.Test;

import com.vutu.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author vuanh
 */
public class MathUtilTest {
    
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
        int n = 0;  
        long expected = 1;
        
        long actual = MathUtil.getFactorial(n);
        
        Assert.assertEquals(expected, actual);
        
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        Assert.assertEquals(120, MathUtil.getFactorial(5));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5);
    }
    
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVersion () {
        Assert.assertThrows(IllegalArgumentException.class,
                    () -> {
                        MathUtil.getFactorial(21);
                    }
                );
    }
    
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch () {
        try {
            MathUtil.getFactorial(21);
        } catch (Exception e) {
            Assert.assertEquals("Invalid argument. N must be between 0..20", e.getMessage());
        }
    }
}
