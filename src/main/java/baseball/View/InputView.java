package baseball.View;

import static baseball.Utils.Utils.splitNumber;
import static baseball.View.InputViewValidator.checkBlack;
import static baseball.View.InputViewValidator.checkDigit;
import static baseball.View.InputViewValidator.checkEmpty;

import baseball.Constants.InputMessages;
import baseball.Constants.OutputMessages;
import camp.nextstep.edu.missionutils.Console;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {
    private InputView() {

    }

    public static void printStartMessage() {
        System.out.println(InputMessages.START_MESSAGE);
    }

    public static List<Integer> getInsertNumbers() {
        System.out.printf(InputMessages.INSERT_NUMBERS);
        String input = Console.readLine();
        validateNumbers(input);

        return splitNumber(input).stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    public static String AskContinue() {
        System.out.println(OutputMessages.ASK_CONTINUE);
        String input = Console.readLine();
        validateNumbers(input);
        return input;
    }

    private static void validateNumbers(String input) {
        checkBlack(input);
        checkEmpty(input);
        checkDigit(input);
    }
}
