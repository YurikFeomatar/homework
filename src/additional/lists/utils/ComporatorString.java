package additional.lists.utils;


import additional.lists.api.IComporator;

public class ComporatorString <T> implements IComporator <String> {

    @Override
    public Integer compare(String item1, String item2) {
        if(item1 == item2){
            return 0;
        }
        if(item1.length() > item2.length()){
            return 1;
        }else{
            return -1;
        }
    }
}
