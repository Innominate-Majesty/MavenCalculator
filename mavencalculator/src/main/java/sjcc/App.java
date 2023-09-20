package sjcc;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        Scanner userInput = new Scanner(System.in);

        double A = 0.0;
        double B = 0.0;

        printMenu(A, B);

        String command;
        do{
            System.out.print("Enter a command: ");
            command = userInput.next().trim();

            switch (command) {
                case "a":
                    System.out.print("Enter the value for A: ");
                    A = userInput.nextDouble();
                    break;
                case "b":
                    System.out.print ("Enter the value for B: ");
                    B = userInput.nextDouble();
                    break;
                case "+":
                    System.out.println("Result: " + String.format("%.3f", A + B));
                    break;
                case "-":
                    System.out.println("Result: " + String.format("%.3f", A - B));
                    break;
                case "*":
                    System.out.println("Result: " + String.format("%.3f", A * B));
                    break;
                case "/":
                    System.out.println("Result: " + String.format("%.3f", A / B));
                    break;
                case "q":
                    System.out.println("Quitting..........");
                    break;
                default:
                    System.out.println("ERROR"); 

            }

            printMenu(A, B);

        }

        while (!command.equals("q"));

        userInput.close();
    }

    public static void printMenu(double A, double B){
        System.out.println("****************************************\n");
        System.out.println("    Chavvi Calculator    \n");
        System.out.println("****************************************\n");
        System.out.printf("    A = %.4f    |    B = %.4f%n", A, B);
        System.out.println("****************************************\n");
        System.out.println("a    :    add value for A\n");
        System.out.println("b    :    add value for B\n");
        System.out.println("+    :    addition\n");
        System.out.println("-    :    subtraction\n");
        System.out.println("*    :    multiplication\n");
        System.out.println("/    :    division\n");
        System.out.println("c    :    clear\n");
        System.out.println("q    :    quit\n");
        System.out.println("****************************************\n");

    }
}
