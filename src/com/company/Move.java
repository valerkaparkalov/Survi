package com.company;

import java.util.Random;
import java.util.Scanner;

public class Move {
    private Heroes heroes;
    private GeneratLocat locate;
    private Days days;
    private char valueOld = '_';
    private char valueNext = '_';
    private boolean bool;
    private boolean notUseItem = false;

    public Move(Heroes heroes, GeneratLocat locate,Days days) {
        this.heroes = heroes;
        this.locate = locate;
        this.days=days;
    }

    public void move() {
        GeneratLocat.printLocat(locate.getLocats());
        System.out.println("==============================");
        System.out.println("походите");
        while (heroes.getHp() > 0) {//if hp heroes!= <0
            bool = false;
            //notUseItem=false;
            Scanner scr = new Scanner(System.in);
            char key = scr.next().charAt(0);
            //lengthArray(locate.getLineHeroes(), locate.getColumnHeroes());//todo проверка на выход за границу
            if (key == 'w') {
                int oldXValue = locate.getColumnHeroes();
                int oldYValue = locate.getLineHeroes();
                lengthArray(locate.getLineHeroes(), locate.getColumnHeroes(), key);
                if (bool == false) {
                    locate.setLineHeroes(locate.getLineHeroes() - 1);
                    valueNext = locate.getLocats()[locate.getLineHeroes()][locate.getColumnHeroes()];//value значение элемента на который сейчас станет герой
                    System.out.println(valueNext);//в консоль
                    replaceHeroesPosition(oldXValue, oldYValue);
                    locate.setLocats(locate.getLocats());
                }else{
                    continue;
                }
            }
            if (key == 's') {
                int oldXValue = locate.getColumnHeroes();
                int oldYValue = locate.getLineHeroes();
                lengthArray(locate.getLineHeroes(), locate.getColumnHeroes(), key);
                if (bool == false) {
                    locate.setLineHeroes(locate.getLineHeroes() + 1);
                    valueNext = locate.getLocats()[locate.getLineHeroes()][locate.getColumnHeroes()];//value значение элемента на который сейчас станет герой
                    //System.out.println(valueNext);//в консол
                    replaceHeroesPosition(oldXValue, oldYValue);
                    locate.setLocats(locate.getLocats());
                }else{
                    continue;
                }
            }
            if (key == 'a') {
                int oldXValue = locate.getColumnHeroes();
                int oldYValue = locate.getLineHeroes();
                lengthArray(locate.getLineHeroes(), locate.getColumnHeroes(), key);
                if (bool == false) {
                    locate.setColumnHeroes(locate.getColumnHeroes() - 1);
                    valueNext = locate.getLocats()[locate.getLineHeroes()][locate.getColumnHeroes()];//value значение элемента на который сейчас станет герой
                    //System.out.println(valueNext);//в консоль
                    replaceHeroesPosition(oldXValue, oldYValue);
                    locate.setLocats(locate.getLocats());
                }else{
                    continue;
                }
            }
            if (key == 'd') {
                int oldXValue = locate.getColumnHeroes();
                int oldYValue = locate.getLineHeroes();
                lengthArray(locate.getLineHeroes(), locate.getColumnHeroes(), key);
                if (bool == false) {
                    locate.setColumnHeroes(locate.getColumnHeroes() + 1);
                    valueNext = locate.getLocats()[locate.getLineHeroes()][locate.getColumnHeroes()];//value значение элемента на который сейчас станет герой
                    //System.out.println(valueNext);//в консоль
                    replaceHeroesPosition(oldXValue, oldYValue);
                    locate.setLocats(locate.getLocats());
                }else{
                    continue;
                }
            }
            if (key == 't') {
                //  справка по управлени
                System.out.println("ходить верх w\n" +
                        "ходить вниз s\n" +
                        "входить в право d\n" +
                        "походить влево a\n" +
                        "справка по управлени t\n" +
                        "характеристика героя h\n" +
                        "обозначения карты m\n"+
                        "просмотр инвентаря i\n"+
                        "Походите!");
                continue;
            }
            if (key == 'm') {
                // обозначения карты
                System.out.println("обозначение персонажа H\n" +
                        "обозначение зверя z\n" +
                        "обозначение еды e\n" +
                        "бозначение инвентаря a\n" +
                        "обозначение воды w\n " +
                        "Походите!");
                continue;
            }
            if (key == 'i') {
                // просмотр инвентаря
                System.out.println();
                continue;
            }
            if (key =='h'){
                System.out.println("|здоровье = " +heroes.getHp()
                        + "| еда = "+heroes.getEat()
                        +"| вода = "+heroes.getWater()
                        +"| мин-макс атака = "+heroes.getMinAttack()
                        +"-"+heroes.getMaxAttack()+"|\n" +
                        "Походите!");
                continue;
            }
            GeneratLocat.printLocat(locate.getLocats());
            if (valueNext != '_') {
                checkValueNext(valueNext);
            }
            if(bool!=true) {
                days.counterDays();
                System.out.println("дней прожито = " + days.getDays());
            }
        }

    }

    private void checkValueNext(char valueN) {
        Scanner scanner = new Scanner(System.in);
        if (valueN == 'e') {
            System.out.println("вы нашли еду\n" +
                    "1) сьесть \n" +
                    "2) положить в инвентарь\n" +
                    "3)оставить и пойти дальше");
            char eatKey = scanner.next().charAt(0);
            if (eatKey == '1') {
                valueOld = '_';
                char[][] locats = locate.getLocats();
                locats[locate.getLineHeroes()][locate.getColumnHeroes()] = 'H';
                GeneratLocat.printLocat(locate.getLocats());
                heroes.setEat(heroes.getEat() + 20);
                if(heroes.getEat()>100){
                    heroes.setEat(100);
                    if(heroes.getHp()< heroes.getMaxHp()) {
                        heroes.setHp(heroes.getHp() + 10);
                    }
                }
            }
            if (eatKey == '2') {
                valueOld = '_';
                char[][] locats = locate.getLocats();
                locats[locate.getLineHeroes()][locate.getColumnHeroes()] = 'H';
                GeneratLocat.printLocat(locate.getLocats());
                //todo создать инвентарь с масивом
            }
            if (eatKey == '3') {
                notUseItem=true;
                valueOld = 'e';
                GeneratLocat.printLocat(locate.getLocats());
                System.out.println("походите");
            }
        }
           if (valueN == 'w') {
            System.out.println("вы нашли воду\n" +
                    "1) выпить \n" +
                    "2) положить в инвентарь\n" +
                    "3)оставить и пойти дальше");
            char eatKey = scanner.next().charAt(0);
            if (eatKey == '1') {
                valueOld = '_';
                char[][] locats = locate.getLocats();
                locats[locate.getLineHeroes()][locate.getColumnHeroes()] = 'H';
                GeneratLocat.printLocat(locate.getLocats());
                heroes.setWater(heroes.getWater() + 20);
                if(heroes.getWater()>100){
                    heroes.setWater(100);
                }
            }
            if (eatKey == '2') {
                valueOld = '_';
                char[][] locats = locate.getLocats();
                locats[locate.getLineHeroes()][locate.getColumnHeroes()] = 'H';
                GeneratLocat.printLocat(locate.getLocats());
                //todo создать инвентарь с масивом
            }
            if (eatKey == '3') {
                valueOld = 'w';
                notUseItem=true;
                GeneratLocat.printLocat(locate.getLocats());
                System.out.println("походите");

            }
        }
        if (valueN == 'z') {
            System.out.println("вы встретили зверя");
                AttackLog war = new AttackLog(heroes);
                if (war.attackLog()==true) {
                    valueOld = '_';
                    char[][] locats = locate.getLocats();
                    locats[locate.getLineHeroes()][locate.getColumnHeroes()] = 'H';
                    GeneratLocat.printLocat(locate.getLocats());
                    System.out.println("походите");
                } else {
                    valueOld = 'z';
                    notUseItem=true;
                    GeneratLocat.printLocat(locate.getLocats());
                    System.out.println("походите");

            }
        }
        if(valueN=='0'){
            System.out.println("шагнуть в портал?\n" +
                    "1) заходим \n" +
                    "2) ничего не делаем");
            char stepPortal  = scanner.next().charAt(0);
            if (stepPortal==1){
                GeneratLocat locat = new GeneratLocat();
                locat.locats();
                locat.setLocats(locat.locatsrnd);
                GeneratLocat.printLocat(locate.getLocats());
            }
            if(stepPortal==2){

                    valueOld = '0';
                    notUseItem=true;
                    GeneratLocat.printLocat(locate.getLocats());
                    System.out.println("походите");
            }

        }
    }

    //метод перезаписи героя вперёд
    private void replaceHeroesPosition(int oldXValue, int oldYValue) {
        char[][] locats = locate.getLocats();
        locats[locate.getLineHeroes()][locate.getColumnHeroes()] = 'H';
        locats[oldYValue][oldXValue] = valueOld;
        if(notUseItem){
            valueOld='_';
        }

    }

    //метод для проверки граници локации
    private void lengthArray(int positionXHeroes, int positionYHeroes, char key) {
        char[][] locats = locate.getLocats();
        if (positionXHeroes - 1 < 0 & key == 'w') {
            bool = true;
            System.out.println("в верх ходить нельзя");
        }
        if ((positionXHeroes+1 > locats.length-1) & key == 's') {
            bool = true;
            System.out.println("вниз ходить нельзя");
        }
        if ((positionYHeroes - 1 < 0) & key == 'a') {
            bool = true;
            System.out.println("в лево ходить нельзя");
        }
        if ((positionYHeroes+1 > locats[positionXHeroes].length-1) & key == 'd') {
            bool = true;
            System.out.println("в право ходить нельзя");
        }
    }
}

