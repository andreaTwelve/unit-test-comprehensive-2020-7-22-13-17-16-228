package example;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class GuessNumberValidation {

    public static final String SPACE_PATTERN = "\\s+";
    public static final String EMPTY_STRING = "";
    public static final String CONTAINS_SPACE_NUMBER = "\\d\\s\\d\\s\\d\\s\\d";

    public boolean checkLengthIsValidate(String guessNumber) {
        return guessNumber != null && guessNumber.length() > 0 && guessNumber.replaceAll(SPACE_PATTERN, EMPTY_STRING).length() == 4;
    }

    public boolean checkNumberHasSpace(String guessNumber) {
        String pattern = CONTAINS_SPACE_NUMBER;
        return Pattern.matches(pattern, guessNumber);
    }

    public boolean checkNumberIsNotRepeat(String guessNumber) {
        String guess = guessNumber.replaceAll(SPACE_PATTERN, EMPTY_STRING);
        Set<Character> numberSet = new HashSet<>();
        char[] numberElements = guess.toCharArray();
        for (char numberEle: numberElements) {
            numberSet.add(numberEle);
        }
        return numberSet.size() == guess.length();
    }
}
