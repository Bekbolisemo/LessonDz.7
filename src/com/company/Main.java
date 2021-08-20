package com.company;

public class Main {

    public static void main(String[] args) {
      /*  Hero Warrior = new Hero() {
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
        };*/


      /*  for (int i = 0; i < 1; i++) {
            Warrior.applySuperAbility("крит урон");
            Magic.applySuperAbility("огненый шар");
            Medic.applySuperAbility("лечение");
            Hero[] array = {Warrior,Magic,Medic};
        }*/
     /*   for (int i = 0; i < createHeroes().length; i++) {
            System.out.println( createHeroes()[i]);

        }*/

        System.out.println(createHeroes());

    }
    public static Hero[] createHeroes() {
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

        Warrior.applySuperAbility("крит урон");
        Magic.applySuperAbility("огненый шар");
        Medic.applySuperAbility("лечение");
        Hero[] array = {Warrior,Magic,Medic};

        return  array;
    }

}

