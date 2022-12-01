package home_work_1;

    import java.util.Scanner;
    //Попробовал вычислить двоичную c/с из числа 42.5.
    //Результатом стало то, что тип int ругался на дробь, прибегнув к очевидному преобразованию int x = (int)42.5, все сработало.
public class BitAndOr {
    public static void main(String[] args) {
        final BitAndOr var = new BitAndOr();
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите Ваше первое число"); //двоичная с/с числа 7890 = 11010010;
        if(scan.hasNextInt()) {
            int answer1 = scan.nextInt();
            System.out.println("Введите Ваше второе число"); //двоичная с/с числа 98765 = 11001101;
                if(scan.hasNextInt()) {
                    int answer2 = scan.nextInt();
                    System.out.println(var.decimalNum(answer1,answer2));
                    System.out.println(var.binaryNum(answer1,answer2));
                    System.out.println(var.bitAnd(answer1,answer2));
                    System.out.println(var.bitOr(answer1,answer2));
                }else{
                    System.out.println("Введите натурально число");
                }
        }else {
            System.out.println("Введите натурально число");
            return;
        }
        System.out.println(var.decimalNum1());

    }
        /**
         * выводит числа, введенные в консоль
         * @param ans1 первое число из консоли
         * @param ans2 второе число из консоли
         * @return строка c числами в десятичной с/с
         */
    public String decimalNum(int ans1, int ans2){
        return "Ваши числа в десятичной с/с = " + ans1 + " и " + ans2;
    }
        /**
         * конвертирует числа из десятичной с/с в двоичную
         * @param ans1 первое число из консоли
         * @param ans2 второе число из консоли
         * @return строка c числами в двоичной с/с
         */
    public String binaryNum(int ans1, int ans2){
        return "Ваши числа в двоичной с/с = " +  Integer.toBinaryString(ans1) + " и " + Integer.toBinaryString(ans2);
    }
        /**
         * проводит операцию побитового И
         * @param ans1 первое число из консоли
         * @param ans2 второе число из консоли
         * @return результат побитового И двух чисел
         */
    public String bitAnd(int ans1, int ans2){
        int result = ans1 & ans2;
        return "Побитовое И двух чисел = " + Integer.toBinaryString(result);
    }
        /**
         * проводит операцию побитового ИЛИ
         * @param ans1 первое число из консоли
         * @param ans2 второе число из консоли
         * @return результат побитового ИЛИ двух чисел
         */
    public String bitOr(int ans1, int ans2){
        int result = ans1 | ans2;
        return "Побитовое ИЛИ двух чисел = " + Integer.toBinaryString(result);
    }
        /**
         * конвертирует число 42.5 из десятичной с/с в двоичную
         * @return число в двоичной с/с
         */
    public String decimalNum1(){
        int x = (int) 42.5;
        String result = "";
        result = "42.5 = " + Integer.toBinaryString(x);
        return result;
    }
}
