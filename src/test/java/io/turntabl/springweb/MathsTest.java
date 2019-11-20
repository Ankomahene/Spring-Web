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
    void subtract() {
    }

}
