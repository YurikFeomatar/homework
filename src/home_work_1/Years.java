package home_work_1;
    import java.util.Scanner;
public class Years {
    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите год, который хотите проверить");

        if(scan.hasNextInt()) {
            int year = scan.nextInt();
            System.out.println( "Проверяем ваш введенный год...." );
            if ( ( ( year%4 == 0 ) && ( year%100 != 0 ) ) || ( year%400 == 0 ) ) {
                System.out.println( "Ваш год " + year + " високосный.");
            }
            else {
                System.out.println( "Ваш год " + year + " не високосный.");
            }
        }else{
            System.out.println("Вы ввели не число");
        }
    }
}
