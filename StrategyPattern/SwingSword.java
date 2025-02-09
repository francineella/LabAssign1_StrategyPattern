package StrategyPattern;

public class SwingSword implements AttackStrat {
    @Override
    public void attack() {
        System.out.println("Knight attacks with a sword!");
    }
}