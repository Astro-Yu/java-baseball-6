package baseball.Model;

import static baseball.Constants.Constants.NUMBERS_SIZE;
import static baseball.Constants.ErrorMessages.INVALID_DUPLICATED_MESSAGE;
import static baseball.Constants.ErrorMessages.INVALID_INPUT_RANGE_MESSAGE;
import static baseball.Constants.ErrorMessages.INVALID_INPUT_SIZE_MESSAGE;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeNumbers {

    private List<Integer> threeNumbers;

    public ThreeNumbers(List<Integer> threeNumbers) {
        validateThreeNumbers(threeNumbers);
        this.threeNumbers = threeNumbers;
    }

    public List<Integer> getNumbers() {
        return this.threeNumbers;
    }

    private void validateThreeNumbers(List<Integer> input) {
        checkRange(input);
        checkSize(input);
        checkDuplicate(input);
    }

    private void checkSize(List<Integer> input) {
        if (!properSize(input)) {
            throw new IllegalArgumentException(INVALID_INPUT_SIZE_MESSAGE.getMessage());
        }
    }

    private void checkRange(List<Integer> input) {
        if (!properRange(input)) {
            throw new IllegalArgumentException(INVALID_INPUT_RANGE_MESSAGE.getMessage());
        }
    }

    private void checkDuplicate(List<Integer> input) {
        if (isDuplicated(input)) {
            throw new IllegalArgumentException(INVALID_DUPLICATED_MESSAGE.getMessage());
        }
    }

    private boolean properSize(List<Integer> input) {
        return input.size() == NUMBERS_SIZE;
    }

    private boolean properRange(List<Integer> input) {
        return input.stream()
                .allMatch(x -> x > 0 && x <= 9);
    }

    private boolean isDuplicated(List<Integer> input) {
        Set compareNumber = new HashSet<>(input);

        return compareNumber.size() != input.size();
    }
}
