package org.example.entity;

public class TrainingGround {
    public static void main(String[] args) {
        Hero hero = new Warrior("Alex",10);
        Hero hero2 = new Archer("Robin",8);
        Hero hero3 = new Mage("Gendelf",12);
        Enemy enemy = new Enemy(45);
        iterat(enemy, hero, hero2, hero3);
        System.out.println(enemy.getHealth());
    }

    public static void iterat(Enemy enemy, Hero... heroes) {
        for (Hero o : heroes) {
            o.attackEnemy(enemy);
        }
    }
}
