import java.util.Scanner;   // Activing the SCANNER Library

public class SwapNumbers {
    public static void main(String[] args) {

        int firstNumber, secondNumber, temporary;     // Declaring the Variables

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the First Number: ");   firstNumber = input.nextInt();     // Receiving Input from the user
        System.out.print("Enter the Second Number: ");   secondNumber = input.nextInt();     // Receiving Input from the user

        System.out.println("\n\n\n***** Before SWAP *****");
        System.out.println("The FIRST Number is " + firstNumber + ".");
        System.out.println("The SECOND Number is " + secondNumber + ".");

        temporary = firstNumber;   // Value of 'firstNumber' is assigned to 'temporary' variable.
        firstNumber = secondNumber;   // Value of 'secondNumber' is assigned to 'firstNumber' variable.
        secondNumber = temporary;   // Value of 'temporary'(which contains the initial value of 'firstNumber') is assigned to 'secondNumber'.

        System.out.println("\n***** After SWAP *****");
        System.out.println("The FIRST Number is " + firstNumber + ".");
        System.out.println("The SECOND Number is " + secondNumber + ".");
    }
}