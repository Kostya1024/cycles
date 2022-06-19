package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"/TestDataOfNumberOfSquares.csv"})

    public void testAll(double rangeStart, double rangeEnd, int expected) {
        SQRService numberOfSquares = new SQRService();
        int actual = numberOfSquares.squares(rangeStart, rangeEnd);

        Assertions.assertEquals(expected, actual);

    }
}
