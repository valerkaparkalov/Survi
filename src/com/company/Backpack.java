package com.company;

import java.util.ArrayList;
import java.util.List;


public class Backpack {

    public static void backPack() {

        List<BackPackItems> backPackList = new ArrayList<>();
backPackList.add(new BackPackItems('e'));
        System.out.println(backPackList.size() + ""+backPackList.get(0));

    }
}
