package home_work_3.calcs.api;

public interface ICalculator {
    /**
     * метод калькулятора - деление
     *
     * @param d
     * @param e
     * @return
     */
    double division(double d, double e);

    /**
     * метод калькулятора -  умножение
     *
     * @param b
     * @param c
     * @return
     */
    double multiplication(int b, double c);

    /**
     * метод калькулятора - вычитание
     *
     * @param g
     * @param l
     * @return
     */
    double subtraction(double g, double l);

    /**
     * метод калькулятора - сложение
     *
     * @param x
     * @param z
     * @return
     */
    double addition(double x, double z);

    /**
     * метод калькулятора - возведение в степень
     *
     * @param a
     * @param x
     * @return
     */
    double exponentiation(double a, double x);

    /**
     * метод калькулятора - модуль числа
     *
     * @param a
     * @return
     */
    double module(double a);

    /**
     * метод калькулятора - квадратный корень
     *
     * @param a
     * @return
     */
    double squareRoot(double a);
}

