package StrategyPattern;

public class Shield implements DefendStrat {
    @Override
    public void defend() {
        System.out.println("Using a shield to defend!");
    }
}