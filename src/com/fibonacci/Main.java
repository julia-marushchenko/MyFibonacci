package com.fibonacci;

/**
 * <h1>This is java program to demonstrate solving Fibonacci task</h1>
 * recursive way
 *
 * This is Main class
 *
 *  @author Julia Marushchenko
 *  @version 1.0
 *  @since 2025-04-27
 */
public class Main {

    public static int printFibonacci(int number){
        if(number <= 1) {
            return number;
        }
        return printFibonacci(number - 1) + printFibonacci(number - 2);
    }

    // Main method to run java program
    public static void main(String[] args) {

        // Calling method printFibonacci
        System.out.println(Main.printFibonacci(11)); // output 89
    }
}