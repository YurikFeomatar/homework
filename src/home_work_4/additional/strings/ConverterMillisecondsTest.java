package home_work_4.additional.strings;

import additional.strings.ConverterMilliseconds;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ConverterMillisecondsTest {
    public final ConverterMilliseconds var = new ConverterMilliseconds();
    @Test
    @DisplayName("проверяем метод ConverterMilliseconds")
    public void toHoursMinuteSecondMillisecond1(){
        Assertions.assertEquals("00:33:20:000:MSK",var.toHoursMinuteSecondMillisecond(2000000,true));
    }
    @Test
    @DisplayName("проверяем метод ConverterMilliseconds")
    public void toHoursMinuteSecondMillisecond2(){
        Assertions.assertEquals("1 час 0 минут 0 секунд 0 миллисекунд ",var.toHoursMinuteSecondMillisecond(3600000,false));
    }
    @Test
    @DisplayName("проверяем метод ConverterMilliseconds")
    public void toHoursMinuteSecondMillisecond3(){
        Assertions.assertEquals("1 час 0 минут 0 секунд 0 миллисекунд ",var.toHoursMinuteSecondMillisecond(54684561,false));
    }
}
