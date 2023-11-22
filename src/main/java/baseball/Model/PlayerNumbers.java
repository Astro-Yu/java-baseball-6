package baseball.Model;

import java.util.List;

public class PlayerNumbers {

    ThreeNumbers threeNumbers;

    public PlayerNumbers(ThreeNumbers threeNumbers) {
        this.threeNumbers = threeNumbers;
    }

    public List<Integer> getPlayerNumbers() {
        return threeNumbers.getNumbers();
    }
}
