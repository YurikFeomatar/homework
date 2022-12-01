package home_work_4.hw2.loops;

import home_work_2.loops.FactorialRecursion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FactorialRecursionTest {
    private final FactorialRecursion rec = new FactorialRecursion();
    @Test
    @DisplayName("Проверяем метод FactorialRecursion")
    public void factorialRecursion1(){
        Assertions.assertEquals(120,rec.recursion(5));
    }
    @Test
    @DisplayName("Проверяем метод FactorialRecursion")
    public void factorialRecursion2(){
        Assertions.assertEquals(1,rec.recursion(0));
    }
    @Test
    @DisplayName("Проверяем метод itter")
    public void factorialRecursion3(){
        Assertions.assertEquals("1 * 2 * 3 * 4 * 5 = ",rec.itter(5));
    }
    @Test
    @DisplayName("Проверяем метод itter")
    public void factorialRecursion4(){
        Assertions.assertEquals("1 * 2 * 3 * 4 * 5 * 6 = ",rec.itter(6));
        Assertions.assertEquals(720,rec.recursion(6));
    }

}
