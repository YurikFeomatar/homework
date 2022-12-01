package home_work_4.hw1;

import home_work_1.Years;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class YearsTest {
    private final Years var = new Years();
    @Test
    @DisplayName("Проверяем работу метода years")
    public void years1(){
        Assertions.assertEquals("Ваш год 2020 високосный.", var.years(2020));
    }
    @Test
    @DisplayName("Проверяем работу метода years")
    public void years2(){
        Assertions.assertEquals("Ваш год 2019 не високосный.", var.years(2019));
    }
}
