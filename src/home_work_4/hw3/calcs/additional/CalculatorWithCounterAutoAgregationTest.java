package home_work_4.hw3.calcs.additional;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorWithCounterAutoAgregationTest {
    private final CalculatorWithCounterAutoAgregation calc = new CalculatorWithCounterAutoAgregation();

    @Test
    @DisplayName("проверяем CalculatorWithCounterAutoAgregation")
    public void division1(){
        Assertions.assertEquals(5.6,calc.getDivision(28,5));
    }
    @Test
    @DisplayName("проверяем CalculatorWithCounterAutoAgregation")
    public void multiplication1(){
        Assertions.assertEquals(4,calc.getMultiplication(2,2));
    }
    @Test
    @DisplayName("проверяем CalculatorWithCounterAutoAgregation")
    public void subtraction1(){
        Assertions.assertEquals(10,calc.getSubtraction(12,2));
    }
    @Test
    @DisplayName("проверяем CalculatorWithCounterAutoAgregation")
    public void addition1(){
        Assertions.assertEquals(45,calc.getAddition(20,25));
    }
    @Test
    @DisplayName("проверяем CalculatorWithCounterAutoAgregation")
    public void exponentiation1(){
        Assertions.assertEquals(32768.0,calc.getExponentiation(8,5));
    }
    @Test
    @DisplayName("проверяем CalculatorWithCounterAutoAgregation")
    public void module1(){
        Assertions.assertEquals(232,calc.getModule(-232));
    }
    @Test
    @DisplayName("проверяем CalculatorWithCounterAutoAgregation")
    public void squareRoot1(){
        Assertions.assertEquals(4.47213595499958,calc.getSquareRoot(20));
    }
    @Test
    @DisplayName("проверяем CalculatorWithCounterAutoAgregation")
    public void exersise1(){
        Assertions.assertEquals(140.45999999999998,
                calc.getAddition(calc.getAddition(4.1,calc.getMultiplication(15,7)),calc.getExponentiation(calc.getDivision(28,5),2)));
    }
}
