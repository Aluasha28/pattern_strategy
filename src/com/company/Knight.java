package com.company;

public class Knight extends Character{
    public Knight() {
        weaponBehavior = new SwordBehavior();
    }

    @Override
    public void fight() {
        System.out.println("I'm knight");
    }
}
