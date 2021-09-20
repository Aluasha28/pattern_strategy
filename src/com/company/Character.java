package com.company;

public abstract class Character {
    WeaponBehavior weaponBehavior;

    public Character() {
    }

    public void performWeaponBehavior(){
        weaponBehavior.useWeapon();
    }

    public void fight(){
        System.out.println(" ");
    }

}
