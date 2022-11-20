package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorDecoratorMain {
    public static void main(String[] args) {
        ICalculator calc = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));
        double stage1;
        double stage2;
        double stage3;
        double result;
        double totalResult;
        stage1 = calc.division(28,5);
        stage2 = calc.multiplication(15,7);
        stage3 = calc.addition(stage1,stage2);
        result = calc.addition(stage3,4.1);
        totalResult = calc.exponentiation(result,2);
        System.out.println("totalResult = " + totalResult);
        System.out.println("количество запусков = " + ((CalculatorWithCounterAutoDecorator) calc).getCountOperator());
    }
}
