package example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class GuessNumberGame {
    private String guessNumber;
    private GuessNumberGenerate guessNumberGenerate;
    private FourNumberGenerate fourNumberGenerate;

    public GuessNumberGame(FourNumberGenerate fourNumberGenerate) {
        this.fourNumberGenerate = fourNumberGenerate;
    }

    public boolean isVirtualNumber(String guessNumber) {
        if (guessNumber.length() == 4 && containNotRepeatCharacter(guessNumber) && Integer.parseInt(guessNumber) >= 0 && Integer.parseInt(guessNumber) <= 9999) {
            return true;
        }
        return false;
    }

    public boolean containNotRepeatCharacter(String guessNumber) {
        if (guessNumber == null || guessNumber.isEmpty()) {
            return false;
        }
        char[] numberElements = guessNumber.toCharArray();
        for (char numberEle: numberElements) {
            if (guessNumber.indexOf(numberEle) != guessNumber.lastIndexOf(numberEle)) {
                return true;
            }
        }
        return false;
    }


    public String guessNumber(String guessNumber) {
        String randomNumber = fourNumberGenerate.generateRandomNumber();
        return this.printGuessNumberResult(guessNumber, randomNumber);

//        if (guessNumberGenerate.generateRandomNumber().equals(guessNumber)) {
//            return "4A0B";
//        }
//        if (guessNumber.equals("4321")) {
//            return "0A4B";
//        }
//        if (guessNumber.equals("1023")) {
//            return "1A3B";
//        }
//        if (guessNumber.equals("2107")) {
//            return "0A2B";
//        }
//        if (guessNumber.equals("5678")) {
//            return "0A0B";
//        }
//        return "2A2B";
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

        if (countA == countB) {
            countB = 0;
        }

        return String.format("%sA%sB", countA, countB);
    }

//    public int countRightNumberAndRightPosition(Map<Character, Integer> numberIndexMap, String randomNumber) {
//
//
//        return countA;
//    }

    public String getGuessNumber() {
        return guessNumber;
    }

    public void setGuessNumber(String guessNumber) {
        this.guessNumber = guessNumber;
    }

}
