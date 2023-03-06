package homework7.Task5;

import java.util.Scanner;

public class Task5 {


    public static void main(String[] args) {
        final String EQUAL = " = ";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();

        System.out.print("Enter an operator (+, -, *, /): ");
        String operator = scanner.next();
        switch (operator) {
            case "+":
                System.out.println(a + " + " + b + EQUAL + Calculator.add(a, b));
                break;
            case "-":
                System.out.println(a + " - " + b + EQUAL + Calculator.subtract(a, b));
                break;
            case "*":
                System.out.println(a + " * " + b + EQUAL + Calculator.multiply(a, b));
                break;
            case "/":
                System.out.println(a + " / " + b + EQUAL + Calculator.divide(a, b));
                break;
            default:
                System.out.println("Error! Enter correct operator ");
        }
    }
}


