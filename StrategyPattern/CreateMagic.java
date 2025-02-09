package StrategyPattern;

public class CreateMagic implements DefendStrat {
    @Override
    public void defend() {
        System.out.println("Creating a magic for defense!");
    }
}