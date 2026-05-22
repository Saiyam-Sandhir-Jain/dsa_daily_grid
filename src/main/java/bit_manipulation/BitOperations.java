package main.java.bit_manipulation;

public class BitOperations {
    public static int coutSetBits(int num) {
        int count = 0;
        for (; num != 0; count++) num &= (num-1); 
        return count;
    }

    public static void swap(int[] arr, int index1, int index2) {
        if (index1 < 0 || index2 < 0 || index1 >= arr.length || index2 >= arr.length) throw new IllegalArgumentException();

        arr[index1] ^= arr[index2];
        arr[index2] ^= arr[index1];
        arr[index1] ^= arr[index2];
    }
}
