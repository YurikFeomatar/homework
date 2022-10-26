package home_work_1;
    // вариант if else;

    import java.util.Scanner;

public class WhoAreYou {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        if (scan.hasNextLine()) {
            String answer = scan.nextLine();
            MyName(answer);
        }
    }

    /**
     * проходим првоерку в консоли и принимаем String имя в статический метод
     * в зависимости от ответа позвращаем весту true or false
     * использовались if else
     * @param answer
     * @return
     */
    public static String MyName(String answer){
        String name = answer;
            if (answer.equals("Вася")||answer.equals("вася")) {
                System.out.println("Привет!\nЯ тебя так долго ждал.");
            }
            if (answer.equals("Анастасия")||answer.equals("анастасия")) {
                System.out.println("Я тебя так долго ждал.");
            }
            if (!answer.equals("Вася") && !answer.equals("Анастасия") && !answer.equals("вася")&& !answer.equals("анастасия") ) {
                System.out.println("Добрый день, а вы кто?");
            }


        return name;
    }
}
