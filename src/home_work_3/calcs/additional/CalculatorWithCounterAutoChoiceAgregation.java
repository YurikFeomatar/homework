package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {
    public CalculatorWithOperator calc1;
    private CalculatorWithMathCopy calc2;
    private CalculatorWithMathExtends calc3;
    /**
     * конструктор, содержащий в себе первый калькулятор типа CalculatorWithOperator
     * @param calc1
     */
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calc1) {
        this.calc1 = new CalculatorWithOperator();
    }
    /**
     * конструктор, содержащий в себе второй калькулятор типа CalculatorWithMathCopy
     * @param calc2
     */
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calc2) {
        this.calc2 = new CalculatorWithMathCopy();
        }
    /**
     * конструктор, содержащий в себе третий калькулятор типа CalculatorWithMathExtends
     * @param calc3
     */
    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calc3){
        this.calc3 = new CalculatorWithMathExtends();
    }
    private long counter;
    /**
     *  метод делит числа
     * @param d принимает значения типа double
     * @param e принимает значения типа double
     * @return возвращает деление чисел типа double
     */
    private double divisionCalc1( double d, double e){
        counter += 1;
        return calc1.getDivision(d,e);
    }

    /**
     * метод возвращает деление (getter)
     * @param d
     * @param e
     * @return
     */
    public double getDivisionCalc1(double d, double e){
        return divisionCalc1(d,e);
    }

    /**
     * метод умножает числа
     * @param b принимает значения типа double
     * @param c принимает значения типа double
     * @return возвращает умножение чисел типа double
     */
    private double multiplicationCalc1(int b, double c){
        counter += 1;
        return calc1.getMultiplication(b,c);
    }
    /**
     * метод возвращает умножение (getter)
     * @param d
     * @param c
     * @return
     */
    public double getMultiplicationCalc1(int d, double c){
        return multiplicationCalc1(d,c);
    }
    /**
     * метод вычитает число из другого числа
     * @param g принимает значения типа double
     * @param l принимает значения типа double
     * @return возвращает вычитание чисел типа double
     */
    private double subtractionCalc1(double g, double l){
        counter += 1;
        return calc1.getSubtraction(g,l);
    }
    /**
     * метод возвращает вычитание (getter)
     * @param g
     * @param l
     * @return
     */
    public double getSubtractionCalc1(double g, double l){
        return subtractionCalc1(g,l);
    }
    /**
     * метод складывает числа
     * @param x принимает значения типа double
     * @param z принимает значения типа double
     * @return возвращает сложение чисел типа double
     */
    private double additionCalc1(double x, double z){
        counter += 1;
        return calc1.getAddition(x,z);
    }
    /**
     * метод возвращает сумму (getter)
     * @param x
     * @param z
     * @return
     */
    public double getAdditionCalc1(double x, double z){
        return additionCalc1(x,z);
    }
    /**
     * метод возводит в степень положительное число
     * @param a принимает значения типа double
     * @param x принимает значения типа double
     * @return возвращает число возведенное в степень типа double
     */
    private double exponentiationCalc1(double a, double x){
        counter += 1;
        return calc1.getExponentiation(a,x);
    }
    /**
     * метод возвращает число в степени (getter)
     * @param a
     * @param x
     * @return
     */
    public double getExponentiationCalc1(double a, double x){
        return exponentiationCalc1(a,x);
    }
    /**
     *  метод находит модуль числа
     * @param a принимает число типа double
     * @return возвращает модуль числа
     */
    private double moduleCalc1(double a){
        counter += 1;
        return calc1.getModule(a);
    }
    /**
     * метод возвращает модуль числа (getter)
     * @param a
     * @return
     */
    public double getModuleCalc1(double a){
        return moduleCalc1(a);
    }
    /**
     * метод находит корень числа
     * @param a принимает число типа double
     * @return возвращает корень числа
     */
    private double squareRootCalc1(double a){
        counter += 1;
        return calc1.getSquareRoot(a);
    }
    /**
     * метод возвращает корень квадратный числа (getter)
     * @param a
     * @return
     */
    public double getSquareRootCalc1(double a){
        return squareRootCalc1(a);
    }
    /**
     *  метод делит числа
     * @param d принимает значения типа double
     * @param e принимает значения типа double
     * @return возвращает деление чисел типа double
     */
    private double divisionCalc2( double d, double e){
        counter += 1;
        return calc2.getDivision(d,e);
    }

    /**
     * метод возвращает деление (getter)
     * @param d
     * @param e
     * @return
     */
    public double getDivisionCalc2(double d, double e){
        return divisionCalc2(d,e);
    }

    /**
     * метод умножает числа
     * @param b принимает значения типа double
     * @param c принимает значения типа double
     * @return возвращает умножение чисел типа double
     */
    private double multiplicationCalc2(int b, double c){
        counter += 1;
        return calc2.getMultiplication(b,c);
    }
    /**
     * метод возвращает умножение (getter)
     * @param d
     * @param c
     * @return
     */
    public double getMultiplicationCalc2(int d, double c){
        return multiplicationCalc2(d,c);
    }
    /**
     * метод вычитает число из другого числа
     * @param g принимает значения типа double
     * @param l принимает значения типа double
     * @return возвращает вычитание чисел типа double
     */
    private double subtractionCalc2(double g, double l){
        counter += 1;
        return calc2.getSubtraction(g,l);
    }
    /**
     * метод возвращает вычитание (getter)
     * @param g
     * @param l
     * @return
     */
    public double getSubtractionCalc2(double g, double l){
        return subtractionCalc2(g,l);
    }
    /**
     * метод складывает числа
     * @param x принимает значения типа double
     * @param z принимает значения типа double
     * @return возвращает сложение чисел типа double
     */
    private double additionCalc2(double x, double z){
        counter += 1;
        return calc2.getAddition(x,z);
    }
    /**
     * метод возвращает сумму (getter)
     * @param x
     * @param z
     * @return
     */
    public double getAdditionCalc2(double x, double z){
        return additionCalc2(x,z);
    }
    /**
     * метод возводит в степень положительное число
     * @param a принимает значения типа double
     * @param x принимает значения типа double
     * @return возвращает число возведенное в степень типа double
     */
    private double exponentiationCalc2(double a, double x){
        counter += 1;
        return calc2.getExponentiation(a,x);
    }
    /**
     * метод возвращает число в степени (getter)
     * @param a
     * @param x
     * @return
     */
    public double getExponentiationCalc2(double a, double x){
        return exponentiationCalc2(a,x);
    }
    /**
     *  метод находит модуль числа
     * @param a принимает число типа double
     * @return возвращает модуль числа
     */
    private double moduleCalc2(double a){
        counter += 1;
        return calc2.getModule(a);
    }
    /**
     * метод возвращает модуль числа (getter)
     * @param a
     * @return
     */
    public double getModuleCalc2(double a){
        return moduleCalc2(a);
    }
    /**
     * метод находит корень числа
     * @param a принимает число типа double
     * @return возвращает корень числа
     */
    private double squareRootCalc2(double a){
        counter += 1;
        return calc2.getSquareRoot(a);
    }
    /**
     * метод возвращает корень квадратный числа (getter)
     * @param a
     * @return
     */
    public double getSquareRootCalc2(double a){
        return squareRootCalc2(a);
    }
    /**
     *  метод делит числа
     * @param d принимает значения типа double
     * @param e принимает значения типа double
     * @return возвращает деление чисел типа double
     */
    private double divisionCalc3( double d, double e){
        counter += 1;
        return calc3.getDivision(d,e);
    }

    /**
     * метод возвращает деление (getter)
     * @param d
     * @param e
     * @return
     */
    public double getDivisionCalc3(double d, double e){
        return divisionCalc3(d,e);
    }

    /**
     * метод умножает числа
     * @param b принимает значения типа double
     * @param c принимает значения типа double
     * @return возвращает умножение чисел типа double
     */
    private double multiplicationCalc3(int b, double c){
        counter += 1;
        return calc3.getMultiplication(b,c);
    }
    /**
     * метод возвращает умножение (getter)
     * @param d
     * @param c
     * @return
     */
    public double getMultiplicationCalc3(int d, double c){
        return multiplicationCalc3(d,c);
    }
    /**
     * метод вычитает число из другого числа
     * @param g принимает значения типа double
     * @param l принимает значения типа double
     * @return возвращает вычитание чисел типа double
     */
    private double subtractionCalc3(double g, double l){
        counter += 1;
        return calc3.getSubtraction(g,l);
    }
    /**
     * метод возвращает вычитание (getter)
     * @param g
     * @param l
     * @return
     */
    public double getSubtractionCalc3(double g, double l){
        return subtractionCalc3(g,l);
    }
    /**
     * метод складывает числа
     * @param x принимает значения типа double
     * @param z принимает значения типа double
     * @return возвращает сложение чисел типа double
     */
    private double additionCalc3(double x, double z){
        counter += 1;
        return calc3.getAddition(x,z);
    }
    /**
     * метод возвращает сумму (getter)
     * @param x
     * @param z
     * @return
     */
    public double getAdditionCalc3(double x, double z){
        return additionCalc3(x,z);
    }
    /**
     * метод возводит в степень положительное число
     * @param a принимает значения типа double
     * @param x принимает значения типа double
     * @return возвращает число возведенное в степень типа double
     */
    private double exponentiationCalc3(double a, double x){
        counter += 1;
        return calc3.getExponentiation(a,x);
    }
    /**
     * метод возвращает число в степени (getter)
     * @param a
     * @param x
     * @return
     */
    public double getExponentiationCalc3(double a, double x){
        return exponentiationCalc3(a,x);
    }
    /**
     *  метод находит модуль числа
     * @param a принимает число типа double
     * @return возвращает модуль числа
     */
    private double moduleCalc3(double a){
        counter += 1;
        return calc3.getModule(a);
    }
    /**
     * метод возвращает модуль числа (getter)
     * @param a
     * @return
     */
    public double getModuleCalc3(double a){
        return moduleCalc3(a);
    }
    /**
     * метод находит корень числа
     * @param a принимает число типа double
     * @return возвращает корень числа
     */
    private double squareRootCalc3(double a){
        counter += 1;
        return calc3.getSquareRoot(a);
    }
    /**
     * метод возвращает корень квадратный числа (getter)
     * @param a
     * @return
     */
    public double getSquareRootCalc3(double a){
        return squareRootCalc3(a);
    }

    /**
     * метод возвращает количество использований калькуляторов (getter)
     * @return
     */
    public long getCountOperator(){
        return counter;
    }
}
