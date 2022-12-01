package home_work_4.hw3.calcs.simple;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorWithMathExtendsTest {
    private final ICalculator calc = new CalculatorWithMathExtends();

    @Test
    @DisplayName("проверяем CalculatorWithMathExtends")
    public void division1(){
        Assertions.assertEquals(5.6,calc.division(28,5));
    }
    @Test
    @DisplayName("проверяем CalculatorWithMathExtends")
    public void multiplication1(){
        Assertions.assertEquals(4,calc.multiplication(2,2));
    }
    @Test
    @DisplayName("проверяем CalculatorWithMathExtends")
    public void subtraction1(){
        Assertions.assertEquals(10,calc.subtraction(12,2));
    }
    @Test
    @DisplayName("проверяем CalculatorWithMathExtends")
    public void addition1(){
        Assertions.assertEquals(45,calc.addition(20,25));
    }
    @Test
    @DisplayName("проверяем CalculatorWithMathExtends")
    public void exponentiation1(){
        Assertions.assertEquals(32768.0,calc.exponentiation(8,5));
    }
    @Test
    @DisplayName("проверяем CalculatorWithMathExtends")
    public void module1(){
        Assertions.assertEquals(232,calc.module(-232));
    }
    @Test
    @DisplayName("проверяем CalculatorWithMathExtends")
    public void squareRoot1(){
        Assertions.assertEquals(4.47213595499958,calc.squareRoot(20));
    }
    @Test
    @DisplayName("проверяем CalculatorWithMathExtends")
    public void exersise1(){
        Assertions.assertEquals(140.45999999999998,calc.addition(calc.addition(4.1,calc.multiplication(15,7)),calc.exponentiation(calc.division(28,5),2)));
    }
}
