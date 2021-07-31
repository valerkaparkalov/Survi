package com.company;

import java.util.Random;

public class GeneratLocat {
    Random random = new Random();
    private char[][] locats;
    private int lineHeroes;
    private int columnHeroes;
    private int line;
    private int column;

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getLineHeroes() {
        return lineHeroes;
    }

    public void setLineHeroes(int lineHeroes) {
        this.lineHeroes = lineHeroes;
    }

    public int getColumnHeroes() {
        return columnHeroes;
    }

    public void setColumnHeroes(int columnHeroes) {
        this.columnHeroes = columnHeroes;
    }

    public char[][] getLocats() {
        return locats;
    }

    public  void setLocats(char[][] locatsrnd) {
        this.locats = locatsrnd;
    }

    // создание и заполнение ЛОКАЦИИ пустыми ячейками
    public void locats() {
        setLine(random.nextInt(17) + 3);
        setColumn(random.nextInt(17) + 3);
        char[][] locatsrnd = new char[getLine()][getColumn()];
        for (int i = 0; i < locatsrnd.length; i++) {
            for (int j = 0; j < locatsrnd[i].length; j++) {
                locatsrnd[i][j] = '_';
            }
        }


//добавелние обьектов
        int eatAmount = random.nextInt(10) + 3;
        int waterAmount = random.nextInt(10) + 3;
        int zooAmount = random.nextInt(7) + 4;
        for (int i = 0; i < eatAmount; i++) {
            locatsrnd[random.nextInt(line)][random.nextInt(column)] = 'e';
        }
        for (int i = 0; i < waterAmount; i++) {
            locatsrnd[random.nextInt(line)][random.nextInt(column)] = 'w';
        }
        for (int i = 0; i < zooAmount; i++) {
            locatsrnd[random.nextInt(line)][random.nextInt(column)] = 'z';
        }
        setLineHeroes(random.nextInt(line));
        setColumnHeroes(random.nextInt(column));
        locatsrnd[(getLineHeroes())][(getColumnHeroes())] = 'H';
        locatsrnd[random.nextInt(line)][random.nextInt(column)]='0';


        setLocats(locatsrnd);

    }
    //вывод локации=массива
    public static void printLocat(char[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }

    }


}


