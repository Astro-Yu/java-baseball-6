package baseball.gameRule;

import baseball.constants.constants;
import java.util.List;

public class gameRule {
    public static boolean checkEndGame(int strikes) { // strikes 가 3 일 경우에 게임을 종료시키는 메서드
        if (strikes == constants.STRIKE_FOR_ENDGAME) {
            return true;
        }
        return false;
    }

    public static int checkStrike(List<Integer> playerInput, List<Integer> cpuInput) { // 스트라이크를 체크
        int strikes = 0;
        for (int i = 0; i < constants.INPUT_LENGTH; i++) {
            if (playerInput.get(i) == cpuInput.get(i)) {
                strikes++;
            }
        }
        return strikes;
    }

    public static int checkBall(List<Integer> playerInput, List<Integer> cpuInput) { // 볼을 체크
        int balls = 0;
        for (int i = 0; i < constants.INPUT_LENGTH; i++) {
            if (playerInput.get(i) != cpuInput.get(i) && cpuInput.contains(playerInput.get(i))) {
                balls++;
            }
        }
        return balls;
    }

    public static String checkNothing(List<Integer> playerInput, List<Integer> cpuInput) { // 낫싱인지 체크
        int nothingCount = 0;
        String nothing = "낫싱";
        for (int i = 0; i < constants.INPUT_LENGTH; i++) {
            if (cpuInput.contains(playerInput.get(i)) == false) {
                nothingCount++;
            }
        }
        if (nothingCount == 3) {
            return nothing;
        }
        return "낫싱 아님";
    }

    public static boolean playGameAgain() {
        boolean check = true;

        while (true) {
            String gameContinue = camp.nextstep.edu.missionutils.Console.readLine();
            if (gameContinue.equals("1")) {
                check = true;
                break;
            } else if (gameContinue.equals("2")) {
                check = false;
                break;
            } else {
                System.out.println(constants.INSERT_ONE_OR_TWO);
            }
        }
        return check;
    }
}
