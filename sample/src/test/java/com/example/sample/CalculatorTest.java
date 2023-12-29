package com.example.sample;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void able_to_perform_addition() {
        // given
        long num1 = 2;
        long num2 = 3;
        String operator = "+";

        Calculator calculator = new Calculator();

        // when
        long result = calculator.calculate(num1, num2, operator);

        // then
        assertEquals(5, result);

        assertThat(result).isEqualTo(5);
    }

    @Test
    void able_to_perform_subtraction() {
        // given
        long num1 = 7;
        long num2 = 5;
        String operator = "-";

        Calculator calculator = new Calculator();

        // when
        long result = calculator.calculate(num1, num2, operator);

        // then
        assertEquals(2, result);

        assertThat(result).isEqualTo(2);
    }

    @Test
    void able_to_perform_multiplication() {
        // given
        long num1 = 2;
        long num2 = 3;
        String operator = "*";

        Calculator calculator = new Calculator();

        // when
        long result = calculator.calculate(num1, num2, operator);

        // then
        assertEquals(6, result);

        assertThat(result).isEqualTo(6);
    }

    @Test
    void able_to_perform_division() {
        // given
        long num1 = 6;
        long num2 = 3;
        String operator = "/";

        Calculator calculator = new Calculator();

        // when
        long result = calculator.calculate(num1, num2, operator);

        // then
        assertEquals(2, result);

        assertThat(result).isEqualTo(2);
    }

    @Test
    void throws_error_given_wrong_input() {
        // given
        long num1 = 6;
        long num2 = 3;
        String operator = "d";

        Calculator calculator = new Calculator();

        // when & then
        assertThrows(InvalidOperatorException.class, () -> {
            long result = calculator.calculate(num1, num2, operator);
        });
    }
}