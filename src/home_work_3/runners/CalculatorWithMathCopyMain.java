package home_work_3.runners;


import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calc = new CalculatorWithMathCopy();
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
        System.out.println(totalResult);
    }
}
