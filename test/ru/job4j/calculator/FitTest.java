package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        short height = 180;
        double expected = 92;
        double actual = Fit.manWeight(height);

        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void whenWoman180Then80() {
        short height = 180;
        double expected = 80.5;
        double actual = Fit.womanWeight(height);

        Assert.assertEquals(expected, actual, 0.01);
    }
}
