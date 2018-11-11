package com.company;

import models.User;
import models.Promotion;
import utils.ArrayHelper;

public class Main {

    public static void main(String[] args){

        User user1 = new User("zeenek", "be", "zenek.be@bo.pl", "600666600", "adres", true , false  ,false ,true);

        System.out.println(user1.toString());



    }

}
