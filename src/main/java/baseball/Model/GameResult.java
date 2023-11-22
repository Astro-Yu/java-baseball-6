package baseball.Model;

import static baseball.Constants.Constants.BALL_INDEX;
import static baseball.Constants.Constants.END_STRIKES;
import static baseball.Constants.Constants.STRIKE_INDEX;

import java.util.ArrayList;
import java.util.List;

public class GameResult {

    List<Integer> gameResult;

    public GameResult() {
        this.gameResult = new ArrayList<>(List.of(0, 0));
    }

    public List<Integer> getGameResult() {
        return this.gameResult;
    }

    public void setResult(int strikes, int balls) {
        gameResult.set(STRIKE_INDEX, strikes);
        gameResult.set(BALL_INDEX, balls);
    }

    public boolean isEndGame() {
        return gameResult.get(STRIKE_INDEX) == END_STRIKES;
    }

    public boolean onlyStrikes() {
        return gameResult.get(STRIKE_INDEX) != 0 && gameResult.get(BALL_INDEX) == 0;
    }

    public boolean onlyBalls() {
        return gameResult.get(STRIKE_INDEX) == 0 && gameResult.get(BALL_INDEX) != 0;
    }

    public boolean isStrikeAndBalls() {
        return gameResult.get(STRIKE_INDEX) != 0 && gameResult.get(BALL_INDEX) != 0;
    }

    public boolean isNothing() {
        return gameResult.get(STRIKE_INDEX) == 0 && gameResult.get(BALL_INDEX) == 0;
    }
}
