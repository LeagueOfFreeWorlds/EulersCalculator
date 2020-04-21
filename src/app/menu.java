package app;
import java.util.Scanner;

public class menu {
   static Calculation calc = new Calculation(); // Calculator object
    public static void printMenu(){
        Scanner sc = new Scanner(System.in); // Scanner object
        int choice = 0;
        System.out.println("Welcome to Euler's formula, please select an option!");
        while(choice != 4){
            System.out.println("1. Solve for e^i");
            System.out.println("2. Solve for cos");
            System.out.println("3. Solve for sin");
            System.out.println("4. Quit Euler's Calculator");
            choice = sc.nextInt();
            if(choice == 1){
                System.out.println("Enter the value of x");
                double x = sc.nextDouble();
                calc.forE(x);
            }

        }

    }

}