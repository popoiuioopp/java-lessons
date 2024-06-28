package com.example.lesson11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String result = "";
        
        System.out.print("Please enter the string: ");
        String input = in.nextLine();

        for (int i = 0; i < input.length(); i++) {
            result =  String.valueOf(input.charAt(i)) + result;
        }

        System.out.println(result);
    }
}
