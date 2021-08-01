package com.company;

public class Days {
    private Heroes heroes;
    private int days=0;

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public Days (Heroes heroes){
        this.heroes=heroes;
    }
    public void counterDays(){
        if (heroes.getEat()>=0) {
            heroes.setEat(heroes.getEat() - 10);
        }
        heroes.setWater(heroes.getWater()-5);
        if (heroes.getEat() < 0) {
            heroes.setHp(heroes.getHp()-2);
        }
        if (heroes.getWater()<0){
            heroes.setHp(heroes.getHp()-5);
        }
        setDays(days+1);
        if(days%5==0& heroes.getEat()<heroes.getMaxHp()){
            heroes.setHp(heroes.getHp()+10);
        }

    }

}