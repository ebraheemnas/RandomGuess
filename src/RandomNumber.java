import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

    public static void Game () {


        Random Number = new Random();
        int maxNumber = 100;
        int randomNumber = Number.nextInt(maxNumber) + 1;
        boolean win = false;


        try {

            while (!win) {


                Scanner scanner = new Scanner(System.in);
                System.out.println("Please enter your guess:");
                int input = scanner.nextInt();


                if (input == randomNumber) {
                    System.out.println("You win!");
                    win = true;

                } else if (input > randomNumber) {
                    System.out.println("Too big!");
                } else {
                    System.out.println("Too small!");
                }

            }


        } catch (InputMismatchException exception) {
            System.out.println("Not a number - Try again!");
            Game();

        }


        System.out.println("Play another round? [y/N]");
        Scanner sc = new Scanner(System.in);      //System.in is a standard input stream
        String str = sc.nextLine();              //reads string


        while (str.equals("y") || str.equals("Y")) {
            Game();
        }

        if (str.equals("n") || str.equals("N")) {
            System.out.println("GOODBYE!");
        }



    }



    public static void main(String[] args) {

        System.out.println("Welcome!");
        Game();

    }
}
