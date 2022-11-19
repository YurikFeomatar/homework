package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;
import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calc = new CalculatorWithCounterClassic();
        double stage1 = 0;
        double stage2 = 0;
        double stage3 = 0;
        double result = 0;
        double totalResult = 0;
        stage1 = calc.getDivision(28,5);
        calc.incrementCountOperation();
        stage2 = calc.getMultiplication(15,7);
        calc.incrementCountOperation();
        stage3 = calc.getAddition(stage1,stage2);
        calc.incrementCountOperation();
        result = calc.getAddition(stage3,4.1);
        calc.incrementCountOperation();
        totalResult = calc.getExponentiation(result,2);
        calc.incrementCountOperation();
        System.out.println("totalResult = " + totalResult);
        System.out.println("количество запусков = " + calc.getCountOperation());


    }
}
