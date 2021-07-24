package com.example.uasusecase.gameplay;

public class ArcherCastle extends Castle {


    public ArcherCastle() {
        this.CastleType = Castle.ARCHER;
    }

    @Override
    public double calculatePower() {
        /**
         * Calculate power based on Armies formation and number, including heroes
         * Archer castle boost Archer Army by 40%
         */

        double power = 0;
        for (Army arm: this.ArmiesToBattle) {
            if (arm.ArmyType == Army.ARCHER) {
                power += arm.numbers + arm.numbers * Army.ARCHER_BOOST;
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