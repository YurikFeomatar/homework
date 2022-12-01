package home_work_2.loops;
public class Overflow {
    /**
     * задача с переполнением
     * @param args
     */
    public static void main(String[] args) {
        final Overflow over = new Overflow();
        final long a = 1;
        final long num = 3;
        System.out.println(over.overflowPlus(1,3));
        System.out.println(over.overflowMinus(1,-19));
    }

    /**
     * умножает одно положительное число на другое до переполнения
     * @param a первый множитель
     * @param num второй множитель
     * @return строку с результатом
     */
    public String overflowPlus(long a, long num){
        String resultBefore = "";
        String resultAfter = "";
        for (int i = 1 ; a > 0 ; i++) {
            a = a * num;
            if(a * num < 0 && a > 0){
                resultBefore = "a * num до переполнения = " + a;
            }
        }
        resultAfter = "a * num после переполнения = " + a;
        return resultBefore + " \n" +  resultAfter;
    }
    /**
     * умножает одно число на другое отрицательное до переполнения
     * @param a первый множитель
     * @param num второй множитель
     * @return строку с результатом
     */
    public String overflowMinus(long a, long num){
        String resultBefore = "";
        String resultAfter = "";
        long r = 799006685782884121L;
        while (true) {
            long res = a * num;
            if (res/a==num) {
                a = res;
                if(res == r ) {
                    resultBefore = "a * num до переполнения = " + a;
                }
            }
            else{
                resultAfter = "a * num после переполнения = " + res;
                break;
            }
        }
        return resultBefore + " \n" +  resultAfter;
    }
}
