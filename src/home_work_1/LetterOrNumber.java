package home_work_1;

    import java.util.Scanner;
public class LetterOrNumber {
    public static void main(String[] args) {
        final LetterOrNumber var = new LetterOrNumber();
        final Scanner scan = new Scanner(System.in);

        System.out.println("Введите число от 0 до 127");
        if (scan.hasNextInt()) {
            int num1 = scan.nextInt();
            System.out.println(var.charASCII(num1));
        }else{
            System.out.println("Вы ввели не число");
        }
    }

    /**
     * проверяет введенный порядковый номер по таблице ASCII
     * @param num1 число из консоли
     * @return строку с соответствием коду ASCII
     */
    public String charASCII(int num1){
        if(num1 >= 0) {
            if(num1<127) {
                char ascii = (char) num1;
                if (num1 >= 65 && num1 <= 122) {
                    return "Ваше введенное число " + num1 + " соответствует буквое " + "\'" + ascii + "\'" + " английского алфавита по коду ASCII";
                } else {
                    return "Ваше введенное число " + num1 + " соответствует символу " + "\'" + ascii + "\'" + " по коду ASCII";
                }
            }else{
                return "Вы ввели число не соответствующее коду ASCII";
            }
        }else{
            return "Вы ввели число не соответствующее коду ASCII";
        }
    }
}
