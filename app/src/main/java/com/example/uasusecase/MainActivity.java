package com.example.uasusecase;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.uasusecase.gameplay.ArcherCastle;
import com.example.uasusecase.gameplay.Army;
import com.example.uasusecase.gameplay.BattleWorker;
import com.example.uasusecase.gameplay.Castle;
import com.example.uasusecase.gameplay.CavalryCastle;
import com.example.uasusecase.gameplay.InfantryCastle;
import com.example.uasusecase.gameplay.MixCastle;


public class MainActivity extends AppCompatActivity {

    public void CavalryVsArcher(){

        Activity myActivity = this;
        CavalryCastle c1 = new CavalryCastle();
        ArcherCastle c2 = new ArcherCastle();


        /** init armies for each Castle c1 and c2
         *
         */

        c1.setArmy(new Army[100000]);

        c2.setArmy(new Army[100000]);


        Castle fightingCastles[] = new Castle[2];
        fightingCastles[0] = c2;
        fightingCastles[1] = c1;

        initCastleImageBattle(fightingCastles);

        final Button btn = findViewById(R.id.btn_battle);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                BattleWorker bw = new BattleWorker(myActivity, c1, c2);
                new Thread(bw).run();


            }
        });
    }


    public void InfantryVsMixedArmy(){

        Activity myActivity = this;
        InfantryCastle c1 = new InfantryCastle();
        MixCastle c2 = new MixCastle();


        /** init armies for each Castle c1 and c2
         *
         */

        c1.setArmy(new Army[100000]);

        c2.setArmy(new Army[100000]);


        Castle fightingCastles[] = new Castle[2];
        fightingCastles[0] = c2;
        fightingCastles[1] = c1;

        initCastleImageBattle(fightingCastles);

        final Button btn = findViewById(R.id.btn_battle);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                BattleWorker bw = new BattleWorker(myActivity, c1, c2);
                new Thread(bw).run();


            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CavalryVsArcher();

    }


    private void initCastleImageBattle(Castle[] castles) {
        //assume castles has 2 members

        Castle left = castles[0];
        Castle right = castles[1];

        loadCastleImage(findViewById(R.id.player_one),left);
        loadCastleImage(findViewById(R.id.player_two),right);

    }

    private void loadCastleImage (ImageView iView, Castle ct) {
        if (ct instanceof CavalryCastle) {
            iView.setBackgroundResource(R.drawable.cavalry);
        }else if (ct instanceof InfantryCastle) {
            iView.setBackgroundResource(R.drawable.infantry);
        }else  {
            iView.setBackgroundResource(R.drawable.cavalry);
        }
    }

}
