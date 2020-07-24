package example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;

public class GuessNumberTest {
    @Test
    void should_return_wrong_when_number_is_special_character_given_1234() {
        //given
        String guessNumber = "....";
        FourNumberGenerate stubGuessNumberGenerate = Mockito.mock(FourNumberGenerate.class);
        GuessNumberGame guessNumberGame = new GuessNumberGame(stubGuessNumberGenerate);
        given(stubGuessNumberGenerate.generateRandomNumber()).willReturn("1234");

        //when
        String actualResult = guessNumberGame.guessNumber(guessNumber);

        //then
        assertEquals("Wrong Input，Input again", actualResult);

    }


    @Test
    void should_return_4A0B_when_number_is_1234_given_1234() {
        //given
        String guessNumber = "1234";
        FourNumberGenerate stubGuessNumberGenerate = Mockito.mock(FourNumberGenerate.class);
        GuessNumberGame guessNumberGame = new GuessNumberGame(stubGuessNumberGenerate);
        given(stubGuessNumberGenerate.generateRandomNumber()).willReturn("1234");

        //when
        String actualResult = guessNumberGame.guessNumber(guessNumber);

        //then
        assertEquals("4A0B", actualResult);
    }

    @Test
    void should_return_2A2B_when_number_is_1243_given_1234() {
        //given
        String guessNumber = "1243";
        FourNumberGenerate stubGuessNumberGenerate = Mockito.mock(FourNumberGenerate.class);
        GuessNumberGame guessNumberGame = new GuessNumberGame(stubGuessNumberGenerate);
        given(stubGuessNumberGenerate.generateRandomNumber()).willReturn("1234");

        //when
        boolean containsNotRepeatNumber = guessNumberGame.containNotRepeatCharacter(guessNumber);
        boolean isVirtualNumber;
        isVirtualNumber = guessNumberGame.isValidNumber(guessNumber);
        String actualResult = guessNumberGame.guessNumber(guessNumber);

        //then
        assertTrue(containsNotRepeatNumber);
        assertTrue(isVirtualNumber);
        assertEquals("2A2B", actualResult);
    }

    @Test
    void should_return_0A4B_when_number_is_4321_given_1234() {
        //given
        String guessNumber = "4321";
        FourNumberGenerate stubGuessNumberGenerate = Mockito.mock(FourNumberGenerate.class);
        GuessNumberGame guessNumberGame = new GuessNumberGame(stubGuessNumberGenerate);
        given(stubGuessNumberGenerate.generateRandomNumber()).willReturn("1234");

        //when
        boolean containsNotRepeatNumber = guessNumberGame.containNotRepeatCharacter(guessNumber);
        boolean isVirtualNumber = guessNumberGame.isValidNumber(guessNumber);
        String actualResult = guessNumberGame.guessNumber(guessNumber);

        //then
        assertTrue(containsNotRepeatNumber);
        assertTrue(isVirtualNumber);
        assertEquals("0A4B", actualResult);
    }

    @Test
    void should_return_1A3B_when_number_is_1023_given_1234() {
        //given
        String guessNumber = "1023";
        FourNumberGenerate stubGuessNumberGenerate = Mockito.mock(FourNumberGenerate.class);
        GuessNumberGame guessNumberGame = new GuessNumberGame(stubGuessNumberGenerate);
        given(stubGuessNumberGenerate.generateRandomNumber()).willReturn("1234");

        //when
        boolean containsNotRepeatNumber = guessNumberGame.containNotRepeatCharacter(guessNumber);
        boolean isVirtualNumber = guessNumberGame.isValidNumber(guessNumber);
        String actualResult = guessNumberGame.guessNumber(guessNumber);

        //then
        assertTrue(containsNotRepeatNumber);
        assertTrue(isVirtualNumber);
        assertEquals("1A3B", actualResult);
    }

    @Test
    void should_return_0A2B_when_number_is_2107_given_1234() {
        //given
        String guessNumber = "2107";
        FourNumberGenerate stubGuessNumberGenerate = Mockito.mock(FourNumberGenerate.class);
        GuessNumberGame guessNumberGame = new GuessNumberGame(stubGuessNumberGenerate);
        given(stubGuessNumberGenerate.generateRandomNumber()).willReturn("1234");

        //when
        boolean containsNotRepeatNumber = guessNumberGame.containNotRepeatCharacter(guessNumber);
        boolean isVirtualNumber = guessNumberGame.isValidNumber(guessNumber);
        String actualResult = guessNumberGame.guessNumber(guessNumber);

        //then
        assertTrue(containsNotRepeatNumber);
        assertTrue(isVirtualNumber);
        assertEquals("0A2B", actualResult);
    }

    @Test
    void should_return_0A0B_when_number_is_5678_given_1234() {
        //given
        String guessNumber = "5678";
        FourNumberGenerate stubGuessNumberGenerate = Mockito.mock(FourNumberGenerate.class);
        GuessNumberGame guessNumberGame = new GuessNumberGame(stubGuessNumberGenerate);
        given(stubGuessNumberGenerate.generateRandomNumber()).willReturn("1234");

        //when
        boolean containsNotRepeatNumber = guessNumberGame.containNotRepeatCharacter(guessNumber);
        boolean isVirtualNumber = guessNumberGame.isValidNumber(guessNumber);
        String actualResult = guessNumberGame.guessNumber(guessNumber);

        //then
        assertTrue(containsNotRepeatNumber);
        assertTrue(isVirtualNumber);
        assertEquals("0A0B", actualResult);
    }
}
