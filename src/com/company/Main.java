package com.company;

public class Main  {
    public static void main(String[] args) {
        View.enterGame();
        System.out.println("====================================");
        View.gameInfo();
        System.out.println("====================================");
        Heroes heroes =new Heroes();
        heroes.heroes();
        heroes.backPack();
        GeneratLocat locat= new GeneratLocat();
        locat.locats();
        Days days = new Days(heroes);
        Move move= new Move(heroes,locat,days);
        move.move();
        System.out.println("Вы проиграл!!!\n" +
                "прожили дней" + days.getDays());




    }}







