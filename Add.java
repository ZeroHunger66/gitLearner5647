import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user for the first number
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        
        // Prompt the user for the second number
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        
        // Calculate the sum using the arithmetic operator
        int sum = num1 + num2;
        
        // Display the final output
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        
        // Close the scanner resource
        input.close();