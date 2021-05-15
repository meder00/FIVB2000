package com.geektech;

public class GameEntity {
    public int health;
    public int damace;

    public GameEntity(int health,int damace) {
        this.health = health;
        this.damace = damace;

    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamace() {
        return damace;
    }

    public void setDamace(int damace) {
        this.damace = damace;
    }
}
