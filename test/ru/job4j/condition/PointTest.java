package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00To20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2.0;
        double actual = Point.distance(x1, y1, x2, y2);

        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void when42To57Then9() {
        int x1 = 4;
        int y1 = -2;
        int x2 = 5;
        int y2 = 7;
        double expected = 9.0553;
        double actual = Point.distance(x1, y1, x2, y2);

        Assert.assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void when00To00Then0() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        double expected = 0;
        double actual = Point.distance(x1, y1, x2, y2);

        Assert.assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void when143To735Then43() {
        int x1 = -14;
        int y1 = -3;
        int x2 = 7;
        int y2 = 35;
        double expected = 43.4165;
        double actual = Point.distance(x1, y1, x2, y2);

        Assert.assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void when12To55Then5() {
        int x1 = -1;
        int y1 = -2;
        int x2 = -5;
        int y2 = -5;
        double expected = 5.0;
        double actual = Point.distance(x1, y1, x2, y2);

        Assert.assertEquals(expected, actual, 0.0001);
    }
}
