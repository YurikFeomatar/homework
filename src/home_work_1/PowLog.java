package home_work_1;

public class PowLog {
    public static void main(String[] args) {
        final PowLog var = new PowLog();
        int a = 10;
        int b = 2;
        System.out.println(var.pow(a,b));
        System.out.println(var.log(a,b));
        System.out.println(var.log10(a,b));
    }

    /**
     * возводит число в степень
     * @param a первое число
     * @param b второе число
     * @return строку с результатом
     */
    public String pow(int a, int b){
        double res = Math.pow(a,b);
        return "pow = " + res;
    }

    /**
     * находит голорифм числа
     * @param a
     * @param b
     * @return строку с результатом
     */
    public String log(int a,int b){
        return "log = " + Math.log(Math.pow(a,b));
    }

    /**
     * находит десятичный логорифм числа
     * @param a
     * @param b
     * @return строку с результатом
     */
    public String log10(int a, int b){
        return "log10 = " + Math.log10(Math.log(Math.pow(a,b)));
    }
}
