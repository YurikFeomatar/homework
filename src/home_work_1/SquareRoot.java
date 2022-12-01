package home_work_1;

public class SquareRoot {
    public static void main(String[] args) {
        final SquareRoot var = new SquareRoot();
        final int a =(int) (Math.random() * 10);
        final int b =(int) (Math.random() * 10);
        final int c =(int) (Math.random() * 10);
        System.out.println("a= "+ a + " / " + "b= "+ b + " / " + "c= " + c);
        System.out.println("Дискриминант = " + var.dis(a,b,c));
        System.out.println(var.squareRoot(var.dis(a,b,c),a,b));

    }

    /**
     * вычисляет дискриминант
     * @param a первое число
     * @param b второе число
     * @param c третье число
     * @return строку с дискриминантом
     */
    public double dis(int a, int b, int c){
        double d =(b * b) - (4 * a * c);
        return d;
    }

    /**
     * вычисляет кв корень уравнения
     * @param d дискриминант
     * @param a первое число
     * @param b второе число
     * @return строку с результатом
     */
    public String squareRoot(double d, int a,int b){
        if(d >= 0){
            if(d == 0) {
                double x1 = (-b + (Math.sqrt(d))) / (2 * a);
                return "Дискриминант равен 0. Корень квадратного уравнения = " + x1;
            }
            if(d != 0) {
                double x1 = (-b + (Math.sqrt(d))) / (2 * a);
                double x2 = (-b - (Math.sqrt(d))) / (2 * a);
                return "Первый корень квадратного уравнения = " + x1 + " Второй корень квадратного уравнения = " + x2;
            }
        } else{
            return "Дискриминант отрицательный. Уравенение не имеет корней";
        }
        return "";
    }
}
