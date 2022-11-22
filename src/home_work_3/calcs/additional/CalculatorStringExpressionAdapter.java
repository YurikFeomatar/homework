package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorStringExpressionAdapter implements ICalculator {
    CalculatorStringExpression calc;
    public CalculatorStringExpressionAdapter(CalculatorStringExpression calc){
        this.calc = calc;
    }

    @Override
    public double division(double d, double e) {
        return 0;
    }

    @Override
    public double multiplication(int b, double c) {
        return 0;
    }

    @Override
    public double subtraction(double g, double l) {
        return 0;
    }

    @Override
    public double addition(double x, double z) {
        return 0;
    }

    @Override
    public double exponentiation(double a, double x) {
        return 0;
    }

    @Override
    public double module(double a) {
        return 0;
    }

    @Override
    public double squareRoot(double a) {
        return 0;
    }
}
