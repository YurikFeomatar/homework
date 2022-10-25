package home_work_1;

public class EvenOddNumber {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 100.1);
        a = a%2 == 0 ? a + 1 : a;
        System.out.println("Первое число " + a);
        int b = (int) (Math.random() * 50)*2;
        System.out.println("Второе число " + b);
        int c = b%2 !=0 ? b:a;
        System.out.println("Нечетное число " + c);
    }
}