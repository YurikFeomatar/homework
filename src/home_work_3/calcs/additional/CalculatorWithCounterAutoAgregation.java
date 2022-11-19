package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoAgregation {
    private final CalculatorWithMathCopy calc;

    /**
     * конструктор, содержащий в себе экземпляр класса типа CalculatorWithMathCopy
     */
    public CalculatorWithCounterAutoAgregation(){
        calc = new CalculatorWithMathCopy();
    }
    private long counter;
    /**
     *  метод делит числа
     * @param d принимает значения типа double
     * @param e принимает значения типа double
     * @return возвращает деление чисел типа double
     */
    private double division( double d, double e){
        counter += 1;
        return calc.getDivision(d,e);
    }

    /**
     * метод возвращает деление (getter)
     * @param d
     * @param e
     * @return
     */
    public double getDivision(double d, double e){
        return division(d,e);
    }

    /**
     * метод умножает числа
     * @param b принимает значения типа double
     * @param c принимает значения типа double
     * @return возвращает умножение чисел типа double
     */
    private double multiplication(int b, double c){
        counter += 1;
        return calc.getMultiplication(b,c);
    }
    /**
     * метод возвращает умножение (getter)
     * @param d
     * @param c
     * @return
     */
    public double getMultiplication(int d, double c){
        return multiplication(d,c);
    }
    /**
     * метод вычитает число из другого числа
     * @param g принимает значения типа double
     * @param l принимает значения типа double
     * @return возвращает вычитание чисел типа double
     */
    private double subtraction(double g, double l){
        counter += 1;
        return calc.getSubtraction(g,l);
    }
    /**
     * метод возвращает вычитание (getter)
     * @param g
     * @param l
     * @return
     */
    public double getSubtraction(double g, double l){
        return subtraction(g,l);
    }
    /**
     * метод складывает числа
     * @param x принимает значения типа double
     * @param z принимает значения типа double
     * @return возвращает сложение чисел типа double
     */
    private double addition(double x, double z){
        counter += 1;
        return calc.getAddition(x,z);
    }
    /**
     * метод возвращает сумму (getter)
     * @param x
     * @param z
     * @return
     */
    public double getAddition(double x, double z){
        return addition(x,z);
    }
    /**
     * метод возводит в степень положительное число
     * @param a принимает значения типа double
     * @param x принимает значения типа double
     * @return возвращает число возведенное в степень типа double
     */
    private double exponentiation(double a, double x){
        counter += 1;
        return calc.getExponentiation(a,x);
    }
    /**
     * метод возвращает число в степени (getter)
     * @param a
     * @param x
     * @return
     */
    public double getExponentiation(double a, double x){
        return exponentiation(a,x);
    }
    /**
     *  метод находит модуль числа
     * @param a принимает число типа double
     * @return возвращает модуль числа
     */
    private double module(double a){
        counter += 1;
        return calc.getModule(a);
    }
    /**
     * метод возвращает модуль числа (getter)
     * @param a
     * @return
     */
    public double getModule(double a){
        return module(a);
    }
    /**
     * метод находит корень числа
     * @param a принимает число типа double
     * @return возвращает корень числа
     */
    private double squareRoot(double a){
        counter += 1;
        return calc.getSquareRoot(a);
    }
    /**
     * метод возвращает корень квадратный числа (getter)
     * @param a
     * @return
     */
    public double getSquareRoot(double a){
        return squareRoot(a);
    }

    /**
     * метод возвращает количество использований калькулятора (getter)
     * @return
     */
    public long getCountOperator(){
        return counter;
    }
}
