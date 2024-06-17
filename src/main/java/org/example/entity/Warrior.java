package org.example.entity;

public class Warrior extends Hero{
    public Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(this.getDamage());
        System.out.println("Warrior бьёт мечом");
    }
}
