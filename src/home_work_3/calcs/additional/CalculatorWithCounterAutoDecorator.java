package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoDecorator implements ICalculator {
    private final ICalculator calculator;

    private long counter;
    /**
     * конструктор принимающий экземпляр класса
     * @param calculator экземпляр класса
     */
    public CalculatorWithCounterAutoDecorator(ICalculator calculator){
        this.calculator = calculator;
    }
    /**
     * метод возвращающий вложенный калькулятор
     * @return
     */
    public ICalculator getCalculator(){
        return this.calculator;
    }
    /**
     * метод возвращающий количество использований калькулятора
     * @return количество использований типа long
     */
    public long getCountOperator(){
        return this.counter;
    }
    /**
     * метод делегирующий деление.
     * @param d
     * @param e
     * @return
     */
    @Override
    public double division(double d, double e) {
        counter += 1;
        return calculator.division(d,e);
    }
    /**
     * метод делегирующий умножение
     * @param b
     * @param c
     * @return
     */
    @Override
    public double multiplication(int b, double c) {
        counter += 1;
        return calculator.multiplication(b,c);
    }
    /**
     * метод делегирующий вычитание
     * @param g
     * @param l
     * @return
     */
    @Override
    public double subtraction(double g, double l) {
        counter += 1;
        return calculator.subtraction(g,l);
    }
    /**
     * метод делегирующий сумму
     * @param x
     * @param z
     * @return
     */
    @Override
    public double addition(double x, double z) {
        counter += 1;
        return calculator.addition(x,z);
    }
    /**
     * метод делегирующий возведение в степень
     * @param a
     * @param x
     * @return
     */
    @Override
    public double exponentiation(double a, double x) {
        counter += 1;
        return calculator.exponentiation(a,x);
    }
    /**
     * метод делегирующий получение модуля числа
     * @param a
     * @return
     */
    @Override
    public double module(double a) {
        counter += 1;
        return calculator.module(a);
    }
    /**
     * метод делегирующий извлечение квадратного корня числа
     * @param a
     * @return
     */
    @Override
    public double squareRoot(double a) {
        counter += 1;
        return calculator.squareRoot(a);
    }

}
