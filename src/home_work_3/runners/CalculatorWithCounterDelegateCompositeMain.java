package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;

public class CalculatorWithCounterDelegateCompositeMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();
        double stage1;
        double stage2;
        double stage3;
        double result;
        double totalResult;
        stage1 = calc.getDivision(28,5);
        stage2 = calc.getMultiplication(15,7);
        stage3 = calc.getAddition(stage1,stage2);
        result = calc.getAddition(stage3,4.1);
        totalResult = calc.getExponentiation(result,2);
        System.out.println("totalResult = " + totalResult);
        System.out.println("количество запусков = " + calc.getCountOperator());
    }
}
