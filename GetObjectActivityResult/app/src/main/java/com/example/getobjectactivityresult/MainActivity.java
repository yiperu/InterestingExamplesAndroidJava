package com.example.getobjectactivityresult;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final int INT_TAG = 100;
    public static final String STR_TAG = "TAG001";

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                startActivityForResult(intent, INT_TAG);




            }
        });


    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if (requestCode == INT_TAG) {

            if (resultCode == Activity.RESULT_OK) {

                Bundle b = data.getExtras();
                if (b != null) {

                    Integer  var_cont_id   = b.getInt("01");
                    Integer  var_caucie_id   = b.getInt("02");
                    String   var_observation = b.getString("03");
                    AnyClass myObject =   new AnyClass(var_cont_id, var_caucie_id, var_observation);

//                    myobj.getObservation()
//                    Toast.makeText(this, myObject.getObservation(), Toast.LENGTH_LONG).show();
                    Toast.makeText(this, myObject.getObservation(), Toast.LENGTH_LONG).show();

                }
            } else if (resultCode == 0) {
                System.out.println("RESULT CANCELLED");
            }
        }

    }
}
