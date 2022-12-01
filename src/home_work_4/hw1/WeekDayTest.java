package home_work_4.hw1;

import home_work_1.WeekDay;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WeekDayTest {
    private final WeekDay var = new WeekDay();
    @Test
    @DisplayName("проверка метода weekday")
    public void weekday1(){
        Assertions.assertEquals(true, true, "true");
    }
    @Test
    @DisplayName("проверка метода weekday")
    public void weekday2(){
        Assertions.assertEquals(false, false, "true");
    }
    @Test
    @DisplayName("проверка метода weekday")
    public void weekday3(){
        Assertions.assertEquals("Вы можете сегодня поспать",var.sleepIn(true,true));
    }
    @Test
    @DisplayName("проверка метода weekday")
    public void weekday4(){
        Assertions.assertEquals("Вам нужно идти на работу",var.sleepIn(true,false));
    }
    @Test
    @DisplayName("проверка метода weekday")
    public void weekday5(){
        Assertions.assertEquals("Вы можете сегодня поспать",var.sleepIn(false,false));
    }
    @Test
    @DisplayName("проверка метода weekday")
    public void weekday6(){
        Assertions.assertEquals("Вы можете сегодня поспать",var.sleepIn(false,true));
    }
}
