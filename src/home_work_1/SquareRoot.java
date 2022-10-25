package home_work_1;

public class SquareRoot {
    public static void main(String[] args) {
        int a =(int) (Math.random() * 10);
        int b =(int) (Math.random() * 10);
        int c =(int) (Math.random() * 10);
        System.out.println("a= "+ a + " / " + "b= "+ b + " / " + "c= " + c);

        double d =(b * b) - (4 * a * c);
        System.out.println("Дискриминант = " + d);
        if(d>=0){
            if(d==0) {
                double x1 = (-b + (Math.sqrt(d))) / (2 * a);
                System.out.println("Дискриминант равен 0. Корень квадратного уравнения = " + x1);
            }
            if(d!=0) {
                double x1 = (-b + (Math.sqrt(d))) / (2 * a);
                System.out.println("Первый корень квадратного уравнения = " + x1);
                double x2 = (-b - (Math.sqrt(d))) / (2 * a);
                System.out.println("Второй корень квадратного уравнения = " + x2);
            }
        } else{
            System.out.println("Дискриминант отрицательный. Уравенение не имеет корней");
            }
    }
}
