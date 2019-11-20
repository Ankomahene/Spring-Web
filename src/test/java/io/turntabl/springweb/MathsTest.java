package io.turntabl.springweb;

import io.turntabl.springweb.controllers.Maths;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathsTest {
    Maths m = new Maths();

    @Test
    void addPositiveNumbers() {
        assertEquals(5 , m.add(3, 2));
    }

    @Test
    void addNegativeNumbers() {
        assertEquals(-10 , m.add(-3, -7));
    }

    @Test
    void addPositiveandNegativeNumbers() {
        assertEquals(3 , m.add(10, -7));
    }

    @Test
    void checkWrongResults() {
        assertNotEquals(5 , m.add(8, -7));
    }

    @Test
    void subtractPositiveNumbers() {
        assertEquals(5 , m.sub(8, 3));
    }

    @Test
    void subtractNegativeNumbers() {
        assertEquals(-5 , m.sub(-8, -3));
    }

    @Test
    void subtractPositiveAndNegativeNumbers() {
        assertEquals(11 , m.sub(8, -3));
    }

    @Test
    void subtractPositiveAndNegativeNumbers2() {
        assertEquals(-11 , m.sub(-8, 3));
    }

    @Test
    void checkWrongSubResults() {
        assertNotEquals(-2 , m.sub(5, 3));
    }

}
