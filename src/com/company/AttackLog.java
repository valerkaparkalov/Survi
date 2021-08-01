package com.company;

import java.util.Random;
import java.util.Scanner;

public class AttackLog {
    private Heroes heroes;

    public AttackLog(Heroes heroes) {
        this.heroes = heroes;
    }

    public boolean attackLog() {
        boolean war = true;
        Random random = new Random();
        Zoo rndZoo = new Zoo();
        Scanner scr = new Scanner(System.in);
        rndZoo.setIdZoo(random.nextInt(3) + 1);
        rndZoo.zoo();
        System.out.println("перед вами зверь " + rndZoo.getIdZoo() + " уровня\n" +
                "=====================");
        System.out.println("ваше здоровье = " + heroes.getHp() + "\n" +
                "ваша минимальная атака и максимальная = " + heroes.getMinAttack() + "-" + heroes.getMaxAttack() + "\n" +
                "=====================\n" +
                "здоровье зверя =" + rndZoo.getHpZoo() + "\n" +
                "атака зверя = " + rndZoo.getAttackZoo());
        while (rndZoo.getHpZoo() > 0 & war == true & heroes.getHp()>0) {
            System.out.println("1)Атаковать\n" +
                    "2)попытаться сбежать");
            char enter = scr.next().charAt(0);
            if (enter == '1') {
                rndZoo.setHpZoo(rndZoo.getHpZoo() - heroes.getAttackValue());
                heroes.setHp(heroes.getHp() - rndZoo.getAttackZoo());
                if (rndZoo.getHpZoo() > 0 & heroes.getHp() > 0)
                    System.out.println("ваше здоровье = " + heroes.getHp() +"\n"+
                            "здоровье зверя = " + rndZoo.getHpZoo());
                if (rndZoo.getHpZoo() < 0) {
                    System.out.println("зверь побеждён");


                }
                if (heroes.getHp() < 0) {
                    break;
                }

            }
            if (enter == '2') {
                while (war!=false) {
                    System.out.println("попробовать сбежать");
                    String enters = scr.nextLine();
                    int chance = random.nextInt(100);
                    System.out.println("ваш шанс на побег" + (chance) + '%');
                    if (chance <= 30) {
                        System.out.println("вам не удалось сбежать ");
                        heroes.setHp(heroes.getHp() - rndZoo.getAttackZoo());
                        System.out.println("вы получили урон от зверя " + rndZoo.getAttackZoo() + "\n" +
                                "ваше хп =" + heroes.getHp());
                    } if (chance>30) {
                        war = false;
                        System.out.println("вам удалось сбежать");
                    }
                }
            }
        }
        return war;
    }
}
