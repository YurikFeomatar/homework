package home_work_2.loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите число от 0 до 25");
        if (scan.hasNextLong()) {
            long number = scan.nextLong();
            if (number < 26){
                if (number > -1) {
                    long result = 1;
                    if(number == 0){
                        System.out.println(number + " = " + 1);
                    }
                    for (int i = 1; i <= number; i++) {
                        result = result * i;
                        if (i < number) {
                            System.out.print(i + " * ");
                        } else {
                            System.out.print(i + " = " + result);
                        }
                    }
                } else {
                    System.out.println("Вы ввели число меньше диапазона");
                }
            }else{
                System.out.println("Вы ввели число выше диапазона");
            }
        } else {
            System.out.println("Не корректные данные.");
        }
    }
}
