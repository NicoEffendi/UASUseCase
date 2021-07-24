package com.example.uasusecase.gameplay;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class BattleWorker implements Runnable{

    private Castle c1, c2;
    private Activity a;
    public Castle winner;



    public BattleWorker(Activity ac, Castle c1, Castle c2) {
        this.a = ac;
        this.c1 = c1;
        this.c2 = c2;
        this.winner = null;
    }

    @Override
    public void run() {

        winner = c1.battleTo(c2, 100000);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Castle winner = c1.battleTo(c2, 100000);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (winner.equals(c1)) {

            ImageView img = (ImageView)findViewById(R.id.player_one_win);
            img.setVisibility(View.VISIBLE);
        }else {
            ImageView img = (ImageView)findViewById(R.id.player_one_win);
            img.setVisibility(View.VISIBLE);
        }


    }

    public Castle getWinner() {
    //return winner castle after a match done
        return this.winner;

    }
}
