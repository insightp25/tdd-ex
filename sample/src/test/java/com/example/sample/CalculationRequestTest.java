package com.example.sample;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CalculationRequestTest {

    @Test
    void able_to_verify_valid_number_and_parse() {
        // given
        String[] parts = new String[]{"2", "+", "5"};

        // when
        CalculationRequest request = new CalculationRequest(parts);

        // then
        assertEquals(2, request.getNum1());
        assertEquals(5, request.getNum2());
        assertEquals("+", request.getOperator());
    }

    @Test
    void able_verify_number_over_3_figures_and_parse() {
        // given
        String[] parts = new String[]{"332", "+", "523"};

        // when
        CalculationRequest request = new CalculationRequest(parts);

        // then
        assertEquals(332, request.getNum1());
        assertEquals(523, request.getNum2());
        assertEquals("+", request.getOperator());
    }

    @Test
    void throws_error_to_input_number_with_invalid_length() {
        // given
        String[] parts = new String[]{"332", "+"};

        // when & then
        assertThrows(BadRequestException.class, () -> {
            new CalculationRequest(parts);
        });
    }

    @Test
    void throws_error_to_invalid_input_operator() {
        // given
        String[] parts = new String[]{"332", "W", "555"};

        // when & then
        assertThrows(InvalidOperatorException.class, () -> {
            new CalculationRequest(parts);
        });
    }

    @Test
    void throws_error_to_invalid_length_of_input_operator() {
        // given
        String[] parts = new String[]{"332", "+-", "555"};

        // when & then
        assertThrows(InvalidOperatorException.class, () -> {
            new CalculationRequest(parts);
        });
    }
}
