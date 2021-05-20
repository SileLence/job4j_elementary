package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayCharTest {

    @Test
    public void whenStartsWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e', 'l'};
        boolean result = ArrayChar.startsWith(word, pref);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotStartsWithPrefixThenFalse() {
        char[] word = {'K', 'i', 't', 't', 'y'};
        char[] pref = {'k', 'i'};
        boolean result = ArrayChar.startsWith(word, pref);
        Assert.assertFalse(result);
    }
}
