package com.vmax.samplegit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void multiplication_isCorrect() {
        assertEquals(20, 5 * 4);
    }

    @Test
    public void subtraction_isCorrect() {
        assertEquals(20, 40 - 20);
    }

    @Test
    public void division_isCorrect() {
        assertEquals(20, 400 / 20);
    }

    @Test
    public void test_assert() {
        assertEquals(40, 40);
    }
}