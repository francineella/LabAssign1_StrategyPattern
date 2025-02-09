package StrategyPattern;

public abstract class Character {
    public AttackStrat attackStrat;
    public DefendStrat[] defendStrats;

    public Character( AttackStrat attackStrat, DefendStrat... defendStrats) {
        this.attackStrat = attackStrat;
        this.defendStrats = defendStrats;
    }

    public void attack() {
        attackStrat.attack();
    }

    public void defend() {
        for (DefendStrat defendStrat : defendStrats) {
            defendStrat.defend();
        }
    }

}