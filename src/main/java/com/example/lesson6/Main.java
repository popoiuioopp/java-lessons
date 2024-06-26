package com.example.lesson6;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader console = new BufferedReader(reader);
    
        int sum = 0;
        System.out.print("Input a set of integers and then press Enter: ");
        String input = console.readLine();
        StringTokenizer tokenizer = new StringTokenizer(input);

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            int x = Integer.parseInt(token);
            sum = sum + x;
        }
        System.out.println("Sum of these integers = " + sum);
    }
}
