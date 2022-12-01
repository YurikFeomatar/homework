package home_work_1;
    import java.util.Scanner;
public class DividerNumber {
    public static void main(String[] args) {
        final DividerNumber div = new DividerNumber();
        final Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        if (scan.hasNextInt()) {
            int num1 = scan.nextInt();
            if(num1!= 0){
                System.out.println("Введите второе число");
                if (scan.hasNextInt()) {
                    int num2 = scan.nextInt();
                    if(num2!= 0) {
                        System.out.println("Ваши числа " + num1 + " и " + num2);
                        System.out.println(div.divider(num1,num2));
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

    /**
     * проверяет, делится ли число на второе без остатка
     * @param num1 первое число
     * @param num2 второе число
     * @return строку с результатом
     */
    public String divider(int num1, int num2){
        if(num1%num2 == 0){
            return "Первое число делится на второе без остатка.";
        }else{
            return "Первое число не делится на второе без остатка.";
        }
    }
}
