package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calc = new CalculatorWithCounterAutoSuper();
        double stage1;
        double stage2;
        double stage3;
        double result;
        double totalResult;
        stage1 = calc.getDivisionA(28,5);
        stage2 = calc.getMultiplicationA(15,7);
        stage3 = calc.getAdditionA(stage1,stage2);
        result = calc.getAdditionA(stage3,4.1);
       totalResult = calc.getExponentiationA(result,2);
        System.out.println("totalResult = " + totalResult);
        System.out.println("количество запусков = " + calc.getCountOperatorA());
    }
}
