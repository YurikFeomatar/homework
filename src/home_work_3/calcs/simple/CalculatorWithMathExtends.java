package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

/** данный класс наследует 4 метода из CalculatorWithOperator;
     * остальные три метода переопределяет
    *
    */
public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
    /**
     * метод возводит в степень положительное число
     * @param a принимает значения типа double
     * @param x принимает значения типа double
     * @return возвращает число возведенное в степень типа double
     */
    public double exponentiation(double a, double x){
        double res5 = 0;
        if(a > 0) {
            res5 = Math.pow(a,x);
        }else{
            System.out.println("Введите положительное число");
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
        double res6 = Math.abs(a);
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
