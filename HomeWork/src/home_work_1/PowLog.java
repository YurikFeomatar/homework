package home_work_1;

public class PowLog {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        double res = Math.pow(a,b);
        System.out.println(res);

        double ges = Math.log(res);
        System.out.println(ges);

        double isp = Math.log10(ges);
        System.out.println(isp);

    }
}
