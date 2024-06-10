package com.laxma;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.print("Enter your choice (r/p/s): ");
            String playerChoice = scanner.nextLine();

            String computerChoice = "";
            int computerNumber = random.nextInt(3);
            if (computerNumber == 0) {
                computerChoice = "r";
            } else if (computerNumber == 1) {
                computerChoice = "p";
            } else {
                computerChoice = "s";
            }

            System.out.println("Computer picked: " + computerChoice);

            String result = checkWinner(playerChoice, computerChoice);
            System.out.println(result);

            System.out.print("Play again (y/n)? ");
            String playAgain = scanner.nextLine();
            if (!playAgain.equalsIgnoreCase("y")) {
                break;
            }
        }

        scanner.close();
    }

    public static String checkWinner(String player, String computer) {
        if (player.equals(computer)) {
            return "Tie!";
        } else if (player.equals("r") && computer.equals("s")
                || player.equals("p") && computer.equals("r")
                || player.equals("s") && computer.equals("p")) {
            return "You won!";
        }
        return "Computer won!";
    }
}