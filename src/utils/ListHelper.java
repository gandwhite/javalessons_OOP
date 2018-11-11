package utils;

import java.util.List;

public class ListHelper {

    public <T> T getMinValue(List list){
        if(list.size() == 0)
            return null;

        T result = (T) list.get(0);
        /*
        for (List param: list) {
            if(param.compareTo(result) < 0)
                result = param;
        }
        */
        return result;
    }
}
