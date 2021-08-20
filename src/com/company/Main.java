package com.company;

public class Main {

    public static void main(String[] args) {
        Hero Warrior = new Hero() {

            @Override
            public void applySuperAbility(String superAbilityType) {
                System.out.println(superAbilityType);
            }
        };

        Hero Magic = new Hero() {
            @Override
            public void applySuperAbility(String superAbilityType) {
                System.out.println(superAbilityType);
            }
        };
        Hero Medic = new Hero() {
            @Override
            public void applySuperAbility(String superAbilityType) {
                System.out.println(superAbilityType);
            }
        };
        Warrior.setHeroHp(50);
        Warrior.setHeroDamage(30);
        Magic.setHeroHp(37);
        Magic.setHeroDamage(35);
        Medic.setHeroHp(40);
        Medic.setHeroHil(15);

        Warrior.applySuperAbility("крит урон");
        Magic.applySuperAbility("огненый шар");
        Medic.applySuperAbility("лечение");
        Hero[] array = {Warrior, Magic, Medic};
        System.out.println(
                "|Warrior Hp: "
                + Warrior.getHeroHp()
                + "|Warrior Damage: "
                + Warrior.getHeroDamage()
                + "|Magic Hp: "
                + Magic.getHeroHp()
                + "|Magic Damage: "
                + Magic.getHeroDamage()
                + "|Medic Hp: "
                + Medic.getHeroHp()
                + "|Medic Hil: "
                + Medic.getHeroHil()
                + array);
    }

}

