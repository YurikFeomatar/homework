package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calc = new CalculatorWithMathExtends();
        double stage1 = 0;
        double stage2 = 0;
        double stage3 = 0;
        double result = 0;
        double totalResult = 0;
        stage1 = calc.getDivision(28,5);
        stage2 = calc.getMultiplication(15,7);
        stage3 = calc.getAddition(stage1,stage2);
        result = calc.getAddition(stage3,4.1);
        totalResult = calc.getExponentiation(result,2);
        System.out.println("результат = " + totalResult);
    }

}
