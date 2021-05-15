package com.geektech;

public class Boss extends GameEntity {

    public Boss(int health, int damace) {
        super(health, damace);
    }

    public String printInfo() {
        return "Здоровье : " + getHealth() + " Урон :  " + getDamace() +
                " Оружие: " + getWeapon().getNameOfWeapon() + " Тип оружия: "
                + getWeapon().getTypeOfWeapon();
    }


    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon() {
        this.weapon = weapon;
    }

}
