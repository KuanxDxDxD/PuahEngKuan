package com.example.puahengkuan;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SPM extends AppCompatActivity {

    private EditText bm;
    private EditText bi;
    private EditText math;
    private EditText sc;
    private EditText sj;
    private EditText phy;
    private EditText che;
    private EditText addmath;
    private int passcount = 0;
    private TextView TextResult;
    private String result = "You've not meet the minimum requirement!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spm);
    }

    public void onClickCheck(View view){
        bm = (EditText) findViewById(R.id.editText);
        bi = (EditText) findViewById(R.id.editText2);
        math = (EditText) findViewById(R.id.editText3);
        sc = (EditText) findViewById(R.id.editText4);
        sj = (EditText) findViewById(R.id.editText5);
        phy = (EditText) findViewById(R.id.editText6);
        che = (EditText) findViewById(R.id.editText7);
        addmath = (EditText) findViewById(R.id.editText8);

        TextResult = (TextView) findViewById(R.id.textView12);

        if (bm.toString() == "C" || bm.toString() == "B" || bm.toString() == "A") {
            passcount++;
        }

        if (bi.toString() == "C" || bi.toString() == "B" || bi.toString() == "A") {
            passcount++;
        }

        if (math.toString() == "C" || math.toString() == "B" || math.toString() == "A") {
            passcount++;
        }

        if (sc.toString() == "C" || sc.toString() == "B" || sc.toString() == "A") {
            passcount++;
        }

        if (sj.toString() == "C" || sj.toString() == "B" || sj.toString() == "A") {
            passcount++;
        }

        if (phy.toString() == "C" || phy.toString() == "B" || phy.toString() == "A") {
            passcount++;
        }

        if (che.toString() == "C" || che.toString() == "B" || che.toString() == "A") {
            passcount++;
        }

        if (addmath.toString() == "C" || addmath.toString() == "B" || addmath.toString() == "A") {
            passcount++;
        }

        if(passcount >= 5 || math.toString() == "B" || math.toString() == "A" ||
         bi.toString() == "C" || bi.toString() == "B" || bi.toString() == "A" ||
                bm.toString() == "C" || bm.toString() == "B" || bm.toString() == "A"){
            result = "You've meet the minimum requirement!";
            TextResult.setText(result);
        }else{
            TextResult.setText(result);
        }
    }
}
