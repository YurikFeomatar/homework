package home_work_4.hw1;

import home_work_1.PriorityOperators;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PriorityOperationsTest {
    private final PriorityOperators var = new PriorityOperators();
    @Test
    @DisplayName("Проверка метода res1")
    public void res1Test(){
        Assertions.assertEquals(5, var.res1(5,2,8));
    }
    @Test
    @DisplayName("Проверка метода res2")
    public void res2Test(){
        Assertions.assertEquals(0, var.res2(5,2,8));
    }
    @Test
    @DisplayName("Проверка метода res3")
    public void res3Test(){
        Assertions.assertEquals(0, var.res3(5,2,8));
    }
    @Test
    @DisplayName("Проверка метода res4")
    public void res4Test(){
        Assertions.assertEquals(1, var.res4(5,2,8));
    }
    @Test
    @DisplayName("Проверка метода res5")
    public void res5Test(){
        Assertions.assertEquals(0, var.res5(5,2,8));
    }
    @Test
    @DisplayName("Проверка метода res6")
    public void res6Test(){
        Assertions.assertEquals(1, var.res6(5,7,20,68,22,2,8));
    }
    @Test
    @DisplayName("Проверка метода res7")
    public void res7Test(){
        Assertions.assertEquals(10, var.res7(5,7,20,68,22,2,8));
    }
    @Test
    @DisplayName("Проверка метода res8")
    public void res8Test(){
        Assertions.assertEquals(false, var.res8(6,2,3,12,8));
    }

}
