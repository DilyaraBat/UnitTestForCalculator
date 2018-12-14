package ru.levelup.dilyara.batdalova.qa.unitframeworks;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestDiv {
    private Calculator calc;
    @BeforeEach
    public void init(){
        calc = new Calculator();
    }
    @ParameterizedTest(name = "{index} => a = {0}, b = {1}, divi = {2}")
    @CsvSource({"1.2,1,1.2",
            "1,2.3,0.43",
            "2.1,3.4,0.62",
            "3,5,0.6"})
    public void divDouble(double a, double b, double divi){

        Assertions.assertEquals(divi, Math.round(calc.div(a,b)*100.0)/100.0);
    }

    @ParameterizedTest(name = "{index} => a = {0}, b = {1}, divi = {2}")
    @CsvSource({"10,1,10",
            "11,2,5",
            "2,-3,0",
            "-3,5,0"})
    public void divLong(long a, long b, long divi){

        Assertions.assertEquals(divi, calc.div(a,b));
    }



}
