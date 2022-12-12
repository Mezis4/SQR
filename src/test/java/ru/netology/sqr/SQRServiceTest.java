package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/sqrdata.csv")

//проверяем поведение программы в границах из тз, на граничных значениях (100-101 и 9800-9801)
//в границах нет совпадения, за пределами границ (98-99 и 9802-9803)
    public void shouldCountMatchInSpan(int expected, int lowerBound, int upperBound) {
        SQRService service = new SQRService ();

        int actual = service.counter(lowerBound, upperBound);

        Assertions.assertEquals(expected, actual);
    }




}
