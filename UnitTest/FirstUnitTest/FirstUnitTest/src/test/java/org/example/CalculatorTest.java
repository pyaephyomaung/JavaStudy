package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {

        var calculator = new Calculator();
        int outcome = calculator.add(1 , 1);

        assertEquals(2 , outcome);
    }
}