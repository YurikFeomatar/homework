package home_work_1;
// вариант if else if;

import java.util.Scanner;

public class WhoAreYouTwo {
    // Вариант с if else if;
    public static boolean isDebugMode = false;

    public static void main(String[] args) {
        checkStartDebugMod(args);
        if(isDebugMode){
            System.out.println("Начинаем дебажить");
        }
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите ваше имя");
        String answer = scan.nextLine();
        if (answer.equals("Вася") || answer.equals("вася")){
            if(isDebugMode){
                System.out.println("Мы попали в ветку True" + " Задали слово Вася");
            }
            ManTwo.MyName();

        }else
        if(isDebugMode){
            System.out.println("Мы попали в ветку false" + " Задали слово Вася");
        }

        if(answer.equals("Анастасия") || answer.equals("анастасия")){
            if(isDebugMode){
                System.out.println("Мы попали в ветку True" + " Задали слово Анастасия");
            }
            WomanTwo.MyName();
        } else
            if(isDebugMode){
                System.out.println("Мы попали в ветку false" + " Задали слово Анастасия");
            }
            if(!answer.equals("Вася") && !answer.equals("вася") && !answer.equals("Анастасия") && !answer.equals("анастасия")) {
            if(isDebugMode){
                System.out.println("Мы попали в ветку True" + " Задали любое другое имя");
            }
            WtfTwo.MyName();
        }
    }
    public static void checkStartDebugMod (String[] arr){
        for (String arg : arr) {
            if ("debug".equalsIgnoreCase(arg)) {
                isDebugMode = true;
            }
        }
    }
}
class ManTwo{
    public static String MyName(){
        String hisName = "Вася";
        System.out.println("Привет!\nЯ тебя так долго ждал.");
        return hisName;
    }
}
class WomanTwo{
    public static String MyName(){
        String herName = "Анастасия";
        System.out.println("Я тебя так долго ждал.");
        return herName;
    }
}
class WtfTwo{
    public static String MyName(){
        String wtfName = null ;
        System.out.println("Добрый день, а вы кто?");
        return wtfName;
    }
}
