package home_work_2.loops;

public class Factorial {
    /**
     * реализует факториал числа
     * @param number число факториала
     * @return строку с результатом
     */
    public String factorial(long number){
        long result = 1;
        String totalRes = "";
        if(number == 0){
            totalRes = totalRes + number + " = " + 1;
        }
        for (int i = 1; i <= number; i++) {
            result = result * i;
            if (i < number) {
                totalRes = totalRes + i + " * ";
            } else {
                totalRes = totalRes + i + " = " + result;
            }
        }
        return totalRes;
    }
}
