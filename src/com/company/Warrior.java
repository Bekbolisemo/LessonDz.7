package com.company;

import org.omg.PortableInterceptor.INACTIVE;

public class Warrior extends Hero {
    public Warrior (int Hp , int Damage){
        super(Hp,Damage);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println(superAbilityType);
    }
}
