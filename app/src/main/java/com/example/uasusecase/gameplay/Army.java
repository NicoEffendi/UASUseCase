package com.example.uasusecase.gameplay;

public abstract class Army {

    public static final String ARCHER = "ARCHER";
    public static final String CAVALRY = "CAVALRY";
    public static final String INFANTRY = "INFANTRY";;
    public static final String MIX = "MIX";

    public static final double ARCHER_BOOST = 0.4;
    public static final double CAVALRY_BOOST = 0.4;
    public static final double INFANTRY_BOOST = 0.4;


    public String ArmyType;

    public int numbers;
}
