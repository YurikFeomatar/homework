package home_work_1;
    import java.util.Scanner;
public class DividerNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите первое число");
        if (scan.hasNextDouble()) {
            double num1 = scan.nextDouble();
            if(num1!=0){
                System.out.println("Введите второе число");
                if (scan.hasNextDouble()) {
                    double num2 = scan.nextInt();
                    if(num2!=0) {
                        System.out.println("Ваши числа " + num1 + " и " + num2);
                        double res = num1/num2;
                        if(num1 % num2 == 0){
                            System.out.println("Первое число делится на второе без остатка. Результат равен " +(int)res);
                        }else{
                            System.out.println("Первое число не делится на второе без остатка. Результат равен " +res);
                        }
                    }else{
                        System.out.println("Вы ввели 0.");
                    }
                }else{
                    System.out.println("Вы ввели не целое число");
                }
            }else{
                System.out.println("Вы ввели 0.");
            }
        }else{
            System.out.println("Вы ввели не целое число");
        }
    }
}
