package ie.atu.week2;

import java.util.Scanner;





public class Calculator {


    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);

        //Please first number
        System.out.println("Please enter a number: ");
        double firstNum = scan1.nextDouble();
        System.out.println("You entered " + firstNum);

        //Please enter second number
        System.out.println("Please enter a second number: ");
        double secondNum = scan1.nextDouble();
        System.out.println("You entered " + secondNum);

        System.out.println("Please enter an operation(add, subtract, multiply, divide): ");
        String operation = scan1.next();

        boolean validOperation = true;
        double result = switch (operation) {
            case "add" -> {
                yield firstNum + secondNum;
            }
            case "subtract" -> {
                yield firstNum - secondNum;
            }
            case "multiply" -> {
                yield firstNum * secondNum;
            }
            case "divide" -> {
                yield firstNum / secondNum;
            }

            default -> {
                System.out.println("Invalid operation");
                yield 0;
            }

        };
        System.out.println("The answer is " + result);
    }

}