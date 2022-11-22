package home_work_3.calcs.additional;
import home_work_3.calcs.api.ICalculator;
public class CalculatorWithMemoryDecorator implements ICalculator {
    private final ICalculator calculator;
    /**
     * конструктор принимающий экземпляр класса
     * @param
     */
    public CalculatorWithMemoryDecorator(ICalculator calculator){
        this.calculator = calculator;
    }
    protected double currentResult;
    protected double memoryResult;

    /**
     * метод возвращающий вложенный калькулятор
     * @return
     */
    public ICalculator getCalculator(){
        return this.calculator;
    }

    /**
     * метод делегирующий деление.
     * @param d
     * @param e
     * @return
     */
    @Override
    public double division(double d, double e) {
        return currentResult = calculator.division(d,e);
    }
    /**
     * метод делегирующий умножение
     * @param b
     * @param c
     * @return
     */
    @Override
    public double multiplication(int b, double c) {
        return currentResult = calculator.multiplication(b,c);
    }
    /**
     * метод делегирующий вычитание
     * @param g
     * @param l
     * @return
     */
    @Override
    public double subtraction(double g, double l) {
        return currentResult = calculator.subtraction(g,l);
    }
    /**
     * метод делегирующий сумму
     * @param x
     * @param z
     * @return
     */
    @Override
    public double addition(double x, double z) {
        return currentResult = calculator.addition(x,z);
    }
    /**
     * метод делегирующий возведение в степень
     * @param a
     * @param x
     * @return
     */
    @Override
    public double exponentiation(double a, double x) {
        return currentResult = calculator.exponentiation(a,x);
    }
    /**
     * метод делегирующий получение модуля числа
     * @param a
     * @return
     */
    @Override
    public double module(double a) {
        return currentResult = calculator.module(a);
    }
    /**
     * метод делегирующий извлечение квадратного корня числа
     * @param a
     * @return
     */
    @Override
    public double squareRoot(double a) {
        return currentResult = calculator.squareRoot(a);
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
