package home_work_1;


import java.util.Scanner;

public class WhoAreYouTwo {
    public static boolean isDebugMode = false;

    public static void main(String[] args) {// вариант if else if/;
        checkStartDebugMod(args);
        if(isDebugMode){
            System.out.println("Начинаем дебажить");
        }
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
     * использовались if else if
     * @param arr
     */
    public static void checkStartDebugMod (String[] arr){
        for (String arg : arr) {
            if ("debug".equalsIgnoreCase(arg)) {
                isDebugMode = true;
            }
        }
    }
    public static String MyName(String answer){
        String name = answer;
        if (name.equals("Вася") || name.equals("вася")){
            System.out.println("Привет!\nЯ тебя так долго ждал.");
        }else
        if(answer.equals("Анастасия") || answer.equals("анастасия")){
            System.out.println("Я тебя так долго ждал.");
        } else
        if(!answer.equals("Вася") && !answer.equals("вася") && !answer.equals("Анастасия") && !answer.equals("анастасия")) {
            System.out.println("Добрый день, а вы кто?");
        }
        return name;
    }
}
