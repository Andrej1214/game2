package org.example.entity;

public class Mage extends Hero{
    public Mage(String name,int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(this.getDamage());
        System.out.println("Mage говорит заклинание");
    }
}
