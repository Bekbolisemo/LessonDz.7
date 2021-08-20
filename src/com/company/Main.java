package com.company;

public class Main {

    public static void main(String[] args) {
        Warrior warrior = new Warrior(50, 30);
        Magic magic = new Magic(35, 35);
        Necromancer necromancer = new Necromancer(20, 44);
        Hero[] array = {warrior, magic, necromancer};
        System.out.println(array);


        System.out.println("Warrior Hp and Damage " + warrior.getHp() + " " + warrior.getDamage());
        System.out.println("Magic Hp and Damage " + magic.getHp() + " " + magic.getDamage());
        System.out.println("Necromancer Hp and Damage " + necromancer.getHp() + " " + necromancer.getDamage());


        for (int i = 0; i < array.length; i++) {
            array[0].applySuperAbility("Крит урон");
            array[1].applySuperAbility("Огненый шар");
            array[2].applySuperAbility("Востание нежити");
            break;
        }

    }
}

