package com.example.uasusecase.gameplay;

public abstract class Castle {
    public static final String INFANTRY = "INFANTRY";
    public static final String CAVALRY = "CAVALRY";
    public static final String ARCHER = "ARCHER";
    public static final String MIX = "MIX";

    public String CastleType;
    public Heroes[] Heroes;
    public Army[] Armies;

    public Army[] ArmiesToBattle;


    public String getCastleType() {
        return this.CastleType;
    }

    public abstract String getCastleBattleType();

    public abstract double calculatePower();
    public abstract int sendArmies(int armies);

    public abstract double calculateEnemyKilled(Castle ct2, int armies);

    public abstract Castle battleTo(Castle ct2, int armies);

    public abstract Army[] setArmy(Army[] Armies);
}
