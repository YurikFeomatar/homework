package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        final CalculatorWithCounterAutoSuper calc = new CalculatorWithCounterAutoSuper();
        double stage1;
        double stage2;
        double stage3;
        double stage4;
        double totalResult;
        stage1 = calc.getDivisionA(28,5);
        stage2 = calc.getExponentiationA(stage1,2);
        stage3 = calc.getMultiplicationA(15,7);
        stage4 = calc.getAdditionA(stage2,4.1);
        totalResult = calc.getAdditionA(stage3,stage4);
        System.out.println("результат = " + totalResult);
        System.out.println("количество запусков = " + calc.getCountOperatorA());
    }
}
