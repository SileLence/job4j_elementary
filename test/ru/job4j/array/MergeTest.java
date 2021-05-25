package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MergeTest {

    @Test
    public void whenBothEmpty() {
        int[] expect = new int[0];
        int[] result = Merge.merge(
                new int[0],
                new int[0]
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenReorder() {
        int[] expect = {1, 2, 3, 4};
        int[] result = Merge.merge(
                new int[] {1, 3},
                new int[] {2, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenAscOrder() {
        int[] expect = {1, 2, 3, 4};
        int[] result = Merge.merge(
                new int[] {1, 2},
                new int[] {3, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftLess() {
        int[] expect = {1, 2, 3, 3, 4};
        int[] result = Merge.merge(
                new int[] {1, 2, 3},
                new int[] {3, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftGreat() {
        int[] expect = {1, 2, 3, 4, 4};
        int[] result = Merge.merge(
                new int[] {1, 2},
                new int[] {3, 4, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftEmpty() {
        int[] expect = {1, 2, 3, 4};
        int[] result = Merge.merge(
                new int[] {},
                new int[] {1, 2, 3, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void myTest() {
        int[] expect = {-9, -4, -1, 0, 0, 1, 2, 3, 5, 6, 7, 20};
        int[] result = Merge.merge(
                new int[] {-4, 0, 1, 2, 7, 20},
                new int[] {-9, -1, 0, 3, 5, 6}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void myTest2() {
        int[] expect = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = Merge.merge(
                new int[] {0, 1, 3, 5, 6},
                new int[] {2, 4, 7, 8, 9}
        );
        assertThat(result, is(expect));
    }
}
