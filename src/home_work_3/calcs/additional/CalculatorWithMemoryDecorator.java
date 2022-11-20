package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMemoryDecorator implements ICalculator {
    private final CalculatorWithMathExtends calculator;

    public CalculatorWithMemoryDecorator(CalculatorWithMathExtends calculator){
        this.calculator = calculator;
    }
    protected double currentResult;
    protected double memoryResult;


    public ICalculator getCalculator(){
        return calculator;
    }


    @Override
    public double division(double d, double e) {
        return currentResult = calculator.division(d,e);
    }

    @Override
    public double multiplication(int b, double c) {
        return currentResult = calculator.multiplication(b,c);
    }

    @Override
    public double subtraction(double g, double l) {
        return currentResult = calculator.subtraction(g,l);
    }

    @Override
    public double addition(double x, double z) {
        return currentResult = calculator.addition(x,z);
    }

    @Override
    public double exponentiation(double a, double x) {
        return currentResult = calculator.exponentiation(a,x);
    }

    @Override
    public double module(double a) {
        return currentResult = calculator.module(a);
    }

    @Override
    public double squareRoot(double a) {
        return currentResult = calculator.getSquareRoot(a);
    }
    /**
     * метод сохраняет в себе информацию о последнем использовании калькулятора
     */
    public void save1(){
        memoryResult = currentResult;
        return;
    }
    /**
     * метод возвращает последнее использование калькулятора и обнуляет запись в save;
     * @return
     */
    public double getSaveResult1(){
        double memory = memoryResult;
        memoryResult = 0;
        return memory;
    }
}
