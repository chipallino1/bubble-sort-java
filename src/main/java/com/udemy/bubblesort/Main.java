package com.udemy.bubblesort;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arraysOfInts = new Random().ints(100, -100, 100).toArray();

        System.out.println(Arrays.toString(arraysOfInts));

        int unsortedPartitionIndex = arraysOfInts.length - 1;

        for (int i = 0; i < unsortedPartitionIndex + 1; i++) {
            if (i == unsortedPartitionIndex) {
                i = 0;
                unsortedPartitionIndex--;
            }
            if (arraysOfInts[i] > arraysOfInts[i + 1]) {
                // swapping elements without temp variable
                // a = 15
                // b = 3
                arraysOfInts[i + 1] = arraysOfInts[i + 1] - arraysOfInts[i]; // b = b - a; calculate diff; b = 3 - 15 = -12;
                arraysOfInts[i] = arraysOfInts[i] + arraysOfInts[i + 1]; // a = a + b; add diff to a; a = 15 + (-12) = 3;
                arraysOfInts[i + 1] = arraysOfInts[i] - arraysOfInts[i + 1]; // b = a - b; subtract diff from a; b = 3 - (-12) = 15;
            }
        }
        System.out.println(Arrays.toString(arraysOfInts));
    }
}
