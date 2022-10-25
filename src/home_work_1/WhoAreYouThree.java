package home_work_1;

// вариант switch case

import java.util.Scanner;

public class WhoAreYouThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите ваше имя");
        String answer = scan.nextLine();
        switch (answer){
            case "Вася": ManThree.MyName();
                break;
            case "вася": ManThree.MyName();
                break;
            case "Анастасия": WomanThree.MyName();
                break;
            case "анастасия": WomanThree.MyName();
                break;
            default:
                WtfThree.MyName();
                break;
        }
    }
}
class ManThree{
    public static String MyName(){
        String hisName = "Вася";
        System.out.println("Привет!\nЯ тебя так долго ждал.");
        return hisName;
    }
}
class WomanThree{
    public static String MyName(){
        String herName = "Анастасия";
        System.out.println("Я тебя так долго ждал.");
        return herName;
    }
}
class WtfThree{
    public static String MyName(){
        String wtfName = null ;
        System.out.println("Добрый день, а вы кто?");
        return wtfName;
    }
}
