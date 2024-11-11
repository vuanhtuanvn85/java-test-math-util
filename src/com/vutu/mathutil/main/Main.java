/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vutu.mathutil.main;

import com.vutu.mathutil.core.MathUtil;

/**
 *
 * @author vuanh
 */
public class Main {
    public static void main(String[] args) {
        long expected = 120;
        int n = 5;
        long actual = MathUtil.getFactorial(5);
        System.out.println("5! = " + expected + " (expected);");
        System.out.println("5! = " + actual + " (actual);");
    }
}
