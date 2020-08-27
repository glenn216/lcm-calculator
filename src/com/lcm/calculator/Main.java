package com.lcm.calculator;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1, num2, lcm;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        num1 = Integer.parseInt(input.nextLine());
        System.out.println("Enter the second number");
        num2 = Integer.parseInt(input.nextLine());
        lcm = (num1 > num2) ? num1 : num2;
        while(true) {
            if( lcm % num1 == 0 && lcm % num2 == 0 ) {
                System.out.printf("The LCM of %d and %d is %d.", num1, num2, lcm);
                break;
            }
            ++lcm;
        }
    }
}
