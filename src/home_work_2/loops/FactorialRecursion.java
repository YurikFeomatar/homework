package home_work_2.loops;

import java.util.Scanner;

public class FactorialRecursion{
    /**
     * выводим факториал числа через рекурсию
     * @param number число факториала
     * @return результат типа long
     */
    public long recursion(long number) {
        if (number == 0) {
            return 1;
        }
        long result;
            result = number * recursion(number - 1);
        return result;
    }

    /**
     * проводит иттерацию n*n*n*n*
     * @param number
     * @return
     */
    public String itter(long number){
        long res =1;
        String totalRes = "";
        for (int i = 1; i <= number; i++) {
            res = number * i;
            if (i < number) {
                totalRes = totalRes + i + " * ";
            } else {
                totalRes = totalRes + i + " = ";
            }
        }
        return totalRes;
    }
}
