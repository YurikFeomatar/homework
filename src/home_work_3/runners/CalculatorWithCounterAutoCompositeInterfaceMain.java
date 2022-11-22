package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        CalculatorWithOperator calc1 = new CalculatorWithOperator();
        ICalculator calc = new CalculatorWithCounterAutoAgregationInterface(calc1);
        double stage1;
        double stage2;
        double stage3;
        double stage4;
        double totalResult;
        stage1 = calc.division(28,5);
        stage2 = calc.exponentiation(stage1,2);
        stage3 = calc.multiplication(15,7);
        stage4 = calc.addition(stage2,4.1);
        totalResult = calc.addition(stage3,stage4);
        System.out.println("результат = " + totalResult);
        System.out.println("количество запусков = " + ((CalculatorWithCounterAutoAgregationInterface) calc).getCountOperator());
    }
}
