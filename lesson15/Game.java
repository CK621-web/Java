package lesson15;

public class Game {
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;

    public Game() {
        this.levelOne = new Level();
        this.levelTwo = new Level();
        this.levelThree = new Level();
    }

    public boolean isBonus() {
        return Math.random() > 0.8;
    }

    public void play() {
    }

    public int getScore() {
        int totalScore = 0;

        if (levelOne.goalReached()) {
            totalScore += levelOne.getPoints();
        }

        if (levelOne.goalReached() && levelTwo.goalReached()) {
            totalScore += levelTwo.getPoints();
        }

        if (levelOne.goalReached() && levelTwo.goalReached() && levelThree.goalReached()) {
            totalScore += levelThree.getPoints();
        }

        if (this.isBonus()) {
            totalScore *= 3;
        }

        return totalScore;
    }

    public int playManyTimes(int num) {
        int highestScore = Integer.MIN_VALUE;

        for (int i = 0; i < num; i++) {
            this.play();
            int currentScore = this.getScore();

            if (currentScore > highestScore) {
                highestScore = currentScore;
            }
        }
        return highestScore;
    }

    public static void main(String[] args) {
        System.out.println("Testing getScore");
        Game game1 = new Game();
        System.out.println("Score for game1: " + game1.getScore());

        System.out.println("Testing playManyTimes");
        Game game2 = new Game();
        int numSimulations = 10;
        System.out.println("Simulating " + numSimulations + " games");
        int highestScoreAchieved = game2.playManyTimes(numSimulations);
        System.out.println("Highest score in " + numSimulations + " simulations: " + highestScoreAchieved);

        Game game3 = new Game();
        int numSimulations2 = 1000;
        System.out.println("\nSimulating " + numSimulations2 + " games");
        int highestScoreAchieved2 = game3.playManyTimes(numSimulations2);
        System.out.println("Highest score in " + numSimulations2 + " simulations: " + highestScoreAchieved2);
    }
}
