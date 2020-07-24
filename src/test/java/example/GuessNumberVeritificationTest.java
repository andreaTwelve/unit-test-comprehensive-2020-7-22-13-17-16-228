package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GuessNumberVeritificationTest {
    @Test
    void should_return_true_when_number_is_1234_given_1234() {
        //given
        String guessNumber = "1234";
        GuessNumberValidation validation = new GuessNumberValidation();
        //when
        boolean isVirtual;
        isVirtual = validation.checkLengthIsValidate(guessNumber);
        //then
        assertTrue(isVirtual);
    }
}
