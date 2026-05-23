package main.java.bit_manipulation;

import java.lang.Math;

public class BitOperations {
    public static int coutSetBits(int num) {
        int count = 0;
        for (; num != 0; count++) num &= (num-1); 
        return count;
    }

    public static int setRightMostUnsetBit(int num) {
        return num | (num+1);
    }

    public static void swap(int[] arr, int index1, int index2) {
        if (index1 < 0 || index2 < 0 || index1 >= arr.length || index2 >= arr.length) throw new IllegalArgumentException();

        arr[index1] ^= arr[index2];
        arr[index2] ^= arr[index1];
        arr[index1] ^= arr[index2];
    }

    public static int divide(int dividend, int divisor) {
        if (divisor == 0)
            throw new IllegalArgumentException();

        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        int sign = ((dividend ^ divisor) < 0) ? -1 : 1;
        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);
        int quotient = 0;

        while (dvd >= dvs) {
            int k = 0;
            while (dvd >= (dvs << (k + 1))) {
                k++;
            }
            dvd -= (dvs << k);
            quotient += (1 << k);
        }

        return sign * quotient;
    }
}
