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
        double stage4;
        double totalResult;
        stage1 = calc.division(28,5);
        stage2 = calc.exponentiation(stage1,2);
        stage3 = calc.multiplication(15,7);
        stage4 = calc.addition(stage2,4.1);
        totalResult = calc.addition(stage3,stage4);
        System.out.println("результат = " + totalResult);
        System.out.println("количество запусков = " + ((CalculatorWithCounterAutoDecorator) calc).getCountOperator());
        calc = ((CalculatorWithCounterAutoDecorator) calc).getCalculator();
        if(calc instanceof CalculatorWithMemoryDecorator){
            ((CalculatorWithMemoryDecorator) calc).save1();
            System.out.print("Сохраненный результат = " + ((CalculatorWithMemoryDecorator) calc).getSaveResult1());
        }
    }
}
