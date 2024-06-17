package org.example.entity;

public class Archer extends Hero{
    public Archer(String name,int damage) {
        super(name,damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(this.getDamage());
//        System.out.println("Archer атакует врага");
        System.out.println(getName() + " выстрелил из лука");
    }
}
