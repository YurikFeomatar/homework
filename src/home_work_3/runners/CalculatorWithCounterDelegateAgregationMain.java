package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;

public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {
        final CalculatorWithCounterAutoAgregation calc = new CalculatorWithCounterAutoAgregation();
        double stage1;
        double stage2;
        double stage3;
        double stage4;
        double totalResult;
        stage1 = calc.getDivision(28,5);
        stage2 = calc.getExponentiation(stage1,2);
        stage3 = calc.getMultiplication(15,7);
        stage4 = calc.getAddition(stage2,4.1);
        totalResult = calc.getAddition(stage3,stage4);
        System.out.println("результат = " + totalResult);
        System.out.println("количество запусков = " + calc.getCountOperator());
    }
}
