package StrategyPattern;

public class Dodge implements DefendStrat {
    @Override
    public void defend() {
        System.out.println("Dodging to avoid attack!");
    }
}