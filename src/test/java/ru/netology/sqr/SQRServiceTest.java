package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {
    @CsvSource(value = {"'borders from 200 to 300',200,300,3",
                        "'borders from 50 to 500',50,500,13",
                        "'borders from 555 to 1000',555,1000,8"})
    @ParameterizedTest
    void shouldCalculate(String testName, int lowBound, int topBound, int expected) {
        SQRService service = new SQRService();
        int actual = service.calculate(lowBound, topBound);
        assertEquals(expected, actual);

    }
}