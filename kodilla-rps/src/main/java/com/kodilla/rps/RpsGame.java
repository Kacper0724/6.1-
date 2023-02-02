package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsGame {
    Scanner scanner = new Scanner(System.in);
    Random generator = new Random();
    boolean end = false;
    boolean choosePlay = false;
    String playerOneNickName = "";
    String playerTwoNickName = "Computer";
    int playerOneMove = 0;
    int playerOneRoundsWin = 0;
    int playerTwoMove = 0;
    int playerTwoRoundsWin = 0;
    int numberOfWonRounds = 0;

    public void mainMenu() {
        System.out.println("=======>ROCK, PAPER, SCISSORS<=======");
        System.out.println("-------------Instruction-------------");
        System.out.println("--------------1 - Rock---------------");
        System.out.println("--------------2 - Paper--------------");
        System.out.println("------------3 - Scissors-------------");
        System.out.println("------------n - New game-------------");
        System.out.println("------------x - End game-------------");
    }

    public void gameBody() {
        mainMenu();
        System.out.print("Entry your nick name: ");
        playerOneNickName = scanner.nextLine();
        System.out.print("Enter the number of rounds won: ");
        numberOfWonRounds = scanner.nextInt();
        while (!end) {
            System.out.print(playerOneNickName + " move: ");
            playerOneMove = scanner.nextInt();
            playerMove();
            System.out.print(playerTwoNickName + " move: ");
            playerTwoMove = generator.nextInt(1, 4);
            computerMove();
            gameRules(playerOneMove, playerTwoMove);
            System.out.println(playerOneNickName + " " + playerOneRoundsWin + "::" + playerTwoRoundsWin + " " + playerTwoNickName);
            if (playerOneRoundsWin == numberOfWonRounds || playerTwoRoundsWin == numberOfWonRounds) {
                end = true;
            }
        }
        end = false;
        playerOneRoundsWin = 0;
        playerTwoRoundsWin = 0;
        choosePlayAgainOrExitGame();
    }

    public void choosePlayAgainOrExitGame(){
        System.out.println("Do you want play again? (yes/no)");
        while (!choosePlay) {
            String choose = scanner.nextLine();
            if (choose.equals("yes")) {
                System.out.println("Are you sure want play again? (yes/no)");
                String playAgainChoose = scanner.nextLine();
                if (playAgainChoose.equals("yes")) {
                    choosePlay = true;
                    gameBody();
                } else if (playAgainChoose.equals("no")) {
                    choosePlay = true;
                    System.exit(0);
                }
            } else if (choose.equals("no")) {
                System.out.println("Are you sure want end the game? (yes/no)");
                String exitChose = scanner.nextLine();
                if (exitChose.equals("yes")) {
                    choosePlay = true;
                    System.exit(0);
                } else if (exitChose.equals("no")) {
                    choosePlay = true;
                    gameBody();
                }
            }
        }
        choosePlay = false;
    }

    public void playerMove() {
        if (playerOneMove == 1) {
            Rock rock = new Rock();
            System.out.println(playerOneNickName + rock.getObjectName());
        } else if (playerOneMove == 2) {
            Paper paper = new Paper();
            System.out.println(playerOneNickName + paper.getObjectName());
        } else if (playerOneMove == 3) {
            Scissors scissors = new Scissors();
            System.out.println(playerOneNickName + scissors.getObjectName());
        } else {
            System.out.println("Choose number 1-3!");
        }
    }

    public void computerMove() {
        if (playerTwoMove == 1) {
            Rock rock = new Rock();
            System.out.println(playerTwoNickName + rock.getObjectName());
        } else if (playerTwoMove == 2) {
            Paper paper = new Paper();
            System.out.println(playerTwoNickName + paper.getObjectName());
        } else if (playerTwoMove == 3) {
            Scissors scissors = new Scissors();
            System.out.println(playerTwoNickName + scissors.getObjectName());
        }
    }

    public int gameRules(int a, int b) {
        if (a == b) {
            System.out.println("Draw!");
        } else if (a == 1 && b == 2 || a == 2 && b == 3 || a == 3 && b == 1) {
            System.out.println(playerTwoNickName + " win!");
            playerTwoRoundsWin++;
            return b;
        } else if (a == 1 && b == 3 || a == 2 && b == 1 || a == 3 && b == 2) {
            System.out.println(playerOneNickName + " win!");
            playerOneRoundsWin++;
            return a;
        }
        return 0;
    }
}
