package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithOperator calc1 = new CalculatorWithOperator();
        CalculatorWithMemory calc = new CalculatorWithMemory(calc1);
        calc.division(28,5);
        calc.save();
        calc.exponentiation(calc.getSaveResult(),2);
        calc.save();
        calc.addition(calc.getSaveResult(),calc.multiplication(15,7));
        calc.save();
        calc.addition(calc.getSaveResult(),4.1);
        calc.save();
        System.out.println("Сохраненный результат = " + calc.getSaveResult());
    }
}
