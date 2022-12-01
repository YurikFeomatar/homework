package home_work_4.hw3.calcs.additional;

import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorWithCounterAutoChoiceAgregationTest {
    private final CalculatorWithCounterAutoChoiceAgregation calc = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());

    @Test
    @DisplayName("проверяем CalculatorWithCounterAutoChoiceAgregation")
    public void division1(){
        Assertions.assertEquals(5.6,calc.getDivisionCalc1(28,5));
    }
    @Test
    @DisplayName("проверяем CalculatorWithCounterAutoChoiceAgregation")
    public void multiplication1(){
        Assertions.assertEquals(4,calc.getMultiplicationCalc1(2,2));
    }
    @Test
    @DisplayName("проверяем CalculatorWithCounterAutoChoiceAgregation")
    public void subtraction1(){
        Assertions.assertEquals(10,calc.getSubtractionCalc1(12,2));
    }
    @Test
    @DisplayName("проверяем CalculatorWithCounterAutoChoiceAgregation")
    public void addition1(){
        Assertions.assertEquals(45,calc.getAdditionCalc1(20,25));
    }
    @Test
    @DisplayName("проверяем CalculatorWithCounterAutoChoiceAgregation")
    public void exponentiation1(){
        Assertions.assertEquals(64,calc.getExponentiationCalc1(8,5));
    }
    @Test
    @DisplayName("проверяем CalculatorWithCounterAutoChoiceAgregation")
    public void module1(){
        Assertions.assertEquals(232,calc.getModuleCalc1(-232));
    }
    @Test
    @DisplayName("проверяем CalculatorWithCounterAutoChoiceAgregation")
    public void squareRoot1(){
        Assertions.assertEquals(4.47213595499958,calc.getSquareRootCalc1(20));
    }
    @Test
    @DisplayName("проверяем CalculatorWithCounterAutoChoiceAgregation")
    public void exersise1(){
        Assertions.assertEquals(140.45999999999998,
                calc.getAdditionCalc1(calc.getAdditionCalc1(4.1,calc.getMultiplicationCalc1(15,7)),
                        calc.getExponentiationCalc1(calc.getDivisionCalc1(28,5),2)));
    }
}
