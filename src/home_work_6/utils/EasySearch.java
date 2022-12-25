package home_work_6.utils;

import home_work_6.api.IReplacer;
import home_work_6.api.ISearchEngine;

public class EasySearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        String[] dataArray = text.split(" ");
        long result = 0;
        for (String s : dataArray) {
            if (s.equals(word)) {
                result++;
            }
        }
        return result;
    }
}
