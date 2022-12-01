package home_work_1;

public class EvenOddNumber {
    public static void main(String[] args) {
        final EvenOddNumber rand = new EvenOddNumber();
        int a = (int) (Math.random() * 100.1);
        System.out.println("Первое число " + a);
        int b = (int) (Math.random() * 50)*2;
        System.out.println("Второе число " + b);
        System.out.println(rand.mathRand(a,b));
    }
    /**
     * находит нечетное число из двух чисел
     * @param a первое число
     * @param b второе число
     * @return строку с нечетным числом
     */
    public String mathRand(int a, int b){
        a = a% 2 == 0 ? a + 1 : a;
        int c = b% 2 != 0 ? b : a;
        return "Нечетное число " + c;
    }
}