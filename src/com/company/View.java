package com.company;

import java.util.Scanner;

public class View {
    private Heroes heroes;

    public Heroes getHeroes() {
        return heroes;
    }

    public void setHeroes(Heroes heroes) {
        this.heroes = heroes;
    }

    // начальное меню
    public static void enterGame() {
        System.out.println("введите 1 и нажмите Enter");
        for (; ; ) {
            Scanner scr = new Scanner(System.in);
            String enter = scr.nextLine();

            if (enter.equals("1")) {
                System.out.println("Добро пожаловать в игру про выживание!!!.");
                System.out.println("============================");
                System.out.println("У вас есть 3 героя на выбор");
                System.out.println("============================");
                System.out.println("1) Варвар\n hp = 130\n" +
                        "attack=15-20\n");
                System.out.println("=============================");
                System.out.println("2) Охотник\n hp = 90\n" +
                        "attack=24-29\n");
                System.out.println("=============================");
                System.out.println("3) Рыцарь \n hp =110\n" +
                        "attack=19-24\n");
                break;
            } else {
                System.out.println("нажмите 1 для начала игры");
            }
        }

    }

    public static void gameInfo() {
        System.out.println("ознакомьтесь пожалуйста с управление \n" +
                "обозначение персонажа x\n" +
                "обозначение зверя z\n" +
                "обозначение еды e\n" +
                "бозначение инвентаря a\n" +
                "обозначение воды w\n " +
                "ходить верх w\n" +
                "ходить вниз s\n" +
                "входить в право d\n" +
                "походить влево a\n" +
                "использовать или атаковать 1\n" +
                "попытаться сбежать 2\n" +
                "справка по управлени t\n" +
                "характеристика героя h\n" +
                "обозначения карты m");
    }

    public static void startLocate() {
        GeneratLocat locats = new GeneratLocat();
        locats.locats();
    }


}

