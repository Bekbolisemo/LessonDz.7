package com.company;

public class Magic extends Hero{

    public Magic(int hp, int damage) {
        super(hp, damage);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println(superAbilityType);
    }

}
