package baseball.Constants;

public enum ErrorMessages {

    ERROR_PREFIX("[ERROR] "),
    INVALID_BLANK_MESSAGE("공백은 입력할 수 없습니다."),
    INVALID_EMPTY_MESSAGE("아무 값도 입력하지 않았습니다."),
    INVALID_INPUT_MESSAGE("숫자만 입력할 수 있습니다."),
    INVALID_INPUT_SIZE_MESSAGE("숫자는 3자리만 입력할 수 있습니다."),
    INVALID_DUPLICATED_MESSAGE("숫자는 중복될 수 없습니다."),
    INVALID_INPUT_RANGE_MESSAGE("숫자는 1 ~ 9 사이에서 입력해야 합니다.");

    private String message;

    ErrorMessages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return ERROR_PREFIX.message + message;
    }
}
