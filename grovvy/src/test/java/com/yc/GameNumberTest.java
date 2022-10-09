package com.yc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameNumberTest {

    @Test
    public void should_say_fizz_when_raw_number_is_3() {
        GameNumber gameNumber = new GameNumber(3);
        Assertions.assertEquals(gameNumber.toString(), ("Fizz"));
    }

    @Test
    public void should_say_buzz_when_raw_number_is_5() {
        Assertions.assertEquals(new GameNumber(5).toString(), ("Buzz"));
    }

    @Test
    public void should_say_fizzbuzz_when_raw_number_is_15() {
        Assertions.assertEquals(new GameNumber(15).toString(), ("FizzBuzz"));
    }

    @Test
    public void should_say_fizz_when_raw_number_is_13() {
        Assertions.assertEquals(new GameNumber(13).toString(), ("Fizz"));
    }

    @Test
    public void should_say_fizz_or_buzz_when_raw_number_contains_3_or_5() {
        Assertions.assertEquals(new GameNumber(13).toString(), ("Fizz"));
        Assertions.assertEquals(new GameNumber(52).toString(), ("Buzz"));
        Assertions.assertEquals(new GameNumber(51).toString(), ("FizzBuzz"));
        Assertions.assertEquals(new GameNumber(25).toString(), ("Buzz"));
    }



}
