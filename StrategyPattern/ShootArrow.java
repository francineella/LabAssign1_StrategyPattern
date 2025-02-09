package StrategyPattern;

public class ShootArrow implements AttackStrat {
    @Override
    public void attack() {
        System.out.println("Archer shoots an arrow!");
    }
}