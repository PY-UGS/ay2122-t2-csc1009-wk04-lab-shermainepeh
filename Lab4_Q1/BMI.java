package Lab4_Q1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BMI {

    static Scanner userInput = new Scanner(System.in);

    public static void main (String[] args) {
        System.out.print("Enter weight in pounds: ");
        int weight = checkInputForInt();

        System.out.print("Enter height in inches: ");
        int height = checkInputForInt();

        BMI_Properties BMI = new BMI_Properties(weight, height);
        System.out.println("BMI is " + BMI.getBMI());

        System.out.println(BMI.getInterpretation());
    }

    public static int checkInputForInt() {
        while(true)
        {
            try {
                return userInput.nextInt();
            } catch (InputMismatchException ex) {
                userInput.next();
                System.out.println("Not a valid number!");
                System.out.println("Please re-enter: ");
            }
        }
    }
}