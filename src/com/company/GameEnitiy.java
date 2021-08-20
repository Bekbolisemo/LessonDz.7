package com.company;

public class GameEnitiy {
    int Hp;
    int Damage;


    public GameEnitiy(int hp, int damage) {
        this.Hp = hp;
        this.Damage =damage;


    }

    public int getHp() {
        return Hp;
    }

    public void setHp(int hp) {
        Hp = hp;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }
}
