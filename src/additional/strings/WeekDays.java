package additional.strings;
import java.util.Scanner;
public class WeekDays {
    public static void main(String[] args) {
        final WeekDays var = new WeekDays();
        final Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество дней и мы покажем сколько это недель");
        if(scan.hasNextInt()) {
            int days = scan.nextInt();
            var.numToWeek(days);
        }else{
            System.out.println("Вы ввели не число");
        }
    }

    /**
     * метод numToWeek принимает интовое количетсво дней с консоли и конвертирует его в недели, возвращая строку.
     * @param day принимает количество дней с консоли.
     * @return выдает строковое значение недель.
     */
    public String numToWeek(int day){
        String week = "";
        int weekD = 0;
        if(day > 0 ){
            weekD = day / 7;
            week = String.valueOf(weekD);
            if(weekD%10 == 0 || weekD%100 == 11 || weekD%10 >= 5 && weekD%10 <= 9){
                week += " недель";
            }
            if(weekD%10 >=2 && weekD%10 <=4){
                week += " недели";
            }
            if(weekD%10 == 1 && weekD%100 != 11){
                week += " неделя";
            }
            System.out.println(week);
        }else{
            System.out.println("Количетсво дней не может быть 0 или меньше");
        }
        return week;
    }
}
