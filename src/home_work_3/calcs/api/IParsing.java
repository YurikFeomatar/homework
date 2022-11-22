package home_work_3.calcs.api;

public interface IParsing {
    public void parseStringToInt(String cons);
    public void parseOperator(String cons);
    public boolean parseParentheses(String cons);
    public void parsePriority(String cons);
    public void parseConstant(String cons);
    public void parseValid(String cons);

}
