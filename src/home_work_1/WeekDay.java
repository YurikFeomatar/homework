package home_work_1;
 import java.util.Scanner;
public class WeekDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Сегодня рабочий день? True or False?");
        if(scan.hasNextBoolean()) {
            String answer = scan.nextLine();
            if (answer.contains("True")||answer.contains("true")) {
                System.out.println("У вас отпуск?");
                if(scan.hasNextBoolean()) {
                    String answer2 = scan.nextLine();

                    if (answer2.contains("False")||answer2.contains("false")) {
                        Day.sleepIn(true, false);
                        return;
                    } else {
                        Day.sleepIn(true, true);
                    }
                }else{
                    System.out.println("Вы ввели не логическое значение");
                }
            }
                if(answer.contains("False")||answer.contains("false")) {
                        Day.sleepIn(false, true);
                }
        }else {
            System.out.println("Вы ввели не логическое значение");
        }
    }
}

class Day {
    static boolean sleepIn(boolean weekday,boolean vacation) {
        if(weekday == true) {
            if (vacation != true) {
                System.out.println("Вам нужно идти на работу");
            }else{
                System.out.println("Вы можете ещё поспать");
            }
        }
        if(weekday == false){
            System.out.println("Вы можете ещё поспать");
        }
        return false;
    }
}
