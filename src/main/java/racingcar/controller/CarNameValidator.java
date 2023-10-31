package racingcar.controller;

import java.util.List;

public class CarNameValidator {
    private static final int RACE_CAR_LENGTH = 2;
    private static final String WRONG_SIZE_CAR_MESSAGE = "2대 이상의 자동차 이름을 입력해주세요.";
    private static final String WRONG_NULL_CARNAME_MESSAGE = "공백이 아닌 자동차 이름을 입력해주세요.";

    public List<String> toValidateCarName(List<String> carName) {
        if (!isBigRaceCarLength(carName)) {
            throw new IllegalArgumentException(WRONG_SIZE_CAR_MESSAGE);
        } else if (!isNullCarName(carName)) {
            throw new IllegalArgumentException(WRONG_NULL_CARNAME_MESSAGE);
        }

        return carName;
    }

    private boolean isBigRaceCarLength(List<String> carNames) {
        return carNames.size() >= RACE_CAR_LENGTH;
    }

    private boolean isNullCarName(List<String> carNames) {
        for (int i = 0; i < carNames.size(); i++) {
            if (!isCheckNull(carNames.get(i))) {
                return false;
            }
        }
        return true;
    }

    private boolean isCheckNull(String carName) {
        return !carName.equals("");
    }
}
