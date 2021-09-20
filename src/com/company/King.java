package com.company;

public class King extends Character{
    public King() {
        weaponBehavior = new KnifeBehavior();
    }

    @Override
    public void fight() {
        System.out.println("I'm king");
    }
}
