package home_work_4.hw1;

import home_work_1.TheMiddle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TheMiddleTest {
    private final TheMiddle var = new TheMiddle();
    @Test
    @DisplayName("Проверка метода middle")
    public void middle1(){
        Assertions.assertEquals("Среднее число 567", var.middle(432,567,908));
    }
    @Test
    @DisplayName("Проверка метода middle")
    public void middle2(){
        Assertions.assertEquals("Среднее число 567", var.middle(567,432,908));
    }
    @Test
    @DisplayName("Проверка метода middle")
    public void middle3(){
        Assertions.assertEquals("Среднее число 567", var.middle(908,567,432));
    }
}
