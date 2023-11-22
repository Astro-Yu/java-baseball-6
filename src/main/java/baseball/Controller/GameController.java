package baseball.Controller;

import static baseball.Utils.Utils.getRandomNumbers;

import baseball.Model.BaseballGame;
import baseball.Model.CpuNumbers;
import baseball.Model.GameResult;
import baseball.Model.PlayerNumbers;
import baseball.Model.ThreeNumbers;
import baseball.View.InputView;
import baseball.View.OutputView;
import java.util.List;

public class GameController {
    private boolean continueGame = true;

    public void runGame() {
        InputView.printStartMessage();
        CpuNumbers cpuNumbers = new CpuNumbers(new ThreeNumbers(getRandomNumbers()));
        while (continueGame) {
            singleGame(cpuNumbers);
        }
    }

    private void singleGame(CpuNumbers cpuNumbers) {
        List<Integer> inputNumbers = InputView.getInsertNumbers();
        PlayerNumbers playerNumbers = new PlayerNumbers(new ThreeNumbers(inputNumbers));
        BaseballGame baseballGame = new BaseballGame();
        GameResult gameResult = baseballGame.calculateResult(cpuNumbers, playerNumbers);

        OutputView.printResult(gameResult);
        checkGameEnd(gameResult);
    }

    private void checkGameEnd(GameResult gameResult) {
        if (gameResult.isEndGame()) {
            OutputView.printEndGame();
            String input = InputView.AskContinue();
            runGameAgain(input);
        }

    }

    private void runGameAgain(String input) {
        if (input.equals("1")) {
            runGame();
        }
        if (input.equals("2")) {
            continueGame = false;
        }
    }
}
