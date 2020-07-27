package example;

import java.util.*;

public class GuessNumberGame {
    private FourNumberGenerate fourNumberGenerate;

    public GuessNumberGame(FourNumberGenerate fourNumberGenerate) {
        this.fourNumberGenerate = fourNumberGenerate;
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

    public static void main(String[] args) {
        FourNumberGenerate fourNumberGenerate = new FourNumberGenerate();
        GuessNumberGame guessNumberGame = new GuessNumberGame(fourNumberGenerate);
        int guessTimes = 0;
        Scanner scanner = new Scanner(System.in);
        while (guessTimes < 6) {
            System.out.println("input");
            System.out.println(guessNumberGame.guessNumber(scanner.nextLine()));
            ++guessTimes;
        }
        scanner.close();
    }
}
