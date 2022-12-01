package home_work_4.hw1;

import home_work_1.SquareRoot;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class SquareRootTest {
    private final SquareRoot var = new SquareRoot();
    @Test
    @DisplayName("проверка метода dis")
    public void dis1(){
        Assertions.assertEquals(-23.0, var.dis(2,3,4));
    }
    @Test
    @DisplayName("проверка метода dis")
    public void dis2(){
        Assertions.assertEquals(0.0, var.dis(1,4,4));
    }
    @Test
    @DisplayName("проверка метода dis")
    public void dis3(){
        Assertions.assertEquals(0.0, var.dis(2,8,0));
    }
    @Test
    @DisplayName("проверка метода squareRoot")
    public void squareRoot1(){
        Assertions.assertEquals("Дискриминант равен 0. Корень квадратного уравнения = -0.5", var.squareRoot(0,4,4));
    }
    @Test
    @DisplayName("проверка метода squareRoot")
    public void squareRoot2(){
        Assertions.assertEquals("Дискриминант отрицательный. Уравенение не имеет корней", var.squareRoot(-32,2,8));
    }
    @Test
    @DisplayName("проверка метода squareRoot")
    public void squareRoot3(){
        Assertions.assertEquals("Первый корень квадратного уравнения = -0.8377223398316205 " +
                "Второй корень квадратного уравнения = -7.16227766016838", var.squareRoot(40,1,8));
    }
}
