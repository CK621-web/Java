package lesson15;

public class Level {
    public boolean goalReached() {
        return Math.random() > 0.5;
    }

    public int getPoints() {
        return (int) (Math.random() * 100) + 10;
    }
}
