package home_work_2.loops;
    import java.util.Scanner;
public class Exponenta {
    public static void main(String[] args) {
        final Scanner scan = new Scanner(System.in);
        System.out.println("Введите число, возводимое в степень");
            double num1 = scan.nextDouble();
            System.out.println("Введите степень");
            if(scan.hasNextInt()) {
            int expon = scan.nextInt();
            if(expon >0) {
                Exponenta ex = new Exponenta();
                System.out.println(ex.exponenta(num1,expon));
            }else{
                System.out.println("Вы ввели отрицательную степень");
            }
        }else {
            System.out.println("Введено не число или дробь");
        }
    }

    /**
     * возводит число в степень
     * @param num1 возводимое число из консоли
     * @param expon степень из консоли
     * @return строку с результатом
     */
    public String exponenta(double num1, int expon){
        double totalRes = num1;
        String result = "";
        if (num1 > 0) {
            for (int i = 1; i < expon; i++) {
                totalRes = totalRes * num1;
            }
            result = num1 + " ^ " + expon + " = " + totalRes;
        }
        return result;
    }
}
