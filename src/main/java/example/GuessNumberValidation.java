package example;

public class GuessNumberValidation {
    public boolean checkLengthIsValidate(String guessNumber) {
        if (guessNumber.replaceAll("\\s+","").length() == 4) {
            return true;
        }
        return false;
    }

    public boolean checkNumberHasSpace(String guessNumber) {
        return false;
    }
}
