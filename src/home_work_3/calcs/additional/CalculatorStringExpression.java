package home_work_3.calcs.additional;

import home_work_3.calcs.api.IParsing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculatorStringExpression implements IParsing {


    @Override
    public void parseStringToInt(String cons) {
        // /^\d{1,}$/
    }

    @Override
    public void parseOperator(String cons) {
        if(cons.equals("+")){

        }
    }

    /**
     * метод проверяет строку на скобки, открытые и закрытые
     * @param cons
     * @return
     */
    @Override
    public boolean parseParentheses(String cons) {
        Pattern pattern = Pattern.compile("\\([\\d+/*-]*\\)");
        Matcher matcher = pattern.matcher(cons);
        do {
            cons = matcher.replaceAll("");
            matcher = pattern.matcher(cons);
        } while (matcher.find());
        return cons.matches("[\\d+/*-]*");
    }


    @Override
    public void parsePriority(String cons) {

    }

    @Override
    public void parseConstant(String cons) {

    }

    @Override
    public void parseValid(String cons) {

    }


}
