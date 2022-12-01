package home_work_4.hw1;

import home_work_1.PowLog;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PowLogTest {
    private final PowLog var = new PowLog();
    @Test
    @DisplayName("тест на корректную работу метода pow")
    public void powTest1(){
        Assertions.assertEquals("pow = 100.0", var.pow(10,2));
    }
    @Test
    @DisplayName("тест на корректную работу метода log")
    public void logTest1(){
        Assertions.assertEquals("log = 4.605170185988092", var.log(10,2));
    }
    @Test
    @DisplayName("тест на корректную работу метода pow")
    public void log10Test1(){
        Assertions.assertEquals("log10 = 0.6632456843634444", var.log10(10,2));
    }
}
