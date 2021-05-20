package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class CheckTest {
    @Test
    public void whenDataMonoByTrueThenTrue() {
        boolean[] data = {true, true, true};
        boolean result = Check.mono(data);
        Assert.assertTrue(result);
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        boolean[] data = {false, true, true};
        boolean result = Check.mono(data);
        Assert.assertFalse(result);
    }

    @Test
    public void whenDataMonoByFalseThenTrue() {
        boolean[] data = {false, false, false};
        boolean result = Check.mono(data);
        Assert.assertTrue(result);
    }
}
