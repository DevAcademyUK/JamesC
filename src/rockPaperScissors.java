package Games;

import java.util.Random;
import java.util.Scanner;

public class rockPaperScissors {

    //can this also be a private class?
    String playerName;
    String playerMove;
    String computerMove;
    int score;
    Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args){
        rockPaperScissors rps = new rockPaperScissors();
        rps.initialiseGame();
    }


    private void initialiseGame(){

        System.out.println("Enter your name: ");
        playerName = myScanner.nextLine();
        playGame();        //Answer: James but I do look like a Tom
    }
//a constructor to build the win/loss portion of the game
    private void playGame(){
        System.out.println("Enter your move: ");
        playerMove = myScanner.nextLine();
        System.out.println(playerName + " has selected " + playerMove + " as their move");
        computerMove = generateComputerMove();
        String result = getWinner(playerMove, computerMove);
        if(result.equalsIgnoreCase("Win")){
            System.out.println("Congratulations, you won this round!");
            score++;
        }
        else if(result.equalsIgnoreCase("Lose")){
            System.out.println("You lost this round!");
            score--;
        }
        else {
            System.out.println("This round was a draw!");
        }

        if(score < 3 && score > -3){
            playGame();
        }
        else if(score == 3){
            System.out.println("Winner Winner!!");
        }
        else if(score == -3){
            System.out.println("You Looooooosssseeeee!");   //all right Dean, rub it in
        }

    }
//a constructor for the computer's decision.
    private String generateComputerMove() {
        Random r = new Random();
        String move = "";
        int i = r.nextInt(3);
        switch(i){
            case 0:
                move = "Rock";
                break;

            case 1:
                move = "Paper";
                break;

            case 2:
                move = "Scissors";
                break;
        }
        return move;
    }
//a constructor for the outcome
    private String getWinner(String playerMove, String computerMove){
        String outcome = "";
        if(playerMove.equalsIgnoreCase("rock")){
            if(computerMove.equalsIgnoreCase("rock")){
                outcome = "Draw";
            }
            else if(computerMove.equalsIgnoreCase("paper")){
                outcome = "Lose";
            }
            else{
                outcome = "Win";
            }
        }
        if(playerMove.equalsIgnoreCase("paper")){
            if(computerMove.equalsIgnoreCase("rock")){
                outcome = "Win";
            }
            else if(computerMove.equalsIgnoreCase("paper")){
                outcome = "Draw";
            }
            else{
                outcome = "Lose";
            }
        }
        if(playerMove.equalsIgnoreCase("scissors")){
            if(computerMove.equalsIgnoreCase("rock")){
                outcome = "Lose";
            }
            else if(computerMove.equalsIgnoreCase("paper")){
                outcome = "Win";
            }
            else{
                outcome = "Draw";
            }
        }
        //present the verdict
        return outcome;
    }
}

