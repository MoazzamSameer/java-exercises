package com.amigoscode._1_beginners._1_thebasics;

import java.util.Scanner;

/**
 * Mini Project: Simple Calculator
 *
 * Put together everything you have learned so far to build a simple calculator.
 * The calculator should display a menu, read the user's choice and two numbers,
 * perform the chosen operation, and print the result.
 */
public class MiniProject {

    public static void main(String[] args) {

        // TODO: 1 - Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);


        // TODO: 2 - Display a menu with the following options:
        // Print:
        //   "=== Simple Calculator ==="
        //   "1. Add"
        //   "2. Subtract"
        //   "3. Multiply"
        //   "4. Divide"
        //   "Choose an operation (1-4): "

        System.out.print( "=== Simple Calculator ===" +
                " 1. Add" +
                " 2. Subtract" +
                " 3. Multiply" +
                " 4. Divide" +
                " Choose an operation (1-4): ");


        // TODO: 3 - Read the user's choice into an int variable
        int choice = scanner.nextInt();


        // TODO: 4 - Prompt and read two double numbers from the user
        // Print "Enter first number: " and read it.
        // Print "Enter second number: " and read it.
        System.out.println("Enter the first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

            if (choice == 1) {
                System.out.println("Sum: " + (firstNumber + secondNumber));
            } else if (choice == 2) {

                System.out.print("Difference: " +( firstNumber - secondNumber));

            }else if (choice == 3) {

                System.out.print("Product:  " + (firstNumber * secondNumber));
            }else if (choice == 4) {
                if (secondNumber == 0) {
                    System.out.println("cannot divide by zero");
                }else {
                    System.out.print("quotient:  " + (firstNumber/ secondNumber));
                }

            }






        // TODO: 5 - Use a switch statement to perform the chosen operation and print the result
        // Case 1: Print "Result: " + (num1 + num2)
        // Case 2: Print "Result: " + (num1 - num2)
        // Case 3: Print "Result: " + (num1 * num2)
        // Case 4: Perform division (but handle division by zero first - see TODO 6)
        // Default: Print "Invalid choice"


        // TODO: 6 - Inside case 4, handle division by zero with an if statement
        // If the second number is 0, print "Error: Cannot divide by zero"
        // Otherwise, print the result of the division

    }
}
