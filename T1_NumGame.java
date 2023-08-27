//  CodSoft Internship Task 01 - NUMBER GAME

import java.util.Random;
import java.util.Scanner;

public class T1_NumGame {

    public static void game() {

        int userNum, randomNumb;
        randomNumb = (int) (Math.random() * 100);
        Scanner sc = new Scanner(System.in);

        System.out.println("Guess the generated number: - ");

        for (int i = 1; i <= 6; i++) {

            userNum = sc.nextInt();

            if (i > 5) {
                System.out.println("No more Attempts left!\nThe Random Number was - " + randomNumb);
                int again;
                System.out.print("Enter 1 for play again and 0 for exit : ");
                again = sc.nextInt();

                if (again == 1)
                    game();
                else
                    return;
            } else if (userNum == randomNumb) {
                int score = (i / 10);
                System.out.println("Yay! you guessed it correct, within " + i + " attempts🎉🎉");
                System.out.println("Your score is -" + score + " 🎊🥳🎊");
            }

            else if (userNum > randomNumb) {
                System.out.println(i + ". It's too high!");
            }

            else {
                System.out.println(i + ". It's too low!");

            }

        }
    }

    public static void main(String[] args) {

        System.out.println(
                "\n                                    Number is generated, you have 6 attempts to Guess it.\nScore Criteria: 1 Attempt = 10 points,\n2 Attempts = 8 points,\n3 Attempts 5 points,\n4 Attempts = 3 points,\n5 Attempts = 1 point");

        game();

        // System.out.println("The generated number is " + generateNum);

    }
}
