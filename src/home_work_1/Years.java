package home_work_1;
    import java.util.Scanner;
public class Years {
    public static void main( String[] args ) {
        final Years var = new Years();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите год, который хотите проверить");
        if(scan.hasNextInt()) {
            int year = scan.nextInt();
            System.out.println( "Проверяем ваш введенный год...." );
            System.out.println(var.years(year));
        }else{
            System.out.println("Вы ввели не число");
        }
    }

    /**
     * вычисляет високосный год
     * @param year год из консоли
     * @return строку с результатом
     */
    public String years(int year){
        if ( ( ( year%4 == 0 ) && ( year%100 != 0 ) ) || ( year%400 == 0 ) ) {
            return "Ваш год " + year + " високосный.";
        }
        else {
            return "Ваш год " + year + " не високосный.";
        }
    }
}
