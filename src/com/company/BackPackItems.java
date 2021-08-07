package com.company;

public class BackPackItems {
    private char items;

    public char getItems() {
        return items;
    }

    public void setItems(char items) {
        this.items = items;
    }
    public BackPackItems(char items){
        this.items=items;
    }

    @Override
    public String toString() {
        return  ""+items;
    }



}
