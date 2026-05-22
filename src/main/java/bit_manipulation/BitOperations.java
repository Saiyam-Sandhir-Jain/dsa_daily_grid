package main.java.bit_manipulation;

public class BitOperations {
    public static int coutSetBits(int num) {
        int count = 0;
        for (; num != 0; count++) num &= (num-1); 
        return count;
    }
}
