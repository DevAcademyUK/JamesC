import java.util.Random;
import java.util.Scanner;



public class singAnotherSong{

    private void singAgain(){

        Scanner myScanner = new Scanner(System.in);
        System.out.println("How many ducks?");
        int ducks = myScanner.nextInt();

            String word = "ducks";
            for(int i = ducks; i > 0; i--) {

                System.out.println(" " + i + " little ducks went swimming one day");
                System.out.println("over the hill and far away");
                System.out.println("Mother duck said, “Quack quack quack quack”");

                if (i == 1) {
                    System.out.println("And all the other little ducks came back (with strange and wonderful super powers).");
                    System.out.println("At first they went about their average and normal lives. But soon they desired more");
                    System.out.println("They fashioned new decorative garments, masks and capes.");
                }
                    else {
                    int newNum = i - 1;
                    if (newNum == 1) {
                        word = "pancakes";
                    }
                    System.out.println();

                }

            }
    }


    public static class rockPaperScissors {

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

            System.out.println();
            System.out.println("One of the ducks pulls out a perfectly formed mutant hand...");
            System.out.println("He approaches you and challenges you to a game of rock paper scissors!");

            System.out.println("What is your name fair human? ");
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
            String botsMove = "The mutant duck chose ";
            switch(i){
                case 0:
                    move = "Rock";
                    System.out.println(botsMove + move);
                    break;

                case 1:
                    move = "Paper";
                    System.out.println(botsMove + move);
                    break;

                case 2:
                    move = "Scissors";
                    System.out.println(botsMove + move);
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
    public static void main(String[] args) {
        singAnotherSong duckSong = new singAnotherSong();
        duckSong.singAgain();
        rockPaperScissors game = new rockPaperScissors();
        game.initialiseGame();









    }
}
