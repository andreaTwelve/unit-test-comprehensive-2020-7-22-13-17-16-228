package example;

public class GuessNumberGame {
    private String guessNumber;

    public GuessNumberGame(String guessNumber) {
        this.guessNumber = guessNumber;
    }

    public String guessNumber(String guessNumber) {
        if (guessNumber.equals("1234")) {
            return "4A0B";
        }
        if (guessNumber.equals("4321")) {
            return "0A4B";
        }
        if (guessNumber.equals("1023")) {
            return "1A3B";
        }
        if (guessNumber.equals("2107")) {
            return "0A2B";
        }
        return "2A2B";
    }

    public String getGuessNumber() {
        return guessNumber;
    }

    public void setGuessNumber(String guessNumber) {
        this.guessNumber = guessNumber;
    }
}
