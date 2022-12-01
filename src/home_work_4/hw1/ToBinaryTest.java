package home_work_4.hw1;

import home_work_1.ToBinary;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ToBinaryTest {
    private final ToBinary var = new ToBinary();
    @Test
    @DisplayName("проверка метода toBinaryString")
    public void toBinaryString1(){
        Assertions.assertEquals("Прямой код = 01111011 Обратный код = 11011110", var.toBinaryString((byte)123));
    }
    @Test
    @DisplayName("проверка метода toBinaryString")
    public void toBinaryString2(){
        Assertions.assertEquals("Дополнительный код = 10010000", var.toBinaryString((byte)-123));
    }

}
