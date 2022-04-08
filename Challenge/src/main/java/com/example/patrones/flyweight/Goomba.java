package com.example.patrones.flyweight;

public class Goomba implements Enemy{

    private Level level;
    private int life;

    public Goomba(Level level, int life) {
        this.level = level;
        this.life = life;
    }

    @Override
    public void setLevel(Level level) {
        System.out.println("Koopa level->" + level.toString());
        
    }

    @Override
    public void lifePoints() {
        System.out.println("Koopa life points->" + this.life);
        
    }
    
}
