package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private long counter;
    /**
     *  метод делит числа
     * @param d принимает значения типа double
     * @param e принимает значения типа double
     * @return возвращает деление чисел типа double
     */
    public double divisionA(double d, double e){
        counter += 1;
        return super.getDivision(d,e);
    }
    /**
     * метод возвращает деление (getter)
     * @param d
     * @param e
     * @return
     */
    public double getDivisionA(double d, double e){
        counter += 1;
        return division(d,e);
    }
    /**
     * метод умножает числа
     * @param b принимает значения типа double
     * @param c принимает значения типа double
     * @return возвращает умножение чисел типа double
     */
    public double multiplicationA(int b, double c){
        counter += 1;
        return super.getMultiplication(b,c);
    }
    /**
     * метод возвращает умножение (getter)
     * @param b
     * @param c
     * @return
     */
    public double getMultiplicationA(int b, double c){
        counter += 1;
        return multiplication(b,c);
    }
    /**
     * метод вычитает число из другого числа
     * @param g принимает значения типа double
     * @param l принимает значения типа double
     * @return возвращает вычитание чисел типа double
     */
    public double subtractionA(double g, double l){
        counter += 1;
        return super.getSubtraction(g,l);
    }
    /**
     * метод возвращает вычитание (getter)
     * @param g
     * @param l
     * @return
     */
    public double getSubtractionA(double g, double l){
        counter += 1;
        return subtraction(g,l);
    }
    /**
     * метод складывает числа
     * @param x принимает значения типа double
     * @param z принимает значения типа double
     * @return возвращает сложение чисел типа double
     */
    public double additionA(double x, double z){
        counter += 1;
        return super.getAddition(x,z);
    }
    /**
     * метод возвращает сумму (getter)
     * @param x
     * @param z
     * @return
     */
    public double getAdditionA(double x, double z){
        counter += 1;
        return addition(x,z);
    }
    /**
     * метод возводит в степень положительное число
     * @param a принимает значения типа double
     * @param x принимает значения типа double
     * @return возвращает число возведенное в степень типа double
     */
    public double exponentiationA(double a, double x){
        counter += 1;
        return super.getExponentiation(a, x);
    }
    /**
     * метод возвращает число в степени (getter)
     * @param a
     * @param x
     * @return
     */
    public double getExponentiationA(double a, double x){
        counter += 1;
        return exponentiation(a, x);
    }
    /**
     *  метод находит модуль числа
     * @param a принимает число типа double
     * @return возвращает модуль числа
     */
    public double moduleA(double a){
        counter += 1;
        return super.getModule(a);
    }
    /**
     * метод возвращает модуль числа (getter)
     * @param a
     * @return
     */
    public double getModuleA(double a){
        counter += 1;
        return module(a);
    }
    /**
     * метод находит корень числа
     * @param a принимает число типа double
     * @return возвращает корень числа
     */
    public double squareRootA(double a){
        counter += 1;
        return super.getSquareRoot(a);
    }
    /**
     * метод возвращает корень квадратный числа (getter)
     * @param a возвращает double значение
     * @return
     */
    public double getSquareRootA(double a){
        counter += 1;
        return squareRoot(a);
    }

    /**
     * метод возвращает количество запусков калькулятора
     * @return возвращает Лонг значение
     */
    public long getCountOperatorA(){
        return counter;
    }
}
