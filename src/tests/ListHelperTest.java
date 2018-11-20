package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.ListHelper;

import java.util.ArrayList;
import java.util.List;


public class ListHelperTest {

    @Test
    public void getMinValue_WhenListEmpty_ThenReturnNull(){
        //Arrange
        ListHelper listHelper = new ListHelper();
        List<Integer> list = new ArrayList<>();
        Object expectedValue = null;

        //Act
        Object result = listHelper.getMinValue(list);

        //Assert
        Assertions.assertEquals(expectedValue,result);
    }

    @Test
    public void getMinValue_WhenListIsNotEmptyAndTypeIsInteger_ThenReturnMinValue(){
        //Arrange
        ListHelper listHelper = new ListHelper();
        List<Integer> list = new ArrayList<>();
        Integer obj1 = 6;
        Integer obj2 = 4;
        Integer obj3 = 6;
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        Integer expectedValue = 4;

        //Act
        Integer result = listHelper.getMinValue(list);

        //Assert
        Assertions.assertEquals(expectedValue,result);
    }

    @Test
    public void getMinValue_WhenListIsNotEmptyAndTypeIsString_ThenReturnMinValue(){
        //Arrange
        ListHelper listHelper = new ListHelper();
        List<String> list = new ArrayList<>();
        String obj1 = "aabc";
        String obj2 = "aabd";
        String obj3 = "aaba";
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        String expectedValue = "aaba";

        //Act
        String result = listHelper.getMinValue(list);

        //Assert
        Assertions.assertEquals(expectedValue,result);
    }

    @Test
    public void getMaxValue_WhenListEmpty_ThenReturnNull(){
        //Arrange
        ListHelper listHelper = new ListHelper();
        List<Integer> list = new ArrayList<>();
        Object expectedValue = null;

        //Act
        Object result = listHelper.getMaxValue(list);

        //Assert
        Assertions.assertEquals(expectedValue,result);
    }

    @Test
    public void getMaxValue_WhenListIsNotEmptyAndTypeIsInteger_ThenReturnMaxValue(){
        //Arrange
        ListHelper listHelper = new ListHelper();
        List<Integer> list = new ArrayList<>();
        Integer obj1 = -10;
        Integer obj2 = 4;
        Integer obj3 = 6;
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        Integer expectedValue = 6;

        //Act
        Integer result = listHelper.getMaxValue(list);

        //Assert
        Assertions.assertEquals(expectedValue,result);
    }

    @Test
    public void getMaxValue_WhenListIsNotEmptyAndTypeIsString_ThenReturnMaxValue(){
        //Arrange
        ListHelper listHelper = new ListHelper();
        List<String> list = new ArrayList<>();
        String obj1 = "aabc";
        String obj2 = "aabd";
        String obj3 = "aaba";
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        String expectedValue = "aabd";

        //Act
        String result = listHelper.getMaxValue(list);

        //Assert
        Assertions.assertEquals(expectedValue,result);
    }

    /*
    @Test
    public void findItem_WhenListIsEmpty_ThenReturnNull(){
        //Arrange
        ListHelper listHelper = new ListHelper();
        List<Integer> list = new ArrayList<>();
        Integer expectedValue = null;

        //Act
        Integer result = listHelper.findItem(list);

        //Assert
        Assertions.assertEquals(expectedValue,result);
    }
    */

    @Test
    public void findItem_WhenListIsNotEmpty_ThenReturnTrueWhenItemIsPresent(){
        //Arrange
        ListHelper listHelper = new ListHelper();
        List<Integer> list = new ArrayList<>();
        Integer obj1 = 4;
        Integer obj2 = 23;
        Integer obj3 = 56;
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        Integer inputItem = 56;
        boolean expectedValue = true;

        //Act
        boolean result = listHelper.findItem(list, inputItem);

        //Assert
        Assertions.assertEquals(expectedValue,result);
    }

    @Test
    public void findItem_WhenListIsNotEmpty_ThenReturnFalseWhenItemIsNotPresent(){
        //Arrange
        ListHelper listHelper = new ListHelper();
        List<Integer> list = new ArrayList<>();
        Integer obj1 = 4;
        Integer obj2 = 23;
        Integer obj3 = 56;
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        Integer inputItem = 5;
        boolean expectedValue = false;

        //Act
        boolean result = listHelper.findItem(list, inputItem);

        //Assert
        Assertions.assertEquals(expectedValue,result);
    }

    @Test
    public void addItem_WhenListIsNotEmpty_ThenReturnListWithItemAtLastPosition(){
        //Arrange
        ListHelper listHelper = new ListHelper();
        List<Integer> list = new ArrayList<>();
        Integer obj1 = 4;
        Integer obj2 = 23;
        Integer obj3 = 56;
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        Integer inputItem = 5;
        Integer expectedValue = 5;

        //Act
        listHelper.addItem(list,inputItem);
        Integer result = list.get(list.size()-1);

        //Assert
        Assertions.assertEquals(expectedValue,result);
    }

    @Test
    public void addItem_WhenListIsEmpty_ThenReturnListWithItemAtLastPosition(){
        //Arrange
        ListHelper listHelper = new ListHelper();
        List<Integer> list = new ArrayList<>();
        Integer inputItem = 5;
        Integer expectedValue = 5;

        //Act
        listHelper.addItem(list,inputItem);
        Integer result = list.get(list.size()-1);

        //Assert
        Assertions.assertEquals(expectedValue,result);
    }

}
