package home_work_4.hw3.calcs.simple;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorWithOperatorTest {
    private final ICalculator calc = new CalculatorWithOperator();

    @Test
    @DisplayName("проверяем CalculatorWithOperator")
    public void division1(){
        Assertions.assertEquals(5.6,calc.division(28,5));
    }
    @Test
    @DisplayName("проверяем CalculatorWithOperator")
    public void multiplication1(){
        Assertions.assertEquals(4,calc.multiplication(2,2));
    }
    @Test
    @DisplayName("проверяем CalculatorWithOperator")
    public void subtraction1(){
        Assertions.assertEquals(-3,calc.subtraction(2,5));
    }
    @Test
    @DisplayName("проверяем CalculatorWithOperator")
    public void addition1(){
        Assertions.assertEquals(4,calc.addition(2,2));
    }
    @Test
    @DisplayName("проверяем CalculatorWithOperator")
    public void exponentiation1(){
        Assertions.assertEquals(4,calc.exponentiation(2,2));
    }
    @Test
    @DisplayName("проверяем CalculatorWithOperator")
    public void module1(){
        Assertions.assertEquals(9,calc.module(-9));
    }
    @Test
    @DisplayName("проверяем CalculatorWithOperator")
    public void squareRoot1(){
        Assertions.assertEquals(3.4641016151377544,calc.squareRoot(12));
    }
    @Test
    @DisplayName("проверяем CalculatorWithOperator")
    public void exersise1(){
        Assertions.assertEquals(140.45999999999998,calc.addition(calc.addition(4.1,calc.multiplication(15,7)),calc.exponentiation(calc.division(28,5),2)));
    }
}
