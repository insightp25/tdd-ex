package com.example.sample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import org.junit.jupiter.api.Test;

class CalculationRequestReaderTest {

    @Test
    void able_to_read_args_from_system_in() {
        // given
        CalculationRequestReader reader = new CalculationRequestReader();

        // when
        System.setIn(new ByteArrayInputStream("2 + 3".getBytes()));
        CalculationRequest request = reader.read();

        // then
        assertEquals(2, request.getNum1());
        assertEquals("+", request.getOperator());
        assertEquals(3, request.getNum2());
    }
}
