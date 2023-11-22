package baseball.View;

import static baseball.Constants.Constants.BALL_AND_STRIKE;

import baseball.Constants.Constants;
import baseball.Constants.OutputMessages;
import baseball.Model.GameResult;

public class OutputView {

    public static void printEndGame() {
        System.out.println(OutputMessages.END_GAME);
    }

    public static void printResult(GameResult gameResult) {
        int strikes = gameResult.getGameResult().get(0);
        int balls = gameResult.getGameResult().get(1);

        printOnlyStrike(gameResult, strikes);
        printOnlyBalls(gameResult, balls);
        printStrikeAndBalls(gameResult, balls, strikes);
        printNothing(gameResult);
    }

    private static void printOnlyStrike(GameResult gameResult, int strikes) {
        if (gameResult.onlyStrikes()) {
            System.out.println(String.format(Constants.STRIKE, strikes));
        }
    }

    private static void printOnlyBalls(GameResult gameResult, int balls) {
        if (gameResult.onlyBalls()) {
            System.out.println(String.format(Constants.BALL, balls));
        }
    }

    private static void printStrikeAndBalls(GameResult gameResult, int balls, int strikes) {
        if (gameResult.isStrikeAndBalls()) {
            System.out.println(String.format(BALL_AND_STRIKE, balls, strikes));
        }
    }

    private static void printNothing(GameResult gameResult) {
        if (gameResult.isNothing()) {
            System.out.println(Constants.NOTHING);
        }
    }
}
