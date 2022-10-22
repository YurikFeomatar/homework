package home_work_1;

    import java.util.Scanner;
    //Попробовал вычислить двоичную c/с из числа 42.5.
    //Результатом стало то, что тип int ругался на дробь, прибегнув к очевидному преобразованию int x = (int)42.5, все сработало.
public class bitAndOr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите Ваше первое число"); //двоичная с/с числа 7890 = 11010010;
        if(scan.hasNextInt()) {
            int answer1 = scan.nextInt();
            System.out.println("Введите Ваше второе число"); //двоичная с/с числа 98765 = 11001101;
                if(scan.hasNextInt()) {
                    int answer2 = scan.nextInt();

                    int c = answer1 & answer2; //Побитовое И двух чисел 7890 и 98765 = 11000000;
                    int d = answer1 | answer2; //Побитовое ИЛИ двух чисел 7890 и 98765 = 11011111;

                    System.out.println("Ваши числа в десятичной с/с = " + answer1 + " и " + answer2);
                    System.out.println("Ваши числа в двоичной с/с = " + Integer.toBinaryString(answer1) + " и " + Integer.toBinaryString(answer2));
                    System.out.println("Побитовое И двух чисел = " + Integer.toBinaryString(c));
                    System.out.println("Побитовое ИЛИ двух чисел = " + Integer.toBinaryString(d));
                }else{
                    System.out.println("Введите натурально число");
                }
        }else {
            System.out.println("Введите натурально число");
        }
        int x = (int) 42.5;
        int y = 39;
        int z = x & y;
        int h = x | y;
        System.out.println("42.5 = " + Integer.toBinaryString(x));
        System.out.println("39 = " + Integer.toBinaryString(y));
        System.out.println("Побитовое И двух чисел = " + Integer.toBinaryString(z));
        System.out.println("Побитовое ИЛИ двух чисел = " + Integer.toBinaryString(h));

    }
}
