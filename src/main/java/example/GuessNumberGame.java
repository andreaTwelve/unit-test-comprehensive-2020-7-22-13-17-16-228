package example;

import java.util.*;
import java.util.stream.Stream;

public class GuessNumberGame {
    private FourNumberGenerate fourNumberGenerate;

    public GuessNumberGame(FourNumberGenerate fourNumberGenerate) {
        this.fourNumberGenerate = fourNumberGenerate;
    }

    public boolean isValidNumber(String guessNumber) {
        String number = guessNumber.trim();
        if (number.length() == 4 && containNotRepeatCharacter(number) && Integer.parseInt(number) >= 0 && Integer.parseInt(number) <= 9999) {
            return true;
        }
        return false;
    }

    public boolean containNotRepeatCharacter(String guessNumber) {
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


    //todo

    public String guessNumber(String guessNumber) {
        GuessNumberValidation guessNumberValidation = new GuessNumberValidation();
        if (guessNumberValidation.checkLengthIsValidate(guessNumber) && guessNumberValidation.checkNumberHasSpace(guessNumber) && guessNumberValidation.checkNumberIsNotRepeat(guessNumber)) {
            String randomNumber = fourNumberGenerate.generateRandomNumber();
            return this.printGuessNumberResult(guessNumber, randomNumber);
        } else {
            return "Wrong Input，Input again";
        }
    }



    public String printGuessNumberResult(String guessNumber, String randomNumber) {
        int countRightNumberRightPosition = 0;
        int countRightNumberErrorPosition = 0;
        String[] numberArr = guessNumber.replaceAll("\\s+", "").split("");
        for (int i = 0; i < numberArr.length; i++) {
            if (randomNumber.contains(numberArr[i])) {
                if (randomNumber.indexOf(numberArr[i]) == i) {
                    countRightNumberRightPosition++;
                } else {
                    countRightNumberErrorPosition++;
                }
            }
        }
        return String.format("%sA%sB", countRightNumberRightPosition, countRightNumberErrorPosition);
    }

}
