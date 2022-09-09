package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	int num = 1;
        double num1;
        double num2;
Scanner userInput = new Scanner(System.in);

        System.out.println("Enter first number: ");
        num1 = userInput.nextDouble();
        System.out.println("Enter second number: ");
        num2 = userInput.nextDouble();
        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = userInput.next().charAt(0);
// w ten sposób obsługujemy znaki z inputu użytkowanika, 0 oznacza to że zostanie użyty tylko 1

        double result;

        switch (operator){

            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Wrong operator");

                return;
        }
//        System.out.println(num1 +  " " + operator + " " + num2 + " = " + result);
        System.out.println(num1 + operator + num2 + " = " + result);
    }
}
