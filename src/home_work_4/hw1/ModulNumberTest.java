package home_work_4.hw1;

import home_work_1.ModulNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ModulNumberTest {
    private final ModulNumber modul = new ModulNumber();
    @Test
    @DisplayName("проверка метода ModulNumber на корректность ( отрицательное число")
    public void modulNumber1(){
        Assertions.assertEquals("Модуль числа = 20.0", modul.abs(-20));
    }
    @Test
    @DisplayName("проверка метода ModulNumber на 0")
    public void modulNumber2(){
        Assertions.assertEquals("Модуль числа = 0.0", modul.abs(-0));
    }
    @Test
    @DisplayName("проверка метода ModulNumber на положительное число")
    public void modulNumber3(){
        Assertions.assertEquals("Модуль числа = 405.0", modul.abs(405));
    }
    @Test
    @DisplayName("проверка метода ModulNumber на дробь")
    public void modulNumber4(){
        Assertions.assertEquals("Модуль числа = 405.123", modul.abs(405.123));
    }
}
