package home_work_2.loops;
public class Overflow {
    /**
     * задача с переполнением
     * @param args
     */
    public static void main(String[] args) {
        long a = 1;
        long b = 9_223_372_036_854_775_807L;
        long c = -9_223_372_036_854_775_808L;
        long d = 3;
        long e = 188;
        long f = -19;
        for (int i = 1 ; a > 0 ; i++) {
            a = a * d;
            if(a * d < 0 && a > 0){
                System.out.println("a * 3 до переполнения = " + a);
            }
        }
        System.out.println("a * 3 после переполнения = " + a);


        a = 1;
        while(a > 0){
            a = a * e;
            if(a * e < 0 && a > 0){
                System.out.println("a * 188 до переполнения = " + a);
            }
        }
        System.out.println("a * 188 после переполнения = " + a);

        a =1;
        long r = 799006685782884121L;
        while (true) {
            long res = a * f;
            if (res/a==f) {
                a = res;
                if(res == r ) {
                    System.out.println("a * -19 до переполнения = " + res);
                }
            }
            else{
                System.out.println("a * -19 после переполнения = " + res);
                break;
            }
        }
        r =(long)(Math.random()*1000000);
        a = 1;
        while(a > 0){
            a = a * r;
            if(a * r < 0 && a > 0){
                System.out.println("a * " + r + " до переполнения = " + a);
            }
        }
        System.out.println("a * " + r + " после переполнения = " + a);
    }
}
