/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.vutu.mathutil.test.core;

import com.vutu.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author vuanh
 */

@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    
   @Parameterized.Parameters
   public static Object[][] initData() {
       return new Integer[][] {
           {0, 1},
           {1, 1},
           {2, 2},
           {3, 6},
           {4, 24},
           {5, 120},
       };
   }
   
   @Parameterized.Parameter(value = 0)
   public int n;
   
   @Parameterized.Parameter(value = 1)
   public long expected;
   
   @Test
   public void testGetFactorialGivenRightArgumentReturnWell() {
       Assert.assertEquals(expected, MathUtil.getFactorial(n));
   }
}
