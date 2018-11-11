package utils;


public class ArrayHelper {

    public <T extends Comparable<T>> T getMinValue(T[] array){
        if(array.length == 0)
            return null;
        T result = array[0];
        for (T param: array) {
            if(param.compareTo(result) < 0)
                result = param;
        }
        return result;
    }

    public <T extends Comparable<T>> T getMaxValue(T[] array){
        if(array.length == 0)
            return null;
        T result = array[0];
        for (T param: array) {
            if(param.compareTo(result) > 0)
                result = param;
        }
        return result;
    }

    public <T extends Comparable<T>> boolean findItem(T[] array, T item){
        //is empty array check needed? return null - not working with boolean, return false not compatible with other methods
        //if(array.length == 0)
        //    return null;
        for (T param: array) {
            if(param.compareTo(item) == 0)
                return true;
        }
        return false;
    }

    public <T extends Comparable<T>> T[] swapItems(T[] array, T firstItem, T secondItem){
        if(array.length == 0)
            return null;
        if(!findItem(array,firstItem))
            return array; //or NULL??
        if(!findItem(array,secondItem))
            return array; //or NULL??

        Integer firstItemPosition = findItemPosition(array,firstItem);
        Integer secondItemPosition = findItemPosition(array,secondItem);
        T temp = array[firstItemPosition];
        array[firstItemPosition] = array[secondItemPosition];
        array[secondItemPosition] = temp;

        return array;
    }

    public <T> Integer findItemPosition(T[] array, T item)
    {
        Integer itemPosition = null;
        for(int i = 0; i < array.length; i++)
        {
            if(array[i].equals(item)){
                itemPosition = i;
                break;
            }
        }
        return itemPosition;
    }


    /*
    public <T> T[] addItem(T[] array, T item)
    {
        //dunno how to make this work
        //int resultArrayLength = array.length+1;
        T[] result = new T[array.length+1];
        //T result2[resultArrayLength];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        result[array.length] = item;
        return result;
    }
    */

    //not doing remove from array

}
