import java.util.Scanner;

public class JavaCalculator
{
    public static void main(String args [])
    {
        double firstNumber;
        double secondNumber;
        String operationType;
        String repeatAnswer;

        while(true){

        System.out.println("Welcome to the Java Calculator!");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        
        while(!input.hasNextDouble())
        {
            System.out.println("Invalid input. Please enter a number.");
            input.nextLine();
        }

        firstNumber = input.nextDouble();
        System.out.println("Enter second number: ");
        while(!input.hasNextDouble())
        {
            System.out.println("Invalid input. Please enter a number.");
            input.nextLine();
        }
        secondNumber = input.nextDouble();

        {
            boolean understood;
            do
            {
                understood = false;
        System.out.println("Choose an operation type (+, -, * , / , exit)");
        operationType = input.next();
        {
        switch(operationType)
        {
            case("+") :
            System.out.println(firstNumber + " + " + secondNumber + " is: ");
            System.out.println(firstNumber + secondNumber);
            understood = true;
            break;

            case("-") :
            System.out.println(firstNumber + " - " + secondNumber + " is: ");
            System.out.println(firstNumber - secondNumber);
            understood = true;
            break;

            case("*") :
            System.out.println(firstNumber + " * " + secondNumber + " is: ");
            System.out.println(firstNumber * secondNumber);
            understood = true;
            break;

            case("/") :
            if(secondNumber != 0)
            {
            System.out.println(firstNumber + " / " + secondNumber + " is: ");
            System.out.println(firstNumber / secondNumber);
            understood = true;
            }
            else
            {
            System.out.println("Error: Cannot divide by zero");
            }
            break;
            

            case("exit") :
            understood = true;
            System.out.println("Thank you for using the Java Calculator. Goodbye!");
            System.exit(0);
            break;

            default :
            System.out.println("Invalid operation. Please enter a valid operation type.");
            break;
        }
        }
    } while(!understood);
    


        }
         boolean invalidAnswer = false;
        do
        {
            invalidAnswer = false;
        System.out.println("Would you like to enter another equation? (yes/no)");
        repeatAnswer = input.next();
        switch(repeatAnswer)
        {
            case("yes") :
            invalidAnswer = true;
            break;

            case("no") :
            System.out.println("Thank you for using the Java Calculator!");
            invalidAnswer = true;
            System.exit(0);
            break;

            default :
            System.out.println("Please enter yes or no.");
            invalidAnswer = false;
            break;
        }
    } while(!invalidAnswer);
        

    }
    
}
}