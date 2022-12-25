package home_work_6.utils;

import home_work_6.api.IReplacer;
import home_work_6.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    IReplacer replacer = new SearchEnginePunctuationNormalizer();
    @Override
    public long search(String text, String word) {
        word =word;
        long result = 0;

        Pattern pattern = Pattern.compile(word);
            Matcher matcher = pattern.matcher(replacer.replaceText(text));

            while (matcher.find()){
                result++;
            }
        return result;
    }
}
