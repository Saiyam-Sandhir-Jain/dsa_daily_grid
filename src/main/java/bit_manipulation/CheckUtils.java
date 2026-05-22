package main.java.bit_manipulation;

public class CheckUtils {
    public static boolean isBitSet(int num, int i) {
        return (num & (1 << i)) != 0;
    }

    public static boolean isOdd(int num) {
        return (num & 1) != 0;
    }
}