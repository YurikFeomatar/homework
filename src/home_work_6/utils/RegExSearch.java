package home_work_6.utils;

import home_work_6.api.IReplacer;
import home_work_6.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
         long result = 0;
         text = " " + text + " ";
        Pattern pattern = Pattern.compile("[\\s?\\!?.]" + word + "[!:,.\\s]");
            Matcher matcher = pattern.matcher(text);

            while (matcher.find()){
                result++;
            }
        return result;
    }
}
