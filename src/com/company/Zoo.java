package com.company;

public class Zoo {
    private int idZoo;
    private int hpZoo;
    private int attackZoo;

    public int getIdZoo() {
        return idZoo;
    }

    public void setIdZoo(int idZoo) {
        this.idZoo = idZoo;
    }

    public int getHpZoo() {
        return hpZoo;
    }

    public void setHpZoo(int hpZoo) {
        this.hpZoo = hpZoo;
    }

    public int getAttackZoo() {
        return attackZoo;
    }

    public void setAttackZoo(int attackZoo) {
        this.attackZoo = attackZoo;
    }

    public void zoo(){
        if (idZoo==1){
            setHpZoo(30);
            setAttackZoo(11);
        }
        if (idZoo==2){
            setHpZoo(40);
            setAttackZoo(16);
        }
        if (idZoo==3){
            setHpZoo(65);
            setAttackZoo(20);
        }
    }
}
