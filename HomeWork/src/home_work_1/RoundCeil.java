package home_work_1;

public class RoundCeil {
    public static void main(String[] args) {
        double a = (Math.random() * 11000)  -5000;
        System.out.println("Дано число вещественного типа : " + a);
        double b = Math.round(a);
        System.out.println("Округление числа a = " + b);


        double c = (Math.random() * 11000) -5000;
        System.out.println("Дано число вещественного типа :" + c);
        double d = Math.ceil(c);
        System.out.println("Ближайшее число к числу с нулевой дробной частью " + d);
    }
}
