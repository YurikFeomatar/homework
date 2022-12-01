package home_work_4.hw1;

import home_work_1.BitAndOr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static home_work_1.BitAndOr.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BitAndOrTest {
    private final BitAndOr var = new BitAndOr();
    @Test
    @DisplayName("Проверка работы метода decimalNum")
    public void bitAndOr1(){
        assertEquals("Ваши числа в десятичной с/с = 1 и 2",var.decimalNum(1,2));
    }
    @Test
    @DisplayName("Проверка работы метода на максимальное отрицательное число и максимальное положительное decimalNum")
    public void bitAndOr2(){
        assertEquals("Ваши числа в десятичной с/с = -2147483648 и 2147483647",var.decimalNum(-2147483648,2147483647));
    }
    @Test
    @DisplayName("Проверка работы метода binaryNum")
    public void bitAndOr3(){
        assertEquals("Ваши числа в двоичной с/с = 10000000000000000000000000000000 и 1111111111111111111111111111111",var.binaryNum(-2147483648,2147483647));
    }
    @Test
    @DisplayName("Проверка работы метода bitAnd")
    public void bitAndOr4(){
        assertEquals("Побитовое И двух чисел = 10101",var.bitAnd(23,21));
    }
    @Test
    @DisplayName("Проверка работы метода bitOr")
    public void bitAndOr5(){
        assertEquals("Побитовое ИЛИ двух чисел = 11111",var.bitOr(27,29));
    }
    @Test
    @DisplayName("Проверка работы метода decimalNum1")
    public void bitAndOr6(){
        assertEquals("42.5 = 101010",var.decimalNum1());
    }
    @Test
    @DisplayName("Проверка работы метода decimalNum1")
    public void bitAndOr7(){
        assertEquals("42.5 = 101010",var.decimalNum1());
    }
}
