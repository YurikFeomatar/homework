package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemory implements ICalculator {

    protected ICalculator calc;
    public CalculatorWithMemory(ICalculator calc){
        this.calc = calc;
    }
    protected double currentResult;
    protected double memoryResult;
    /**
     *  метод делит числа
     * @param d принимает значения типа double
     * @param e принимает значения типа double
     * @return возвращает деление чисел типа double
     */
    @Override
    public final double division(double d, double e) {
        return currentResult = calc.division(d,e);
    }
    /**
     * метод умножает числа
     * @param b принимает значения типа double
     * @param c принимает значения типа double
     * @return возвращает умножение чисел типа double
     */
    @Override
    public final double multiplication(int b, double c) {
        return currentResult = calc.multiplication(b,c);
    }
    /**
     * метод вычитает число из другого числа
     * @param g принимает значения типа double
     * @param l принимает значения типа double
     * @return возвращает вычитание чисел типа double
     */
    @Override
    public final double subtraction(double g, double l) {
        return currentResult =  calc.subtraction(g,l);
    }
    /**
     * метод складывает числа
     * @param x принимает значения типа double
     * @param z принимает значения типа double
     * @return возвращает сложение чисел типа double
     */
    @Override
    public final double addition(double x, double z) {
        return currentResult =  calc.addition(x,z);
    }
    /**
     * метод возводит в степень положительное число
     * @param a принимает значения типа double
     * @param x принимает значения типа double
     * @return возвращает число возведенное в степень типа double
     */
    @Override
    public final double exponentiation(double a, double x) {
        return currentResult =  calc.exponentiation(a,x);
    }
    /**
     *  метод находит модуль числа
     * @param a принимает число типа double
     * @return возвращает модуль числа
     */
    @Override
    public final double module(double a) {
        return currentResult =  calc.module(a);
    }
    /**
     * метод находит корень числа
     * @param a принимает число типа double
     * @return возвращает корень числа
     */
    @Override
    public final double squareRoot(double a) {
        return currentResult =  calc.squareRoot(a);
    }
    /**
     * метод сохраняет в себе информацию о последнем использовании калькулятора
     */
    public void save(){
        memoryResult = currentResult;
        return;
    }
    /**
     * метод возвращает последнее использование калькулятора и обнуляет запись в save;
     * @return
     */
    public double getSaveResult(){
       double memory = memoryResult;
       memoryResult = 0;
       return memory;
    }
}
