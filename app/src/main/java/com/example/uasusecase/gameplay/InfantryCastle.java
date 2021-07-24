package com.example.uasusecase.gameplay;

public class InfantryCastle extends Castle {


    public InfantryCastle() {
        this.CastleType = Castle.INFANTRY;
    }

    @Override
    public double calculatePower() {
        /**
         * Calculate power based on Armies formation and number, including heroes
         * Infantry castle boost Infantry Army by 40%
         */

        double power = 0;
        for (Army arm: Armies) {
            if (arm.ArmyType == Army.INFANTRY) {
                power += arm.numbers + arm.numbers * Army.INFANTRY_BOOST;
            }else {
                power += arm.numbers;
            }
        }


        return power;
    }

    @Override
    public Castle battleTo(Castle ct2) {

        double myPower = this.calculatePower();
        double enemyPower = ct2.calculatePower();

        if (myPower >= enemyPower)
            return this;
        else
            return ct2;


    }

    @Override
    public Army[] setArmy(Army[] Armies) {
        return Armies;
    }
}