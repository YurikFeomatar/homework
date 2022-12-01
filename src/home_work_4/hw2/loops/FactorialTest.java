package home_work_4.hw2.loops;

import home_work_2.loops.Factorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FactorialTest {
    private final Factorial factor = new Factorial();
    @Test
    @DisplayName("проверка метода factorial")
    public void factorial1(){
        Assertions.assertEquals("1 * 2 * 3 * 4 * 5 * 6 * 7 = 5040", factor.factorial(7));
    }
    @Test
    @DisplayName("проверка метода factorial")
    public void factorial2(){
        Assertions.assertEquals("0 = 1", factor.factorial(0));
    }
    @Test
    @DisplayName("проверка метода factorial")
    public void factorial3(){
        Assertions.assertEquals("1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 * 14 * 15 * 16 * 17 * 18 * 19 * 20 * 21 * 22 * 23 * 24 * 25 = " +
                "7034535277573963776", factor.factorial(25));
    }
}
