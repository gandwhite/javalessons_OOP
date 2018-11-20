package utils;

import java.util.List;

public class ListHelper {

    public <T extends Comparable<T>> T getMinValue(List<T> list){
        if(list.size() == 0)
            return null;

        T result = list.get(0);
        for (T param: list) {
            if(param.compareTo(result) < 0)
                result = param;
        }
        return result;
    }

    public <T extends Comparable<T>> T getMaxValue(List<T> list){
        if(list.size() == 0)
            return null;

        T result = list.get(0);
        for (T param: list) {
            if(param.compareTo(result) > 0)
                result = param;
        }
        return result;
    }

    public <T extends Comparable<T>> boolean findItem(List<T> list, T item){
        /*
        if(list.size() == 0)
        return null;
        */
        for (T param: list) {
            if(param.compareTo(item) == 0)
                return true;
        }
        return false;
    }

    public <T> void addItem(List<T> list, T item){
        list.add(item);
    }
}
