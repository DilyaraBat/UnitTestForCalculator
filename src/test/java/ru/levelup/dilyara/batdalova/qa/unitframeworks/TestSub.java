package ru.levelup.dilyara.batdalova.qa.unitframeworks;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestSub {
    private Calculator calc;
    @BeforeEach
    public void init(){
        calc = new Calculator();
    }
    @ParameterizedTest(name = "{index} => a = {0}, b = {1}, subb = {2}")
    @CsvSource({"1.2,1.0,0.2",
            "1,2.3,-1.3",
            "2.1,3.4,-1.3",
            "3,5,-2"})
    public void subDouble(double a, double b, double subb){
        Assertions.assertEquals(subb,Math.round(calc.sub(a,b)*100.0)/100.0 );
    }

    @ParameterizedTest(name = "{index} => a = {0}, b = {1}, subb = {2}")
    @CsvSource({"1,1,0",
            "1,2,-1",
            "2,3,-1",
            "3,5,-2"})
    public void subLong(long a, long b, long subb){

        Assertions.assertEquals(subb, calc.sub(a,b));
    }

}
