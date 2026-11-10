package com.example.vvce.calsi;

/**
 * Hello world!
 */
public class App {
	public static double add(double a, double b) {
    return a + b;
}

public static double subtract(double a, double b) {
    return a - b;
}

public static double multiply(double a, double b) {
    return a * b;
}

public static double divide(double a, double b) {
    if (b == 0) {
        throw new IllegalArgumentException(
            "Cannot divide by zero"
        );
    }
    return a / b;
}

public static void main(String[] args) {

    System.out.println("Java Maven Calculator");

    System.out.println("Addition: " + add(10, 5));
    System.out.println("Subtraction: " + subtract(10, 5));
    System.out.println("Multiplication: " + multiply(10, 5));
    System.out.println("Division: " + divide(10, 5));
}
}
