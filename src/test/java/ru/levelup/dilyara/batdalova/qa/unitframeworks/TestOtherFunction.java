package ru.levelup.dilyara.batdalova.qa.unitframeworks;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestOtherFunction {
    private Calculator calc;
    @BeforeEach
    public void init(){
        calc = new Calculator();
    }
    @ParameterizedTest(name = "{index} => a = {0}, b = {1}, multi = {2}")
    @CsvSource({"1.2,-1,-2",
            "1,2.3,2",
            "2.5,3.4,8",
            "3,5,15"})
    public void powDouble(double a, double b, double rez){

        Assertions.assertEquals(rez, calc.pow(a,b));
    }
}
