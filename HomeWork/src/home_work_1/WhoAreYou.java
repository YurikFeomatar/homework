package home_work_1;
    import java.util.Scanner;

public class WhoAreYou {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите ваше имя");

        if (scan.hasNextLine()) {
            String answer = scan.nextLine();
            if (answer.contains("Вася")||answer.contains("вася")) {
                Man.MyName();
            }
            if (answer.contains("Анастасия")||answer.contains("анастасия")) {
                Woman.MyName();
            }
            if (!answer.equals("Вася") && !answer.equals("Анастасия") && !answer.equals("вася")&& !answer.equals("анастасия") ) {
                Wtf.MyName();
            }
        }
    }
}
class Man{
    public static String MyName(){
        String hisName = "Вася";
        System.out.println("Привет!\nЯ тебя так долго ждал.");
        return hisName;
    }
}
class Woman{
    public static String MyName(){
        String herName = "Анастасия";
        System.out.println("Я тебя так долго ждал.");
        return herName;
    }
}
class Wtf{
    public static String MyName(){
        String wtfName = null ;
        System.out.println("Добрый день, а вы кто?");
        return wtfName;
    }
}