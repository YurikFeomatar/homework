package home_work_4.hw2.loops;

import home_work_2.loops.Exponenta;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ExponentaTest {
    private final Exponenta expo = new Exponenta();
    @Test
    @DisplayName("Проверка метода exponenta")
    public void exponenta1(){
        Assertions.assertEquals("4.0 ^ 2 = 16.0",expo.exponenta(4,2));
    }
    @Test
    @DisplayName("Проверка метода exponenta")
    public void exponenta2(){
        Assertions.assertEquals("14.0 ^ 5 = 537824.0",expo.exponenta(14,5));
    }
    @Test
    @DisplayName("Проверка метода exponenta")
    public void exponenta3(){
        Assertions.assertEquals("10.0 ^ 3 = 1000.0",expo.exponenta(10,3));
    }
}
