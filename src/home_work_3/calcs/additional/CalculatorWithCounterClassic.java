package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    private long counter = 0;

    /**
     * метод увеличевает счетчик использования калькурятора на 1;
     */
    public void incrementCountOperation(){
        counter += 1;
    }

    /**
     * метод возвращает счетчик использования калькулятора
     * @return счетчик
     */
    public long getCountOperation(){
        return counter;
    }
}
