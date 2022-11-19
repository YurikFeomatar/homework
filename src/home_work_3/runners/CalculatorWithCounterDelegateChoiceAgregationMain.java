package home_work_3.runners;
import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {
        double stage1;
        double stage2;
        double stage3;
        double result;
        double totalResult;
        {
            CalculatorWithCounterAutoChoiceAgregation calc1 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
            stage1 = calc1.getDivisionCalc1(28, 5);
            stage2 = calc1.getMultiplicationCalc1(15, 7);
            stage3 = calc1.getAdditionCalc1(stage1, stage2);
            result = calc1.getAdditionCalc1(stage3, 4.1);
            totalResult = calc1.getExponentiationCalc1(result, 2);
            System.out.println("totalResult = " + totalResult);
            System.out.println("количество запусков первого калькулятора = " + calc1.getCountOperator());
        }

        System.out.println();

        {
            CalculatorWithCounterAutoChoiceAgregation calc2 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
            stage1 = calc2.getDivisionCalc2(28, 5);
            stage2 = calc2.getMultiplicationCalc2(15, 7);
            stage3 = calc2.getAdditionCalc2(stage1, stage2);
            result = calc2.getAdditionCalc2(stage3, 4.1);
            totalResult = calc2.getExponentiationCalc2(result, 2);
            System.out.println("totalResult = " + totalResult);
            System.out.println("количество запусков второго калькулятора = " + calc2.getCountOperator());
        }
        System.out.println();

        {
            CalculatorWithCounterAutoChoiceAgregation calc3 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
            stage1 = calc3.getDivisionCalc3(28, 5);
            stage2 = calc3.getMultiplicationCalc3(15, 7);
            stage3 = calc3.getAdditionCalc3(stage1, stage2);
            result = calc3.getAdditionCalc3(stage3, 4.1);
            totalResult = calc3.getExponentiationCalc3(result, 2);
            System.out.println("totalResult = " + totalResult);
            System.out.println("количество запусков третьего калькулятора = " + calc3.getCountOperator());
        }
    }
}
