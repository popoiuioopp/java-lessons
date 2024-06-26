package com.example.lesson7;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int sum = 0;
        System.out.print("Input a set of integers and then press Enter: ");
        String input = in.nextLine();

        Scanner sc = new Scanner(input);
        while (sc.hasNextInt()) {
            int x = sc.nextInt();
            sum = sum + x;
        }
        System.out.println("Sum of these integers = " + sum);
    }
}
