/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Recursion;

/**
 *
 * @author chris
 */
public class Fibonacci {

    //using iteration
    public static int getFib(int n) {
        int firstTerm = 0;
        int secondTerm = 1;
        int nexTerm = 0;
        
        for (int i = 2; i <= n; ++i) {
            // compute the next term
            nexTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nexTerm;
        }
        return secondTerm;
    }
    
    //using Recursive solution
    public static int fib(int n)
    {
        //base case
        if (n <= 1)
            return n;
        //recursive case
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("For loop Fib "+getFib(9));
        System.out.println("Recursion  "+fib(9));
    }

}
