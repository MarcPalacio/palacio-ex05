/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Marc Palacio
 */

/*
 *    - Write an application
 *      that asks the user for 2 numbers in the form of strings
 *      calculates and prints out the math outputs
 */

package exercise05;
import java.util.*;

public class Solution05 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("What is the first number? ");
        String firstNum = input.nextLine();
        System.out.print("What is the second number? ");
        String secondNum = input.nextLine();
        int firstNumN = Integer.parseInt(firstNum);
        int secondNumN = Integer.parseInt(secondNum);
        int add = firstNumN + secondNumN;
        int subtract = firstNumN - secondNumN;
        int multiply = firstNumN * secondNumN;
        int divide = firstNumN / secondNumN;
        System.out.printf("%s + %s = %d\n%s - %s = %d\n%s * %s = %d\n%s / %s = %d",
                firstNum, secondNum, add, firstNum, secondNum, subtract, firstNum,
                secondNum, multiply, firstNum, secondNum, divide);
    }
}
