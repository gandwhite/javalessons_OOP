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
        List list = new ArrayList();
        Object expectedValue = null;

        //Act
        Object result = listHelper.getMinValue(list);

        //Assert
        Assertions.assertEquals(expectedValue,result);
    }

    @Test
    public void getMinValue_WhenListIsNotEmpty_ThenReturnMinValue(){
        //Arrange
        ListHelper listHelper = new ListHelper();
        List<Integer> list = new ArrayList<>();
        Integer obj1 = 1;
        Integer obj2 = 4;
        Integer obj3 = 6;
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        Integer expectedValue = 1;

        //Act
        Integer result = listHelper.getMinValue(list);

        //Assert
        Assertions.assertEquals(expectedValue,result);
    }
}
