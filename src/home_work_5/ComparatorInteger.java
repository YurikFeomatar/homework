package home_work_5;

import home_work_5.api.Comporator;

public class ComparatorInteger <T> implements Comporator<Integer> {

    @Override
    public Integer compare(Integer item1, Integer item2) {
        if(item1 == item2){
            return 0;
        }
        if(item1 > item2){
            return 1;
        }else{
            return -1;
        }
    }
}
