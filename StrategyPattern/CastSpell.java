package StrategyPattern;

public class CastSpell implements AttackStrat {
    @Override
    public void attack() {
        System.out.println("Wizard casts a spell!");
    }
}