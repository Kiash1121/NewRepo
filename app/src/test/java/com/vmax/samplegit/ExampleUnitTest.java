package com.vmax.samplegit;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

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
        assertEquals(60, 60);
    }
}