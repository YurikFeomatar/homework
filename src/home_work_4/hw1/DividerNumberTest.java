package home_work_4.hw1;

import home_work_1.DividerNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DividerNumberTest {
    private final DividerNumber div = new DividerNumber();
    @Test
    @DisplayName("проверка на корректность метода divider, когда числа делятся друг на друга")
    public void dividerTest(){
        Assertions.assertEquals("Первое число делится на второе без остатка.", div.divider(12,12));
    }
    @Test
    @DisplayName("проверка на корректность метода divider, когда чила не делятся друг на друга")
    public void dividerTest1(){
        Assertions.assertEquals("Первое число не делится на второе без остатка.", div.divider(12,32));
    }
}
