package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {
    /**
     *  метод делит числа
     * @param d принимает значения типа double
     * @param e принимает значения типа double
     * @return возвращает деление чисел типа double
     */
    public double division(double d, double e){
        double res1 = d / e;
        return res1;
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
    public double multiplication(int b, double c){
        double res2 = b * c;
        return res2;
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
    public double subtraction(double g, double l){
        double res3 = g - l;
        return res3;
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
    public double addition(double x, double z){
        double res4 = x + z;
        return res4;
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
    public double exponentiation(double a, double x){
        double res5 = 0;
            for (int i = 0; i < x; i++) {
                res5 = a * a;
            }
        return res5;
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
    public double module(double a){
        double res6 = 0;
        if(a > 0){
            res6 *= -1;
        }
        return res6;
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
    public double squareRoot(double a){
        double res7 = Math.sqrt(a);
        return res7;
    }
    /**
     * метод возвращает корень квадратный числа (getter)
     * @param a
     * @return
     */
    public double getSquareRoot(double a){
        return squareRoot(a);
    }
}
