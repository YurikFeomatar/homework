package home_work_2.loops;

import java.util.Scanner;

public class FactorialRecursion{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число от 0 до 25");
        if(scan.hasNextLong()) {
            Long number = scan.nextLong();
            if(number > -1 && number <26) {
                long res =1;
                for (int i = 1; i <= number; i++) {
                    res = number * i;
                    if (i < number) {
                        System.out.print(i + " * ");
                    } else {
                        System.out.print(i);
                    }
                }
                System.out.println(" = " + recursion(number));
            }else{
                System.out.println("Ваше число не входит в заданный диапазон");
            }
        }else{
            System.out.println("Вы ввели не число");
        }
    }
    /**
     * Выводим число через консоль. проверяем на число и диапазон.
     * @param num метод принимает число,введенное в консоль,
     *            в методе задаем условие выхода.
     *            Возвращаем факториал числа с помощью рекурсии метода.
     *            т.е. метод будет вызывать сам себя,пока num не примет значение  0;
     *            если ввели  0, то по законам рекурсии 0 будет иметь единицу.
     *            Цикл в методе Main нужен для записи итерации n*n*n*n*n...
     * @return возвращает переменную * на рекурсивный метод переменной -1
     * до точки выхода;
     */
    public  static long recursion(long num) {
        if (num == 0) {
            return 1;
        }
        long result = 0;
            result = num * recursion(num - 1);
        return result;
    }
}
