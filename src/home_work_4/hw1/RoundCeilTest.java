package home_work_4.hw1;

import home_work_1.RoundCeil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RoundCeilTest {
    private final RoundCeil var = new RoundCeil();
    @Test
    @DisplayName("Проверка метода mathRound")
    public void round1(){
        Assertions.assertEquals("Округление числа a = 3", var.mathR(3.213));
    }
    @Test
    @DisplayName("Проверка метода mathCeil")
    public void mathCeil1(){
        Assertions.assertEquals("Ближайшее число к числу с нулевой дробной частью 4.0",var.mathC(3.1233));
    }
}
