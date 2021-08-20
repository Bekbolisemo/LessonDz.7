package com.company;

public class Necromancer extends Hero{
    public Necromancer(int hp, int damage) {
        super(hp, damage);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println(superAbilityType);
    }
}
