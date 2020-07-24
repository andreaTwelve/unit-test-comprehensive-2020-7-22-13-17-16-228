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
        if (guessNumberValidation.checkNumberIsNotRepeat(guessNumber)) {
            String randomNumber = fourNumberGenerate.generateRandomNumber();
            return this.printGuessNumberResult(guessNumber, randomNumber);
        } else {
            return "Wrong Input，Input again";
        }
    }



    public String printGuessNumberResult(String guessNumber, String randomNumber) {
        char[] numberCharArr = guessNumber.trim().toCharArray();
        Map<Character, Integer> numberIndexMap = new HashMap<>();

        int countB = 0;
        for (int i = 0; i < numberCharArr.length; i++) {
            if (randomNumber.indexOf(numberCharArr[i]) != -1) {
                countB++;
                numberIndexMap.put(numberCharArr[i], i);
            }
        }

        char[] randomCharArr = randomNumber.trim().toCharArray();
        Map<Character, Integer> randomNumberIndexMap = new HashMap<>();
        int countA = 0;
        for (int i = 0; i < randomCharArr.length; i++) {
            randomNumberIndexMap.put(randomCharArr[i], i);
        }
        for (Map.Entry<Character, Integer> entry: numberIndexMap.entrySet()) {
            for (Map.Entry<Character, Integer> randomEntry: randomNumberIndexMap.entrySet()) {
                if (entry.getKey() == randomEntry.getKey() && entry.getValue().equals(randomEntry.getValue())) {
                    countA++;
                }
            }
        }

        if (countA + countB > 4) {
            countB = 4 - countA;
        }

        return String.format("%sA%sB", countA, countB);
    }

}
