package home_work_1;

    import java.util.Scanner;
public class LetterOrNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите число от 0 до 127");
        if (scan.hasNextInt()) {
            int num1 = scan.nextInt();
            if(num1 >= 0) {
                if(num1<127) {
                    char ascii = (char) num1;
                    if (num1 >= 65 && num1 <= 122) {
                        System.out.println("Ваше введенное число " + num1 + " соответствует буквое английского алфавита по коду ASCII " + ascii);
                    } else {
                        System.out.println("Ваше введенное число " + num1 + " соответствует символу по коду ASCII");
                    }
                }else{System.out.println("Вы ввели число не соответствующее коду ASCII");
                }
            }else{
                System.out.println("Вы ввели число не соответствующее коду ASCII");
            }
        }else{
            System.out.println("Вы ввели не число");
        }

    }

}
