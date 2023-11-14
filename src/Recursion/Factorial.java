package Recursion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author chris
 */
public class Factorial {

    //Iteration solution
    public static int getFact(int n) {

        int sol = 1;
        for (int i = 1; i <= n; i++) {
            sol = sol * i;
        }
        return sol;

    }

    //Recursive solution
    public static int fact(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }

    }
    
    public static void main(String[] args) {
        System.out.println("For loop : " + getFact(5));
        System.out.println("Recursion : " + fact(5));
    }
}
