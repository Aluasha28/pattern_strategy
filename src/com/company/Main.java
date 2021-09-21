package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Character queen = new Queen();
        queen.performWeaponBehavior();
        queen.fight();
        Character knight = new Knight();
        knight.performWeaponBehavior();
        knight.fight();
    }
}
