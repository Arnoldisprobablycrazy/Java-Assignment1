/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment;

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {
        // Create scanner to read user input from console
        Scanner scanner = new Scanner(System.in);
        //create variables and specify conditions using for loop
        int maxAttempts = 3;
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.println("Attempt " + attempt + ": Enter your username:");
            //add new line for second attempt
            String enteredUsername = scanner.nextLine();
             //prompt user to enter username
            System.out.println("Enter your password:");
            //declare maskPasswordInput
            String enteredPassword = maskPasswordInput(scanner);
            // Executes true when both inputs are true 
            if (isValidLogin(enteredUsername, enteredPassword)) {
                System.out.println("Login successful! Welcome, " + enteredUsername + ".");
                break;
            } else {
                System.out.println("Login failed. Please try again.");
                //shows how many attempts are remaining after failed attempt
                if (attempt < maxAttempts) {
                    System.out.println("You have " + (maxAttempts - attempt) + " attempts remaining.\n");
                } else {
                    System.out.println("Maximum attempts reached. Account locked.");
                }
            }
        }

        scanner.close();
    }
    //create new class to maask input for password
    private static String maskPasswordInput(Scanner scanner) {
        // Masking password with '*' while receiving it each character
        char[] passwordChars = scanner.nextLine().toCharArray();
        StringBuilder maskedPassword = new StringBuilder();

        for (char c : passwordChars) {
            System.out.print("*");
            maskedPassword.append(c);
        }
        System.out.println(); // Move to the next line after masking

        return maskedPassword.toString();
    }

    private static boolean isValidLogin(String enteredUsername, String enteredPassword) {
        // actual authentication logic
        return "enteredUsername".equals(enteredUsername) && "enteredPassword".equals(enteredPassword);
    }
}
