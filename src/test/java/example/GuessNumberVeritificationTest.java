package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GuessNumberVeritificationTest {
    @Test
    void should_return_true_when_number_is_1234_given_1234() {
        //given
        String guessNumber = "1 2 3 4";
        GuessNumberValidation validation = new GuessNumberValidation();
        //when
        boolean isValid;
        isValid = validation.checkLengthIsValidate(guessNumber);
        //then
        assertTrue(isValid);
    }

    @Test
    void should_return_false_when_number_is_12345_given_1234() {
        //given
        String guessNumber = "1 2 3 4 5";
        GuessNumberValidation guessNumberValidation = new GuessNumberValidation();
        //when
        boolean isValid = guessNumberValidation.checkLengthIsValidate(guessNumber);
        //then
        assertFalse(isValid);
    }

    @Test
    void should_return_false_when_number_has_no_space_given_1234() {
        //given
        String guessNumber = "1 23 4";
        GuessNumberValidation guessNumberValidation = new GuessNumberValidation();
        //when
        boolean isValid = guessNumberValidation.checkNumberHasSpace(guessNumber);
        //then
        assertFalse(isValid);
    }

}
