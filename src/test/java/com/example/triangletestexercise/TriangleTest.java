package com.example.triangletestexercise;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TriangleTest {

    @Test
    public static boolean isValidTriangle(int a, int b, int c) {
        // check if a side is negative or zero
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }

        // making sure that the sum of two sides are larger than the third
        if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
            return false;
        }

        // if we get to this = valid triangle
        return true;
    }

        @Test
        public void testValidTriangle() {
            assertTrue(TriangleTest.isValidTriangle(3, 4, 5));
            assertTrue(TriangleTest.isValidTriangle(6, 12, 7));
        }

        @Test
        public void testInvalidTriangle() {
            assertFalse(TriangleTest.isValidTriangle(0, 0, 0));
            assertFalse(TriangleTest.isValidTriangle(3, 4, 7));
            assertFalse(TriangleTest.isValidTriangle(2, 2, 5));
        }


    public static boolean isEquilateralTriangle(int a, int b, int c) {
        // Check if any side is negative or zero
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }

        // Check if all sides are equal in length
        if (a == b && b == c) {
            return true;
        }

        // If we get here, the sides cannot form an equilateral triangle
        return false;
    }

    public static boolean isIsoscelesTriangle(int a, int b, int c) {
        // Check if any side is negative or zero
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }

        // Check if any two sides are equal in length
        if (a == b || b == c || c == a) {
            return true;
        }

        // If we get here, the sides cannot form an isosceles triangle
        return false;
    }

    public static boolean isScaleneTriangle(int a, int b, int c) {
        // Check if any side is negative or zero
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }

        // Check if all sides are of different lengths
        if (a != b && b != c && c != a) {
            return true;
        }

        // If we get here, the sides cannot form a scalene triangle
        return false;
    }

    @Test
    public void testEquilateralTriangle() {
        assertTrue(TriangleTest.isEquilateralTriangle(3, 3, 3));
        assertTrue(TriangleTest.isEquilateralTriangle(6, 6, 6));
        assertFalse(TriangleTest.isEquilateralTriangle(3, 4, 5));
    }

    @Test
    public void testIsoscelesTriangle() {
        assertTrue(TriangleTest.isIsoscelesTriangle(3, 3, 4));
        assertTrue(TriangleTest.isIsoscelesTriangle(6, 6, 3));
        assertFalse(TriangleTest.isIsoscelesTriangle(3, 4, 5));
    }

    @Test
    public void testScaleneTriangle() {
        assertTrue(TriangleTest.isScaleneTriangle(3, 4, 5));
        assertTrue(TriangleTest.isScaleneTriangle(5, 6, 7));
        assertFalse(TriangleTest.isScaleneTriangle(3, 3, 3));
        assertFalse(TriangleTest.isScaleneTriangle(3, 3, 4));
    }
}


