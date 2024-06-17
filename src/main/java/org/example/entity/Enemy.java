package org.example.entity;

public class Enemy implements Mortal{
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage) {
        this.health = Math.max(health - damage, 0);
    }

    @Override
    public boolean isAlive() {
        return health>0;
    }
}
