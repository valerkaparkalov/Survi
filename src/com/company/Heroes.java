package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Heroes {
    private int hp;
    private int water = 100;
    private int maxHp;

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    private int eat = 100;
    private int minAttack;
    private int maxAttack;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getEat() {
        return eat;
    }

    public void setEat(int eat) {
        this.eat = eat;
    }

    public int getMinAttack() {
        return minAttack;
    }

    public void setMinAttack(int minAttack) {
        this.minAttack = minAttack;
    }

    public int getMaxAttack() {
        return maxAttack;
    }


    public void setMaxAttack(int maxAttack) {
        this.maxAttack = maxAttack;
    }

    public void heroes() {

        System.out.println("Выберете героя");
        for (; ; ) {
            Scanner scr = new Scanner(System.in);
            String id = scr.nextLine();

            if (id.equals("1")) {
                setHp(130);
                setMaxHp(130);
                setMinAttack(15);
                setMaxAttack(20);
                break;
            }
            if (id.equals("2")) {
                setHp(90);
                setMaxHp(90);
                setMinAttack(24);
                setMaxAttack(29);
                break;
            }
            if (id.equals("3")) {
                setHp(110);
                setMaxHp(110);
                setMinAttack(19);
                setMaxAttack(24);
                break;

            } else {
                System.out.println("Выберете из предложенных");
            }

        }


    }

    //рандомная атака генерация
    public int getAttackValue() {
        Random random = new Random();//fiels
        int attack = random.nextInt(getMaxAttack() - getMinAttack()) + getMinAttack();
        return attack;
    }

}













