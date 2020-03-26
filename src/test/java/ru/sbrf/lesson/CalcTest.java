package ru.sbrf.lesson;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalcTest {

    Calc calc;

    @Test
    public void add() {
        calc = new Calc();

        assertEquals(5, calc.add(2,3));
    }

    @Test
    public void substract() {
        calc = new Calc();

        assertEquals(1, calc.substract(3,2));
    }

    @Test
    public void multiply() {
        calc = new Calc();

        assertEquals(4,calc.multiply(2,2));
    }

    @Test
    public void devide() {
        calc = new Calc();

        assertEquals(3,calc.devide(15,5));
    }
}