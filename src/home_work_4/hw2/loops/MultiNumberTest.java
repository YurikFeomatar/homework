package home_work_4.hw2.loops;

import home_work_2.loops.MultiNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MultiNumberTest {
    private final MultiNumber mult = new MultiNumber();
    @Test
    @DisplayName("проверка метода MultiNumber")
    public void multiNumber1(){
        Assertions.assertEquals("1 * 2 * 3 * 4 = 24",mult.multiNum("1 2 3 4"));
    }
    @Test
    @DisplayName("проверка метода MultiNumber")
    public void multiNumber2(){
        Assertions.assertEquals("1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 = 362880",mult.multiNum("1 2 3 4 5 6 7 8 9"));
    }
    @Test
    @DisplayName("проверка метода на ошибку")
    public void multiNumber3(){
        Throwable exception = Assertions.assertThrows(NumberFormatException.class,() ->{
            Assertions.assertEquals("1 = 1",mult.multiNum("92.5"));
            throw new NumberFormatException("error message");
        });
    }
}