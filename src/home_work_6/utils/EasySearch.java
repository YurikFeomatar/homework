package home_work_6.utils;

import home_work_6.api.IReplacer;
import home_work_6.api.ISearchEngine;

public class EasySearch implements ISearchEngine {
    private final IReplacer replacer = new SearchEnginePunctuationNormalizer();
    @Override
    public long search(String text, String word) {
        replacer.replaceText(text);
        word = " " + word + " ";
        long result = 0;
        int number = 0;

        while(text.indexOf(word,number) != -1){
            number = text.indexOf(word, number) + 1;
            result++;
        }
        return result;
    }
}
