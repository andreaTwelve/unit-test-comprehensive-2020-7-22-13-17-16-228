package example;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class GuessNumberValidation {
    public boolean checkLengthIsValidate(String guessNumber) {
        return guessNumber != null && guessNumber.length() > 0 && guessNumber.replaceAll("\\s+", "").length() == 4;
    }

    public boolean checkNumberHasSpace(String guessNumber) {
        String pattern = "\\d\\s\\d\\s\\d\\s\\d";
        return Pattern.matches(pattern, guessNumber);
    }

    public boolean checkNumberType(String guessNumber) {
        return false;
    }

    public boolean checkNumberIsNotRepeat(String guessNumber) {
        if (guessNumber == null || guessNumber.isEmpty()) {
            return false;
        }

        Set<Character> numberSet = new HashSet<>();
        char[] numberElements = guessNumber.toCharArray();
        for (char numberEle: numberElements) {
            numberSet.add(numberEle);
        }
        return numberSet.size() == guessNumber.length();
    }
}
