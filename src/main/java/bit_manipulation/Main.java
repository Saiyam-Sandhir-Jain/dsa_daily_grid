package main.java.bit_manipulation;

import java.util.Scanner;
import main.java.bit_manipulation.CheckUtils;
import main.java.bit_manipulation.BitOperations;

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

        {
            System.out.println("##### Count the number of set bits #####");
            System.out.print("Enter a number: ");
            System.out.printf("The number of set bits in the given number has: %d\n", BitOperations.coutSetBits(sc.nextInt()));
            System.out.println();
        }

        {
            System.out.println("##### Set rightmost unset bit #####");
            System.out.print("Enter a number: ");
            System.out.printf("The given number after changing the rightmost unset bit: %d\n", BitOperations.setRightMostUnsetBit(sc.nextInt()));
            System.out.println();
        }

        {
            System.out.println("##### Swap two numbers #####");
            System.out.print("Enter the first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = sc.nextInt();
            int[] num_pair = {num1, num2};
            System.out.printf("before swapping: (%d, %d)\n", num_pair[0], num_pair[1]);
            BitOperations.swap(num_pair, 0, 1);
            System.out.printf("after swapping: (%d, %d)\n", num_pair[0], num_pair[1]);
            System.out.println();
        }
    }
}