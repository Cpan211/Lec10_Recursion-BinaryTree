/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Recursion.Problems;

/**
 *
 * @author chris
 */
public class Palidrome {

    public static boolean isPal(String s) {   // if length is 0 or 1 then String is palindrome
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length() - 1)) /* check for first and last character of String:
         * if they are same then do the same thing for a substring
         * with first and last char removed. and carry on this
         * until you string completes or condition fails
         * Function calling itself: Recursion
         */ {
            return isPal(s.substring(1, s.length() - 1));
        }

        //else just return false
        return false;
    }

    public static void main(String[] args) {

        System.out.println(isPal("car"));
        System.out.println(isPal("radar"));
        System.out.println(isPal("madam"));

    }

}
