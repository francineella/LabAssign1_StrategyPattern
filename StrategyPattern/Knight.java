package StrategyPattern;

    public class Knight extends Character {
        public Knight() {
            super(new SwingSword(), new Shield(), new Dodge(), new CreateMagic());
        }
    }