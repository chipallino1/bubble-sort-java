package com.udemy.bubblesort;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arrayOfInts = new Random().ints(10, -100, 100).toArray();

        System.out.println(Arrays.toString(arrayOfInts));

        int unsortedPartitionIndex = arrayOfInts.length - 1;

        for (int i = 0; i < unsortedPartitionIndex + 1; i++) {
            if (i == unsortedPartitionIndex) {
                i = 0;
                unsortedPartitionIndex--;
            }
            if (arrayOfInts[i] > arrayOfInts[i + 1]) {
                swapWithNextOne(arrayOfInts, i);
            }
        }
        System.out.println(Arrays.toString(arrayOfInts));
    }

    private static void swapWithNextOne(int[] arrayOfInts, int i) {
        // swapping elements without temp variable
        // a = 15
        // b = 3
        arrayOfInts[i + 1] = arrayOfInts[i + 1] - arrayOfInts[i]; // b = b - a; calculate diff; b = 3 - 15 = -12;
        arrayOfInts[i] = arrayOfInts[i] + arrayOfInts[i + 1]; // a = a + b; add diff to a; a = 15 + (-12) = 3;
        arrayOfInts[i + 1] = arrayOfInts[i] - arrayOfInts[i + 1];
    }
}
