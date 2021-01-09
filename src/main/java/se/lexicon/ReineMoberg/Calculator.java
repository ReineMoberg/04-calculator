package se.lexicon.ReineMoberg;

import java.util.Scanner;

//A simple calculator. Can be replaced by a more advanced calculator in the future
public interface Calculator {

    static final Scanner userInput = new Scanner(System.in);    //Global constant for all implementing the interface

    //Defined methods without implementations
    int addition(int num1, int num2);
    int subtraction(int num1, int num2);
    long multiplication(int num1, int num2);
    float division(int num1, int num2);

    //It can work with the (static) methods here,
    //but it is not appropriate in this case
    /*static String operationType() {
        System.out.println("Enter type of operation ('+', '-', '*', '/', or quit 'q'):");
        return userInput.next();
    }
    static int firstNumber(){
        System.out.println("Enter first number:");
        return userInput.nextInt();
    }
    static int secondNumber(){
        System.out.println("Enter second number:");
        return userInput.nextInt();
    }*/

    //Default method with implementation.
    //Is present, and reachable, in all classes implementing interface
    default void menu(){
        System.out.println("Welcome to calculator.");
    }
}
