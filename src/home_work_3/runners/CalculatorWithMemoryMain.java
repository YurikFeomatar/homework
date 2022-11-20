package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithOperator calc1 = new CalculatorWithOperator();
        CalculatorWithMemory calc = new CalculatorWithMemory(calc1);
        double stage1;
        double stage2;
        double stage3;
        double result;
        double totalResult;
        stage1 = calc.division(28,5);
        calc.save();
        stage2 = calc.multiplication(15,7);
        stage3 = calc.addition(stage1,stage2);
        result = calc.addition(stage3,4.1);
        totalResult = calc.exponentiation(result,2);
        System.out.println("totalResult = " + totalResult);
        System.out.println("Сохраненный результат = " + calc.getSaveResult());
    }
}
