package home_work_1;

// вариант switch case

import java.util.Scanner;

public class WhoAreYouThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите ваше имя");
        String answer = scan.nextLine();
        MyName(answer);

    }

    /**
     * проходим првоерку в консоли и принимаем String имя в статический метод
     * в зависимости от ответа позвращаем весту true or false
     * использовались switch case
     * @param answer
     * @return
     */
    public static String MyName(String answer){
        String name = answer;
        switch (answer){
            case "Вася": System.out.println("Привет!\nЯ тебя так долго ждал.");
                break;
            case "вася": System.out.println("Привет!\nЯ тебя так долго ждал.");
                break;
            case "Анастасия": System.out.println("Я тебя так долго ждал.");
                break;
            case "анастасия": System.out.println("Я тебя так долго ждал.");
                break;
            default: System.out.println("Добрый день, а вы кто?");
                break;
        }
        return name;
    }
}
