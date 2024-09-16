package Collection_ExceptionHandling;

import java.util.Scanner;


class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}

public class MultipleExceptionHandling {

 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     String[] names = new String[3];  

     try {
         
         System.out.println("First name (null case): " + names[0].toUpperCase());

     } catch (NullPointerException e) {
         System.out.println("Caught NullPointerException: Cannot call method on a null reference.");
     }

     try {
         
         System.out.print("Enter a number to divide 100 by: ");
         int number = scanner.nextInt();
         int result = 100 / number;
         System.out.println("Result of division: " + result);

     } catch (ArithmeticException e) {
         System.out.println("Caught ArithmeticException: Cannot divide by zero.");
     }

     try {
        
         System.out.print("Enter your age: ");
         int age = scanner.nextInt();
         checkAge(age);

     } catch (InvalidAgeException e) {
         System.out.println("Caught InvalidAgeException: " + e.getMessage());
     }

     System.out.println("Program continues...");
 }

 
 public static void checkAge(int age) throws InvalidAgeException {
     if (age < 0) {
         throw new InvalidAgeException("Age cannot be negative.");
     } else {
         System.out.println("Valid age entered: " + age);
     }
 }
}

