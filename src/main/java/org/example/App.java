package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double x = sc.nextDouble();

        System.out.print("Enter operator (+,-,*,/): ");
        String op = sc.next();

        System.out.print("Enter second number: ");
        double y = sc.nextDouble();

        double res;
        switch (op) {
            case "+": res = c.add(x, y); break;
            case "-": res = c.subtract(x, y); break;
            case "*": res = c.multiply(x, y); break;
            case "/": res = c.divide(x, y); break;
            default: throw new IllegalArgumentException("Unknown operator: " + op);
        }

        System.out.println("Result = " + res);
    }
}