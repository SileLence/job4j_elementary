package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EndsWithTest {

    @Test
    public void whenEndsWithPrefixThenTrue() {
        char[] word = {'H', 'o', 'r', 's', 't', 'm', 'a', 'n'};
        char[] post = {'m', 'a', 'n'};
        boolean result = EndsWith.endsWith(word, post);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotEndsWithPrefixThenFalse() {
        char[] word = {'J', 'a', 'v', 'a'};
        char[] post = {'a', 'n'};
        boolean result = EndsWith.endsWith(word, post);
        Assert.assertFalse(result);
    }
}
