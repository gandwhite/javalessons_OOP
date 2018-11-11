package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.ArrayHelper;

public class ArrayHelperTest {

    @Test
    public void getMinValue_WhenArrayIsEmpty_ThenReturnNull(){
        //Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        Integer[] array = new Integer[0];
        Integer expectedValue = null;

        //Act
        Integer result = arrayHelper.getMinValue(array);

        //Assert
        Assertions.assertEquals(expectedValue,result);
    }

    @Test
    public void getMinValue_WhenArrayIsNotEmptyAndIsIntegerType_ThenReturnMinValue(){
        //Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        Integer[] array = new Integer[3];
        array[0] = 2;
        array[1] = 2;
        array[2] = 2;
        Integer expectedValue = 2;

        //Act
        Integer result = arrayHelper.getMinValue(array);

        //Assert
        Assertions.assertEquals(expectedValue,result);
    }

    @Test
    public void getMinValue_WhenArrayIsNotEmptyAndIsStringType_ThenReturnMinValue(){
        //Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        String[] array = new String[3];
        array[0] = "1abcde";
        array[1] = "abc";
        array[2] = "cde";
        String expectedValue = "1abcde";

        //Act
        String result = arrayHelper.getMinValue(array);

        //Assert
        Assertions.assertEquals(expectedValue,result);
    }

    @Test
    public void getMinValue_WhenArrayIsNotEmptyAndIsFloatType_ThenReturnMinValue(){
        //Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        Float[] array = new Float[3];
        array[0] = 1.002f;
        array[1] = -1.001f;
        array[2] = 20000.1f;
        Float expectedValue = -1.001f;

        //Act
        Float result = arrayHelper.getMinValue(array);

        //Assert
        Assertions.assertEquals(expectedValue,result);
    }

    @Test
    public void getMaxValue_WhenArrayIsEmpty_ThenReturnNull(){
        //Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        Integer[] array = new Integer[0];
        Integer expectedValue = null;

        //Act
        Integer result = arrayHelper.getMaxValue(array);

        //Assert
        Assertions.assertEquals(expectedValue,result);
    }

    @Test
    public void getMaxValue_WhenArrayIsNotEmptyAndIsIntegerType_ThenReturnMaxValue(){
        //Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        Integer[] array = new Integer[3];
        array[0] = -15;
        array[1] = -10;
        array[2] = -2;
        Integer expectedValue = -2;

        //Act
        Integer result = arrayHelper.getMaxValue(array);

        //Assert
        Assertions.assertEquals(expectedValue,result);
    }

    @Test
    public void findItem_WhenArrayIsNotEmptyAndIsIntegerTypeAndItemIsPresent_ThenReturnTrue(){
        //Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        Integer[] array = new Integer[3];
        array[0] = -15;
        array[1] = -10;
        array[2] = -2;
        Integer itemInput = -10;
        boolean expectedValue = true;

        //Act
        boolean result = arrayHelper.findItem(array,itemInput);

        //Assert
        Assertions.assertEquals(expectedValue,result);
    }

    @Test
    public void findItem_WhenArrayIsNotEmptyAndIsIntegerTypeAndItemIsNotPresent_ThenReturnFalse(){
        //Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        Integer[] array = new Integer[3];
        array[0] = -15;
        array[1] = -10;
        array[2] = -2;
        Integer itemInput = 102378;
        boolean expectedValue = false;

        //Act
        boolean result = arrayHelper.findItem(array,itemInput);

        //Assert
        Assertions.assertEquals(expectedValue,result);
    }

    @Test
    public void findItem_WhenArrayIsEmpty_ThenReturnFalse(){
        //Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        Integer[] array = new Integer[0];
        Integer itemInput = 102378;
        boolean expectedValue = false;

        //Act
        boolean result = arrayHelper.findItem(array,itemInput);

        //Assert
        Assertions.assertEquals(expectedValue,result);
    }

    @Test
    public void swapItems_WhenArrayIsEmpty_ThenReturnNull(){
        //Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        Integer[] array = new Integer[0];
        Integer firstItem = 102378;
        Integer secondItem = 28;
        Integer[] expectedValue = null;

        //Act
        Integer[] result = arrayHelper.swapItems(array,firstItem,secondItem);

        //Assert
        Assertions.assertEquals(expectedValue,result);
    }

    @Test
    public void swapItems_WhenArrayIsNotEmptyAndBothItemsArePresentAndTypeIsInteger_ThenReturnArrayWithSwappedItems(){
        //Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        Integer[] array = new Integer[3];
        array[0] = 2;
        array[1] = 500;
        array[2] = 12;
        Integer firstItem = 2;
        Integer secondItem = 500;
        Integer[] expectedArray = {500,2,12};

        //Act
        Integer[] result = arrayHelper.swapItems(array,firstItem,secondItem);

        //Assert
        Assertions.assertArrayEquals(expectedArray,result);
    }

    @Test
    public void swapItems_WhenArrayIsNotEmptyAndFirstItemIsNotPresentAndTypeIsInteger_ThenReturnOriginalArray(){
        //Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        Integer[] array = new Integer[3];
        array[0] = 2;
        array[1] = 500;
        array[2] = 12;
        Integer firstItem = 15;
        Integer secondItem = 500;
        Integer[] expectedArray = {2,500,12};

        //Act
        Integer[] result = arrayHelper.swapItems(array,firstItem,secondItem);

        //Assert
        Assertions.assertArrayEquals(expectedArray,result);
    }

    @Test
    public void swapItems_WhenArrayIsNotEmptyAndBothItemsPresentAndTypeIsString_ThenReturnArrayWithSwappedItems(){
        //Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        String[] array = new String[3];
        array[0] = "abc";
        array[1] = "zzw";
        array[2] = "sss";
        String firstItem = "abc";
        String secondItem = "sss";
        String[] expectedArray = {"sss","zzw","abc"};

        //Act
        String[] result = arrayHelper.swapItems(array,firstItem,secondItem);

        //Assert
        Assertions.assertArrayEquals(expectedArray,result);
    }

    /*
    @Test
    public void addItem_WhenArrayIsEmpty_ThenReturnArrayWithItemAtLastPosition(){
        //Arrange
        ArrayHelper arrayHelper = new ArrayHelper();
        int arrayLength = 1;
        Integer[] array = new Integer[arrayLength];
        Integer itemInput = 102378;
        Integer expectedValue = 102378;

        //Act
        Integer result = arrayHelper.addItem(array,itemInput)[arrayLength+1];

        //Assert
        Assertions.assertEquals(expectedValue,result);
    }
    */

}
