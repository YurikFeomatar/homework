package home_work_3.runners;

public class WithoutCalculatorMain {
    public static void main(String[] args) {
        double a = 4.1;
        int b = 15;
        double c = 7;
        int d = 28;
        double e = 5;
        double res = a + b * c + (d / e);
        System.out.println("результат = " + res * res);
        // для начала считаем то,что в скобках = 5.6 , далее считаем умножение = 105, далее слева считаем сложение
        // = 109.1, далее считаем след. сложение = 114.7, далее возводим в степень = 13156,09.
    }
}
