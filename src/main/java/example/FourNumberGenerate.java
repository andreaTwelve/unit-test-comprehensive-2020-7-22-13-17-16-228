package example;

import java.util.Random;

public class FourNumberGenerate implements GuessNumberGenerate {
    @Override
    public String generateRandomNumber() {
        Random random = new Random();
        int number = random.nextInt(10000);
        return number + "";
    }
}
