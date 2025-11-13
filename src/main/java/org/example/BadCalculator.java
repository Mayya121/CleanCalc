package org.example;
import java.util.*;

public class BadCalculator {

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        double num1, num2, result = 0;
        String operator;

        System.out.println("Enter first number: ");
        num1 = s.nextInt();

        System.out.println("Enter operator: ");
        operator = s.next();  //

        System.out.println("Enter second number: ");
        num2 = s.nextInt(); //

        if (operator == "+") {
            result = num1 + num2;
        } else if (operator == "-") {
            result = num1 - num2;
        } else if (operator == "*") {
            result = num1 * num2;
        } else if (operator == "/") {
            result = num1 / num2;
        } else
            System.out.println("invalid operator");

        System.out.println("Result: " + result);
    }
}