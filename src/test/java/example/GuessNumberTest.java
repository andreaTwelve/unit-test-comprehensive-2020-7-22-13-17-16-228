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

    @Test
    void should_return_2A2B_when_number_is_1243_given_1234() {
        //given
        String guessNumber = "1243";
        GuessNumberGame guessNumberGame = new GuessNumberGame("1234");

        //when
        String actualResult = guessNumberGame.guessNumber(guessNumber);

        //then
        assertEquals("2A2B", actualResult);
    }

    @Test
    void should_return_0A4B_when_number_is_4321_given_1234() {
        //given
        String guessNumber = "4321";
        GuessNumberGame guessNumberGame = new GuessNumberGame("1234");

        //when
        String actualResult = guessNumberGame.guessNumber(guessNumber);

        //then
        assertEquals("0A4B", actualResult);
    }

    @Test
    void should_return_1A3B_when_number_is_1023_given_1234() {
        //given
        String guessNumber = "1023";
        GuessNumberGame guessNumberGame = new GuessNumberGame("1234");

        //when
        String actualResult = guessNumberGame.guessNumber(guessNumber);

        //then
        assertEquals("1A3B", actualResult);
    }
}
