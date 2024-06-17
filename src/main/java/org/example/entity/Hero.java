package org.example.entity;

public abstract class Hero {
    private String name;

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
        return name;
    }
    public abstract void attackEnemy(Enemy enemy);
}
