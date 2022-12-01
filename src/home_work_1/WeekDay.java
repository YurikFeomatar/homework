package home_work_1;
 import java.util.Scanner;
public class WeekDay {
    public static void main(String[] args) {
        final WeekDay var = new WeekDay();
        Scanner scan = new Scanner(System.in);
        System.out.println("Сегодня рабочий день? True or False?");
        if (scan.hasNextBoolean()) {
            boolean weekday = scan.nextBoolean();
                System.out.println("У вас отпуск?");
                if (scan.hasNextBoolean()) {
                    boolean vacation = scan.nextBoolean();
                    System.out.println(var.sleepIn(weekday,vacation));
                }else{
                    System.out.println("Вы ввели не логическое значение");
                }
            }else{
                System.out.println("Вы ввели не логическое значение");
            }
        }
    /**
     * получаем два параметра в статический метод
     * от заданного ответа из консоли выводим true or false ветки
     * @param weekday значение из консоли
     * @param vacation значение из консоли
     * @return
     */
    public String sleepIn(boolean weekday, boolean vacation){
        if(weekday){
            if(vacation){
                return "Вы можете сегодня поспать";
            }else{
                return "Вам нужно идти на работу";
            }
        }else{
            return "Вы можете сегодня поспать";
        }
    }
}