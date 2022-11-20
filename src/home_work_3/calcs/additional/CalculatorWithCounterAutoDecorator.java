package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoDecorator implements ICalculator {

    private final ICalculator calculator;
    private long counter;
    public CalculatorWithCounterAutoDecorator(ICalculator calculator){
        this.calculator = calculator;
    }

    public ICalculator getCalculator(){
        return calculator;
    }
    public long getCountOperator(){
        return this.counter;
    }

    @Override
    public double division(double d, double e) {
        counter += 1;
        return calculator.division(d,e);
    }

    @Override
    public double multiplication(int b, double c) {
        counter += 1;
        return calculator.multiplication(b,c);
    }

    @Override
    public double subtraction(double g, double l) {
        counter += 1;
        return calculator.subtraction(g,l);
    }

    @Override
    public double addition(double x, double z) {
        counter += 1;
        return calculator.addition(x,z);
    }

    @Override
    public double exponentiation(double a, double x) {
        counter += 1;
        return calculator.exponentiation(a,x);
    }

    @Override
    public double module(double a) {
        counter += 1;
        return calculator.module(a);
    }

    @Override
    public double squareRoot(double a) {
        counter += 1;
        return calculator.squareRoot(a);
    }
}
