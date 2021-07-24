package com.example.uasusecase.gameplay;

public abstract class Castle {
    public static final String INFANTRY = "INFANTRY";
    public static final String CAVALRY = "CAVALRY";
    public static final String ARCHER = "ARCHER";

    public String CastleType;
    public Heroes[] Heroes;
    public Army[] Armies;

    public Army[] ArmiesToBattle;


    public String getCastleType() {
        return this.CastleType;
    }

    public abstract double calculatePower();

    public abstract Castle battleTo(Castle ct2);

    public abstract Army[] setArmy(Army[] Armies);
}
