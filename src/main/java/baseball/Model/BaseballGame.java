package baseball.Model;

import baseball.Constants.Constants;
import java.util.Objects;

public class BaseballGame {
    public BaseballGame() {
    }

    public GameResult calculateResult(CpuNumbers cpuNumbers, PlayerNumbers playerNumbers) {
        int strikes = getStrikes(cpuNumbers, playerNumbers);
        int balls = getBalls(cpuNumbers, playerNumbers);
        GameResult gameResult = new GameResult();
        gameResult.setResult(strikes, balls);

        return gameResult;
    }

    private int getStrikes(CpuNumbers cpuNumbers, PlayerNumbers playerNumbers) {
        int strikes = 0;
        for (int i = 0; i < Constants.NUMBERS_SIZE; i++) {
            if (Objects.equals(cpuNumbers.getCpuNumbers().get(i), playerNumbers.getPlayerNumbers().get(i))) {
                ++strikes;
            }
        }
        return strikes;
    }

    private int getBalls(CpuNumbers cpuNumbers, PlayerNumbers playerNumbers) {
        int balls = 0;
        for (int i = 0; i < Constants.NUMBERS_SIZE; i++) {
            if (cpuNumbers.getCpuNumbers().get(i) != playerNumbers.getPlayerNumbers().get(i)
                    && playerNumbers.getPlayerNumbers().contains(cpuNumbers.getCpuNumbers().get(i))) {
                ++balls;
            }
        }
        return balls;
    }
}

