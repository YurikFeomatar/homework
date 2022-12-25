package home_work_6.utils;

import home_work_6.api.IReplacer;

public class SearchEnginePunctuationNormalizer implements IReplacer {
    @Override
    public String replaceText(String dataText) {
        dataText = dataText.replaceAll(","," ");
        dataText = dataText.replaceAll("!"," ");
        dataText = dataText.replaceAll("\\)"," ");
        dataText = dataText.replaceAll("\\."," ");
        dataText = dataText.replaceAll("\\?"," ");
        dataText = dataText.replaceAll(";"," ");
        dataText = dataText.replaceAll("\""," ");
        dataText = dataText.replaceAll("--"," ");
        dataText = dataText.replaceAll("\\n"," ");
        dataText = dataText.replaceAll(":"," ");
        dataText = dataText.replaceAll("'"," ");
        return dataText;
    }
}
