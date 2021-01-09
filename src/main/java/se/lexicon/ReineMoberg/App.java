package se.lexicon.ReineMoberg;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String operationType;
        int firstNumber;
        int secondNumber;
        int result;
        long mulResult;
        float divResult;
        boolean userContinue = true;

        Calculator calculator = new CalculatorImpl();   //Interface as data type
        calculator.menu();
        while (userContinue) {
            System.out.println("Enter type of operation ('+', '-', '*', '/', or quit 'q'):");
            operationType = calculator.userInput.next();
            if (!operationType.equals("q")) {
                System.out.println("Enter first number:");
                firstNumber = calculator.userInput.nextInt();
                System.out.println("Enter second number:");
                secondNumber = calculator.userInput.nextInt();
                switch (operationType) {
                    case "+":
                        result = calculator.addition(firstNumber, secondNumber);
                        System.out.println("Result: " + result + "\n");
                        break;
                    case "-":
                        result = calculator.subtraction(firstNumber, secondNumber);
                        System.out.println("Result: " + result + "\n");
                        break;
                    case "*":
                        mulResult = calculator.multiplication(firstNumber, secondNumber);
                        System.out.println("Result: " + mulResult + "\n");
                        break;
                    case "/":
                        divResult = calculator.division(firstNumber, secondNumber);
                        System.out.println("Result: " + divResult + "\n");
                        break;
                    default:
                        System.out.println("Operation is not valid.\n");
                }
            } else {
                System.out.println("Ok, see you.");
                userContinue = false;
            }
        }
    }
}
