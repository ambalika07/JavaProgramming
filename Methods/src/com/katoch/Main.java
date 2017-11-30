package com.katoch;

public class Main {

    public static void main(String[] args) {

            int finalScore = calculateScore(true, 800, 5, 100 );
            System.out.println("Your final score was " + finalScore);

            finalScore = calculateScore( true, 10000, 8, 200);
            System.out.println("Your final score was " + finalScore);

            int highScorePosition = calculateHighScorePosition(1500);
            displayHighScorePosition("Shaun", highScorePosition);

            highScorePosition = calculateHighScorePosition(900);
            displayHighScorePosition("Tim", highScorePosition);

            highScorePosition = calculateHighScorePosition(400);
            displayHighScorePosition("Jack", highScorePosition);

            highScorePosition = calculateHighScorePosition(50);
            displayHighScorePosition("Bob", highScorePosition);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            //System.out.println("Your final score was " + finalScore);
            return finalScore;

        } else {
            return -1;
        }
    }


    public static void displayHighScorePosition (String PlayersName, int Position ){
        System.out.println(PlayersName + " managed to get into position " + Position + " on the high score table");
    }

    public static int calculateHighScorePosition( int playerScore){
        if (playerScore >= 1000){
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000){
            return 2;
        } else if (playerScore >= 100 && playerScore < 500){
            return 3;
        } else {
            return 4;
        }
    }
}

