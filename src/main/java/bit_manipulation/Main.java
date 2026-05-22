package main.java.bit_manipulation;

import java.util.Scanner;
import main.java.bit_manipulation.CheckUtils;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        {
            System.out.println("##### Check if i-th bit is set or not #####");
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            System.out.print("Enter the value of i: ");
            if (CheckUtils.isBitSet(num, sc.nextInt())) {
                System.out.println("The i-th bit is set in the given number.");
            } else System.out.println("The i-th bit is not set in the given number.");
            System.out.println();
        }

        {
            System.out.println("##### Check if a number is odd or not #####");
            System.out.print("Enter a number: ");
            if (CheckUtils.isOdd(sc.nextInt())) {
                System.out.println("The given number is odd.");
            } else System.out.println("The given number is not odd.");
            System.out.println();
        }

        {
            System.out.println("##### Check if a number is power of 2 or not #####");
            System.out.print("Enter a number: ");
            if (CheckUtils.isPowerOf2(sc.nextInt())) {
                System.out.println("The given number is a power of 2.");
            } else System.out.println("The given number is not a power of 2.");
            System.out.println();
        }
    }
}