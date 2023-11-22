package baseball.View;

import static baseball.Constants.ErrorMessages.INVALID_BLANK_MESSAGE;
import static baseball.Constants.ErrorMessages.INVALID_EMPTY_MESSAGE;
import static baseball.Constants.ErrorMessages.INVALID_INPUT_MESSAGE;
import static baseball.Utils.Utils.splitNumber;

import java.util.List;

public class InputViewValidator {

    public static void checkEmpty(String input) {
        if (isEmpty(input)) {
            throw new IllegalArgumentException(INVALID_EMPTY_MESSAGE.getMessage());
        }
    }

    public static void checkBlack(String input) {
        if (isBlank(input)) {
            throw new IllegalArgumentException(INVALID_BLANK_MESSAGE.getMessage());
        }
    }

    public static void checkDigit(String input) {
        if (!isDigit(input)) {
            throw new IllegalArgumentException(INVALID_INPUT_MESSAGE.getMessage());
        }
    }

    private static boolean isEmpty(String input) {
        return input.isEmpty();
    }

    private static boolean isBlank(String input) {
        return input.isBlank();
    }

    private static boolean isDigit(String input) {
        List<String> inputNumbers = splitNumber(input);

        return inputNumbers
                .stream().allMatch(x -> Character.isDigit(x.charAt(0)));
    }
}
