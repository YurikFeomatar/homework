package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorStringExpression;
import home_work_3.calcs.api.IParsing;

import java.util.Scanner;

public class CalculatorStringExpressionMain {
    public static void main(String[] args) {
        final IParsing calc = new CalculatorStringExpression();
        final Scanner scan = new Scanner(System.in);
        System.out.println("Вводим что - нибудь эдакое");
        String console = scan.nextLine();
        calc.parseStringToInt(console);
    }
}
