package home_work_1;
    import java.util.Scanner;
public class ToBinary {

    public static void main(String[] args) {
        final ToBinary var = new ToBinary();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        if (scan.hasNextByte()) {
            byte number = scan.nextByte();
            var.toBinaryString((byte) number);
        } else {
            System.out.println("Введите число от -128 до 127");
        }
/**
 * Проверяем введенные данные
 * reverseString(String str) создает реверсию для прямого кода
 * toBinaryString(byte res)  - метод, который получает число и переводит его в двоичную с/с;
 * использовал boolean flag как метку положительного или отрицательного числа.
 * число попадает в цикл, пока не поделит себя на 2 до конца, после чего происходит заполнение String нолями,
 * если число поделилось на 2 без остатка, и 1 - если остался остаток от деления на 2. в результате -прямой код.
 *
 * Далее инвертируем прямой код, где 1 замещаем нолями, а ноли - единицами.
 *
 * дополнительный код  получаем из обратного, с значением старшего бита "1" для отрицательных чисел.
 *
 */
    }
    public String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    public String toBinaryString(byte res) {
        String totalRes = "";
        String answer = "";
        byte b = 2;
        byte dop = res;
        Boolean flag = true;
        if (res < 0) {
            flag = false;
            res = (byte) (-1 * res);
        }
        while (res >= 2) {
            if (flag == false) {
                if (res % 2 == 0) {
                    totalRes = totalRes + "1";
                } else {
                    totalRes = totalRes + "0";
                }
            } else {
                totalRes = totalRes + res % 2;
            }
            res = (byte) ((byte) res / b);
        }
        if (flag == false) {
            if (res % 2 == 0) {
                totalRes = totalRes + "1";
            } else {
                totalRes = totalRes + "0";
            }
        } else {
            totalRes = totalRes + res % 2;
            if (totalRes.length() <= 8) {
                int a = 7;
                for (int c = 1; totalRes.length() <= a; c++) {
                    totalRes =   totalRes + "0";
                }
            }
        }
        if(dop < 0){
            answer = "Дополнительный код = " + "1" + totalRes;
        }else{
            answer = "Прямой код = " + reverseString(totalRes) + " " +  "Обратный код = " + totalRes;
        }
        return answer;
    }
}
