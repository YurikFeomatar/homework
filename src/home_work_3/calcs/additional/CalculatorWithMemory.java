package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemory implements ICalculator {

    ICalculator calc;
    public CalculatorWithMemory(ICalculator calc){
        this.calc = calc;
    }
    double saveResult;
    @Override
    public double division(double d, double e) {
        saveResult = calc.division(d,e);
        return calc.division(d,e);
    }

    @Override
    public double multiplication(int b, double c) {
        saveResult = calc.multiplication(b,c);
        return calc.multiplication(b,c);
    }

    @Override
    public double subtraction(double g, double l) {
        saveResult = calc.subtraction(g,l);
        return calc.subtraction(g,l);
    }

    @Override
    public double addition(double x, double z) {
        saveResult = calc.addition(x,z);
        return calc.addition(x,z);
    }

    @Override
    public double exponentiation(double a, double x) {
        saveResult = calc.exponentiation(a,x);
        return calc.exponentiation(a,x);
    }

    @Override
    public double module(double a) {
        saveResult = calc.module(a);
        return calc.module(a);
    }

    @Override
    public double squareRoot(double a) {
        saveResult = calc.squareRoot(a);
        return calc.squareRoot(a);
    }
    public void save(){
    saveResult = saveResult;
    return;
    }
    public double getSaveResult(){
       return saveResult;
    }
}
