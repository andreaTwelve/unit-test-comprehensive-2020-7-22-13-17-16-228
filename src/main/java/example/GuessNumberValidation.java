package example;

import java.util.regex.Pattern;

public class GuessNumberValidation {
    public boolean checkLengthIsValidate(String guessNumber) {
        if (guessNumber.replaceAll("\\s+","").length() == 4) {
            return true;
        }
        return false;
    }

    public boolean checkNumberHasSpace(String guessNumber) {
        String pattern = "\\d\\s\\d\\s\\d\\s\\d";
        return Pattern.matches(pattern, guessNumber);
    }

    public boolean checkNumberType(String guessNumber) {
        return false;
    }

    public boolean checkNumberIsNotRepeat(String guessNumber) {
        return false;
    }
}
