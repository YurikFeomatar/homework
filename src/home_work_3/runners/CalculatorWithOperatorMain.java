package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        double stage1 = 0;
        double stage2 = 0;
        double stage3 = 0;
        double stage4 = 0;
        double totalResult = 0;
        CalculatorWithOperator calc = new CalculatorWithOperator();
        stage1 = calc.getDivision(28,5);
        stage2 = calc.getExponentiation(stage1,2);
        stage3 = calc.getMultiplication(15,7);
        stage4 = calc.getAddition(stage2,4.1);
        totalResult = calc.getAddition(stage3,stage4);
        System.out.println("результат = " + totalResult);
    }
}
