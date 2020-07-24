package example;

public class GuessNumberValidation {
    public boolean checkLengthIsValidate(String guessNumber) {
        if (guessNumber.trim().length() == 4) {
            return true;
        }
        return false;
    }
}
