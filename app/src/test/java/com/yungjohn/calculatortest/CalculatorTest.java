package com.yungjohn.calculatortest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
/**
 * JUnit4 unit tests for the calculator logic. These are local unit tests; no device needed
 */
@RunWith(JUnit4.class)
public class CalculatorTest {

        private Calculator mCalculator;

        /**
         * Set up the environment for testing
         */
        @Before
        public void setUp() {
            mCalculator = new Calculator();
        }

        /**
         * Test for simple addition
         */
        @Test
        public void addTwoNumbers() {
            double resultAdd = mCalculator.add(1d, 1d);
            assertThat(resultAdd, is(equalTo(2d)));
        }

    @Test
    public void addTwoNumbersNegative() {
    }
}
