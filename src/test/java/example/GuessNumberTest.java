package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessNumberTest {
    @Test
    void should_return_4A0B_when_number_is_1234_given_1234() {
        //given
        String guessNumber = "1234";
        GuessNumberGame guessNumberGame = new GuessNumberGame("1234");

        //when
        String actualResult = guessNumberGame.guessNumber(guessNumber);

        //then
        assertEquals("4A0B", actualResult);
    }
}
