package home_work_4.hw3.calcs.additional;

import home_work_3.calcs.additional.CalculatorStringExpression;
import home_work_3.calcs.additional.CalculatorStringExpressionAdapter;
import home_work_3.calcs.api.ICalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorStringExpressionAdapterTest {
    private final ICalculator calc = new CalculatorStringExpressionAdapter(new CalculatorStringExpression());
    @Test
    @DisplayName("проверяем CalculatorWithMathExtends")
    public void division1(){
        Assertions.assertEquals(0.0,calc.division(28,5));
    }
    @Test
    @DisplayName("проверяем CalculatorWithMathExtends")
    public void multiplication1(){
        Assertions.assertEquals(0.0,calc.multiplication(2,2));
    }
    @Test
    @DisplayName("проверяем CalculatorWithMathExtends")
    public void subtraction1(){
        Assertions.assertEquals(0.0,calc.subtraction(12,2));
    }
    @Test
    @DisplayName("проверяем CalculatorWithMathExtends")
    public void addition1(){
        Assertions.assertEquals(0.0,calc.addition(20,25));
    }
    @Test
    @DisplayName("проверяем CalculatorWithMathExtends")
    public void exponentiation1(){
        Assertions.assertEquals(0.0,calc.exponentiation(1,5));
    }
    @Test
    @DisplayName("проверяем CalculatorWithMathExtends")
    public void module1(){
        Assertions.assertEquals(0.0,calc.module(-232));
    }
    @Test
    @DisplayName("проверяем CalculatorWithMathExtends")
    public void squareRoot1(){
        Assertions.assertEquals(0.0,calc.squareRoot(20));
    }
    @Test
    @DisplayName("проверяем CalculatorWithMathExtends")
    public void exersise1(){
        Assertions.assertEquals(0.0,calc.addition(calc.addition(4.1,calc.multiplication(15,7)),calc.exponentiation(calc.division(28,5),2)));
    }
}
