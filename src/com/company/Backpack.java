package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Backpack {
    private char eatItems;

    public char getEatItems() {
        return eatItems;
    }

    public void setEatItems(char i) {
        this.eatItems = eatItems;
    }

    Scanner scr = new Scanner(System.in);

    private List<BackPackItems> backPackList = new ArrayList<>();

    public void addChartoBackPackListE() {
        if (backPackList.size() < 10) {
            backPackList.add(new BackPackItems('e'));
        } else {
            System.out.println("инвентарь заполнен");
        }
    }

    public void addChartoBackPackListW() {
        if (backPackList.size() < 10) {
            backPackList.add(new BackPackItems('w'));
        } else {
            System.out.println("инвентарь заполнен");
        }
    }

    public void viewBackPackList() {
        System.out.println("Ваш инвентарь");
        for (int i = 0; i < backPackList.size(); i++) {
            System.out.print(i + 1 + "-" + backPackList.get(i) + " ");
        }
        System.out.println();
    }

    public void eatItems() {
        setEatItems('0');
        System.out.println("Выберите предмет");
        int valueItems = scr.next().charAt(0);
        if(valueItems<=backPackList.size()&valueItems>0){
        setEatItems(backPackList.get(valueItems-1).toString().charAt(0));
        backPackList.remove((valueItems-1));}
//        System.out.println("что бы выйти нажмите e");






    }
}
