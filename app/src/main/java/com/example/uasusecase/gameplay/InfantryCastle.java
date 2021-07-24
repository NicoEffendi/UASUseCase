package com.example.uasusecase.gameplay;

public class InfantryCastle extends Castle {


    public InfantryCastle() {
        this.CastleType = Castle.INFANTRY;
    }

    @Override
    public String getCastleBattleType() {
        return Castle.INFANTRY;
    }

    @Override
    public double calculatePower() {
        /**
         * Calculate power based on Armies formation and number, including heroes
         * Archer castle boost Archer Army by 40%
         */

        double power = 0;
        for (Army arm: this.ArmiesToBattle) {
            if (arm.ArmyType == Army.INFANTRY) {
                power += arm.numbers + arm.numbers * Army.INFANTRY_BOOST;
            }else {
                power += arm.numbers;
            }
        }


        return power;
    }

    @Override
    public int sendArmies(int armies) {
        return armies;
    }

    @Override
    public double calculateEnemyKilled(Castle ct2, int armies) {

        double myPower = this.calculatePower();
        int armiesSend = this.sendArmies(armies);
        if(ct2.getCastleBattleType() == Castle.CAVALRY){
            double enemyKilled = armiesSend - (0.1 * myPower);
            return enemyKilled;
        } else {
            double enemyKilled = armiesSend - (0.1 * myPower);
            return enemyKilled;
        }
    }

    @Override
    public Castle battleTo(Castle ct2, int armies) {

        double enemyRemaining = ct2.calculateEnemyKilled(ct2, armies);
        double myRemainingArmy = this.calculateEnemyKilled(this, armies);

        if (myRemainingArmy >= enemyRemaining)
            return this;
        else
            return ct2;


    }

    @Override
    public Army[] setArmy(Army[] Armies) {

        return Armies;
    }
}