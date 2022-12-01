package home_work_4.hw2.loops;

import home_work_2.loops.Overflow;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class OverflowTest {
    private final Overflow over = new Overflow();
    @Test
    @DisplayName("Проверка метода overflowPlus")
    public void overflowPlus1(){
        Assertions.assertEquals("a * num до переполнения = 4052555153018976267" + " \n" +
                "a * num после переполнения = -6289078614652622815",over.overflowPlus(1,3));
    }
    @Test
    @DisplayName("Проверка метода overflowPlus")
    public void overflowPlus2(){
        Assertions.assertEquals("a * num до переполнения = 1560496482665168896" + " \n" +
                "a * num после переполнения = -1774566438301073408",over.overflowPlus(1,188));
    }
    @Test
    @DisplayName("Проверка метода overflowPlus")
    public void overflowPlus3(){
        Assertions.assertEquals("a * num до переполнения = 252465925985015625" + " \n" +
                "a * num после переполнения = -2203773652717645901",over.overflowPlus(1,795));
    }
    @Test
    @DisplayName("Проверка метода overflowMinus")
    public void overflowMinus1(){
        Assertions.assertEquals("a * num до переполнения = 799006685782884121" + " \n" +
                "a * num после переполнения = 3265617043834753317",over.overflowMinus(1,-19));
    }
}
