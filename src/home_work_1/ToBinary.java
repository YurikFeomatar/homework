package home_work_1;
    import java.util.Scanner;
public class ToBinary {
    public static boolean isDebugMode = true;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        checkStartDebugMod(args);
        if (isDebugMode) {
            System.out.println("Начинаем дебажить");
        }
        System.out.println("Введите число");
        if (scan.hasNextByte()) {
            byte number = scan.nextByte();
            toBinaryString((byte) number);
        } else {
            System.out.println("Введите число от -128 до 127");
        }
    }
    public static void checkStartDebugMod(String[] arr) {
        for (String arg : arr) {
            if ("debug".equalsIgnoreCase(arg)) {
                isDebugMode = true;
            }
        }
    }
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    public static String toBinaryString(byte res) {
        String totalRes = "";
        byte b = 2;
        if (res >= 0) {
            while (res >= 2) {
                totalRes = totalRes + res % 2;
                res = (byte) ((byte) res / b);
                System.out.println(res);
            }
            totalRes = totalRes + res;
            System.out.println("Прямой код = " + reverseString(totalRes));
        }
        return null;
    }
}
