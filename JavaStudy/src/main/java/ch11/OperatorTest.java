package ch11;

public class OperatorTest {
    public static void main(String[] args) {
        int gameScore = 150;
        int lastScore = ++gameScore;    // gameSocre += 1; gameScore = gameScore + 1;

        System.out.println(gameScore);  // 151
        System.out.println(lastScore);  // 151

        lastScore = gameScore++;

        System.out.println(gameScore);  // 152
        System.out.println(lastScore);  // 151
    }
}
