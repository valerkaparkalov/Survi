package com.company;

public class Main  {
    public static void main(String[] args) {
        Backpack backpack=new Backpack();
        View.enterGame();
        System.out.println("====================================");
        View.gameInfo();
        System.out.println("====================================");
        Heroes heroes =new Heroes();
        heroes.heroes();
        GeneratLocat locat= new GeneratLocat();
        locat.locats();
        Days days = new Days(heroes);
        Move move= new Move(heroes,locat,days,backpack);
        move.move();




    }}







