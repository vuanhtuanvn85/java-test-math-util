/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vutu.mathutil.core;

/**
 *
 * @author vuanh
 */
public class MathUtil {
    // trong class này cung cấp cho ai đó nhiều hàm xử lý toán học
    // clone class Math của JDK
    
    public static long getFactorial(int n) {
        if(n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. N must be between 0..20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * getFactorial(n-1);
    }
}
