package home_work_1;

// вариант switch case

import home_work_1.api.ICommunicationPrinter;

import java.util.Scanner;

public class WhoAreYouThree implements ICommunicationPrinter {
    public String answer = "";
    /**
     * Выводит имя введенное в консоль
     * @return строку с именем
     */
    public String myNamePrint(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        answer = scan.nextLine();
        return answer;
    }
    /**
     * проходим првоерку в консоли и принимаем String имя в статический метод
     * в зависимости от ответа позвращаем весту true or false
     * использовались switch case
     * @param answer имя из консоли
     * @return строку с именем
     */
    public String welcom(String answer){
        String name;
        switch (answer){
            case "Вася": name = "Привет!\nЯ тебя так долго ждал.";
                break;
            case "вася": name = "Привет!\nЯ тебя так долго ждал.";
                break;
            case "Анастасия": name = "Я тебя так долго ждал.";
                break;
            case "анастасия": name = "Я тебя так долго ждал.";
                break;
            default: name = "Добрый день, а вы кто?";
                break;
        }
        return name;
    }
}
