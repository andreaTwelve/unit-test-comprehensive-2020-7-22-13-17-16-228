package example;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class FourNumberGenerate implements GuessNumberGenerate {
    @Override
    public String generateRandomNumber() {
        Random random = new Random();
        StringBuilder randomNumber = new StringBuilder();
        Set<Character> integerSet = new HashSet<>();
        while (integerSet.size() != 4) {
            integerSet.add((char)(random.nextInt(10)));
        }
        for (char i: integerSet) {
            randomNumber.append(i);
        }
        return randomNumber.toString();
    }
}
