package com.company;

public abstract class Hero implements HavingSuperAbility {
     int HeroHp;
     int HeroDamage;
     int HeroHil;

     public int getHeroHp() {
          return HeroHp;
     }

     public void setHeroHp(int heroHp) {
          HeroHp = heroHp;
     }

     public int getHeroDamage() {
          return HeroDamage;
     }

     public void setHeroDamage(int heroDamage) {
          HeroDamage = heroDamage;
     }

     public int getHeroHil() {
          return HeroHil;
     }

     public void setHeroHil(int heroHil) {
          HeroHil = heroHil;
     }
}
