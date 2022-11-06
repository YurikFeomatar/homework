package home_work_2.loops;
    import java.util.Scanner;
public class Exponenta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число, возводимое в степень");

            double num1 = scan.nextDouble();
            System.out.println("Введите степень");
            if(scan.hasNextInt()) {
            int expon = scan.nextInt();
            double totalRes =num1;
            if(expon >0) {
                if (num1 > 0) {
                    for (int i = 1; i < expon; i++) {
                        totalRes =totalRes  * expon;
                    }
                    System.out.println(num1 + " ^ " + expon + " = " + totalRes);
                }
            }else{
                System.out.println("Вы ввели отрицательную степень");
            }
        }else {
            System.out.println("Введено не число или дробь");
        }
    }
}
