package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {

    @Test
    public void whenSumNumbersFrom78To351Then58773() {
        int start = 78;
        int finish = 351;
        int actual = Counter.sum(start, finish);
        int expected = 58773;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFrom7To26Then170() {
        int start = 7;
        int finish = 25;
        int actual = Counter.sumByEven(start, finish);
        int expected = 144;
        Assert.assertEquals(expected, actual);
    }
}
