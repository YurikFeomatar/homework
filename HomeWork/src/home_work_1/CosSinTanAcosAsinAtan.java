package home_work_1;

public class CosSinTanAcosAsinAtan {
    public static void main(String[] args) {
        int ugl =30;//(int) (Math.random() * 180);
        System.out.println("угол равен = "+ ugl);
        double sin = Math.sin(ugl);
        System.out.println("синус (30) = "+ sin + " радиан");
        double deg = Math.toDegrees(sin);

        double cos = Math.cos(ugl);
        System.out.println("косинус (30) = "+ cos + " радиан");
        double tan = Math.tan(ugl);
        System.out.println("тангенс (30) = "+ tan + " радиан");


        double asin = Math.asin(sin);
        System.out.println("арксинус () = "+ asin + " радиан");
        double acos = Math.acos(cos);
        System.out.println("арккосинус () = "+ acos + " радиан");
        double atan = Math.atan(tan);
        System.out.println("акртангенс () = "+ atan + " радиан");

    }
}
