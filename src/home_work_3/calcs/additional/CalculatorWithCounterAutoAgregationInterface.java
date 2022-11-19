package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface implements ICalculator {
    public long counter;
    ICalculator calc;

    /**
     * конструктор, принимающий экземпляр класса типа ICalculator
     * @param calc
     */
    public CalculatorWithCounterAutoAgregationInterface(ICalculator calc){
    this.calc = calc;
    }

    /**
     * метод делит числа
     * @param d принимает double
     * @param e принимает double
     * @return
     */
    @Override
    public double division(double d, double e) {
        counter += 1;
        return calc.division(d,e);
    }

    /**
     * метод умножает числа
     * @param b
     * @param c
     * @return
     */
    @Override
    public double multiplication(int b, double c) {
        counter += 1;
        return calc.multiplication(b,c);
    }

    /**
     * метод вычитает одно число из другого
     * @param g
     * @param l
     * @return
     */
    @Override
    public double subtraction(double g, double l) {
        counter += 1;
        return calc.subtraction(g,l);
    }

    /**
     * метод суммирует два числа
     * @param x
     * @param z
     * @return
     */
    @Override
    public double addition(double x, double z) {
        counter += 1;
        return calc.addition(x,z);
    }

    /**
     * метод возводит в степень число
     * @param a
     * @param x
     * @return
     */
    @Override
    public double exponentiation(double a, double x) {
        counter += 1;
        return calc.exponentiation(a,x);
    }

    /**
     * метод определяет модуль числа
     * @param a
     * @return
     */
    @Override
    public double module(double a) {
        counter += 1;
        return calc.module(a);
    }

    /**
     * метод извлекает квадратный корень из числа
     * @param a
     * @return
     */
    @Override
    public double squareRoot(double a) {
        counter += 1;
        return calc.squareRoot(a);
    }

    /**
     * метод возвращает количество использований калькулятора (getter)
     * @return
     */
    public long getCountOperator() {
        return counter;
    }
}

