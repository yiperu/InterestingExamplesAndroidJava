package com.example.getobjectactivityresult;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;


public class DetailActivity extends AppCompatActivity {

    public static final String STR_TAG = "TAG001";

    private Integer  var_cont_id   = 0;
    private Integer  var_caucie_id   = 0;
    private String   var_observation = "";

    Button btn02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        btn02 = findViewById(R.id.button2);

        btn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent resultIntent = new Intent();
                var_cont_id   = 8;
                var_caucie_id   = 9;
                var_observation = "Observacion XXX";

                resultIntent.putExtra("01", var_cont_id);
                resultIntent.putExtra("02", var_caucie_id);
                resultIntent.putExtra("03", var_observation);

//                resultIntent.putExtra(STR_TAG, (Serializable) theObject);
                setResult(Activity.RESULT_OK, resultIntent);
                finish();

            }
        });





    }




}
