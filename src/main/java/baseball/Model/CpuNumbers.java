package baseball.Model;

import java.util.List;

public class CpuNumbers {

    ThreeNumbers threeNumbers;

    public CpuNumbers(ThreeNumbers threeNumbers) {
        this.threeNumbers = threeNumbers;
    }

    public List<Integer> getCpuNumbers() {
        return threeNumbers.getNumbers();
    }
}
