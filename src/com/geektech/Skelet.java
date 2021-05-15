package com.geektech;

public class Skelet extends Boss {

    private int numberOfArrows;

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }

    private Weapon weapon;

    @Override
    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public Skelet(int health, int damace, int numberOfArrows) {
        super(health, damace);
        this.numberOfArrows = numberOfArrows;
    }
    public String printInfo(){
        return super.printInfo() + " Количество стрел " + getNumberOfArrows();
    }

}