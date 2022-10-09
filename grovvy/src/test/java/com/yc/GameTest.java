package com.yc;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {
    @Test
    public void should_provide_words_to_be_spoken() {
        Game game = new Game(100);
        List<String> wordsToBeSpoken = game.words();
        assertEquals(wordsToBeSpoken.get(0), "1");
        assertEquals(wordsToBeSpoken.size(), 100);

    }

}
