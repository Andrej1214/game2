package org.example.entity;

public abstract class Hero {
    private final String name;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    private int damage;

    public Hero(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return this.name;
    }
    public abstract void attackEnemy(Enemy enemy);
}
