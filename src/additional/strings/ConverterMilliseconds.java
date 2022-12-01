package additional.strings;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class ConverterMilliseconds {
    public static void main(String[] args) {
        final ConverterMilliseconds var = new ConverterMilliseconds();
        final Scanner scan = new Scanner(System.in);
        System.out.println("Введите миллисекунды");
        if(scan.hasNextLong()){
            long mil = scan.nextLong();
            if(mil > 0) {
                System.out.println("хотите выбрать shortFormat? *true / false*");
                if (scan.hasNextBoolean()) {
                    boolean shortFormat = scan.nextBoolean();
                    System.out.println(var.toHoursMinuteSecondMillisecond(mil, shortFormat));
                } else {
                    System.out.println("вы ввели не true/false");
                }
            }else{
                System.out.println("Нельзя ввести отрицательное время");
            }
        }else{
            System.out.println("Вы ввели не число");
        }
    }
    /**
     *  обрабатывает long в строку и конвертирует миллисекунды в DATE; в зависимости от shortFormat (true / false)
     *  выдает либо короткий вариант записи, либо полный.
     * @param millisecond дереданные миллисекунды (long)
     * @param shortFormat вариант формата записи (boolean)
     * @return отформатированную строку с DATE;
     */
    public String toHoursMinuteSecondMillisecond(long millisecond, boolean shortFormat){
        long millisec = millisecond % 1000;
        String millisecName = " ";
        long seconds = (millisecond / 1000) % 60;
        String secondsName = " ";
        long hours = ((millisecond / 1000) / 60) / 60;
        long minutes = ((millisecond / 1000) / 60) - (hours * 60);
        String minutesName = " ";
        String hoursName = " ";
        String result = "null";
        if(millisecond >= 0){
           if(shortFormat){
               millisecond = millisecond - 10_800_000;
               SimpleDateFormat formater = new SimpleDateFormat("HH:mm:ss:SSS:z");
                result = formater.format(millisecond);
           }
           if(!shortFormat) {

               if (hours < 24) {
                   if (hours == 1 || hours == 21) {
                       hoursName = " час ";
                   }
                   if (hours > 1 && hours < 5 || hours == 22 || hours == 23) {
                       hoursName = " часа ";
                   }
                   if (hours == 0 || hours >= 5 && hours <= 20) {
                       hoursName = " часов ";
                   }
                   if (minutes == 1 || minutes == 21 || minutes == 31 || minutes == 41 || minutes == 51) {
                       minutesName = " минута ";
                   }
                   if (minutes == 2 || minutes == 3 || minutes == 4 || minutes == 22 || minutes == 23 || minutes == 24
                           || minutes == 32 || minutes == 33 || minutes == 34 || minutes == 42 || minutes == 43 || minutes == 44
                           || minutes == 52 || minutes == 53 || minutes == 54) {
                       minutesName = " минуты ";
                   }
                   if (minutes == 0 || minutes >= 5 && minutes <= 20 || minutes >= 25 && minutes <= 30 || minutes >= 35 && minutes <= 40
                           || minutes >= 45 && minutes <= 50 || minutes >= 55) {
                       minutesName = " минут ";
                   }
                   if (seconds == 1 || seconds == 21 || seconds == 31 || seconds == 41 || seconds == 51) {
                       secondsName = " секунда ";
                   }
                   if (seconds == 2 || seconds == 3 || seconds == 4 || seconds == 22 || seconds == 23 || seconds == 24
                           || seconds == 32 || seconds == 33 || seconds == 34 || seconds == 42 || seconds == 43 || seconds == 44
                           || seconds == 52 || seconds == 53 || seconds == 54) {
                       secondsName = " секунды ";
                   }
                   if (seconds == 0 || seconds >= 5 && seconds <= 20 || seconds >= 25 && seconds <= 30 || seconds >= 35 && seconds <= 40
                           || seconds >= 45 && seconds <= 50 || seconds >= 55) {
                       secondsName = " секунд ";
                   }
                   if (millisecond % 100 == 1 || millisecond % 10 == 1) {
                       millisecName = " миллисекунда ";
                   }
                   if (millisecond % 10 == 2 || millisecond % 10 == 3 || millisecond % 10 == 4 && millisecond != 14) {
                       millisecName = " миллисекунды ";
                   }
                   if (millisecond == 0 || millisecond >= 5 && millisecond <= 20 || millisecond >= 25 && millisecond <= 30 || millisecond >= 35
                           && millisecond <= 40 || millisecond >= 45 && millisecond <= 50 || millisecond >= 55
                           && millisecond <= 60 || millisecond >= 65 && millisecond <= 70 || millisecond >= 75
                           && millisecond <= 80 || millisecond >= 85 && millisecond <= 90 || millisecond >= 95 && millisecond%100 != 1) {
                       millisecName = " миллисекунд ";
                   }
                   result = hours + hoursName + minutes + minutesName + seconds + secondsName + millisec + millisecName;
               }else{
                   result = "в сутках всего 24 часа... ";
               }
           }
        }
        return result;
    }
}
