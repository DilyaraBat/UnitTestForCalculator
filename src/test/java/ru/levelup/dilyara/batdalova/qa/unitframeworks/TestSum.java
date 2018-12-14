package ru.levelup.dilyara.batdalova.qa.unitframeworks;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class TestSum {

    private Calculator calc;
    @BeforeEach
    public void init(){
         calc = new Calculator();
    }
    @ParameterizedTest(name = "{index} => a = {0}, b = {1}, summ = {2}")
    @CsvSource({"1.2,1,2.2",
                "1,2.3,3.3",
                "2.1,3.4,5.5",
                "3,5,8"})
    public void sumDouble(double a, double b, double summ){

        Assertions.assertEquals(summ, calc.sum(a,b));
    }

    @ParameterizedTest(name = "{index} => a = {0}, b = {1}, summ = {2}")
    @CsvSource({"1,1,2",
                "1,2,3",
                "2,3,5",
                "3,5,8"})
    public void sumLong(long a, long b, long summ){

        Assertions.assertEquals(summ, calc.sum(a,b));
    }

}

