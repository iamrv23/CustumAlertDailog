package com.rv.custumalertdailog;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView logintv, regtv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void login(View view) {

        LayoutInflater li = (LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE);
        View v1 = li.inflate(R.layout.alert_style_layout,null,false);
        final EditText let1 = v1.findViewById(R.id.loget1);
        final EditText let2 = v1.findViewById(R.id.loget2);
        final Button logbut = v1.findViewById(R.id.loginbut);



        final AlertDialog.Builder adb = new AlertDialog.Builder(this);
        adb.setView(v1);
        final AlertDialog ad = adb.create();
        ad.show();

        logbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 String uname = let1.getText().toString().trim();
                 String pass = let2.getText().toString().trim();

                if (uname.isEmpty())
                {
                    let1.setError("Empty");
                    let1.requestFocus();
                }
                else
                {
                    if (pass.isEmpty())
                    {
                        let2.requestFocus();
                        let2.setError("Empty");
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "LogIn Successful", Toast.LENGTH_SHORT).show();
                        ad.dismiss();
                    }
                }
            }
        });





    }


    public void regis(View view) {

        LayoutInflater li = (LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE);
        View v = li.inflate(R.layout.alert_style_layout_reg,null);
        final EditText ret1 = v.findViewById(R.id.reget1);
        final EditText ret2 = v.findViewById(R.id.reget2);
        final EditText ret3 = v.findViewById(R.id.reget3);
        final EditText ret4 = v.findViewById(R.id.reget4);
        Button regbut = v.findViewById(R.id.regbut);



        AlertDialog.Builder adb = new AlertDialog.Builder(this);
        adb.setView(v);
        final AlertDialog ad = adb.create();
        ad.show();

        regbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 String username2 = ret1.getText().toString().trim();
                 String phon = ret2.getText().toString().trim();
                 String  email = ret3.getText().toString().trim();
                 String pass2 = ret4.getText().toString().trim();
                if (username2.isEmpty()){
                    ret1.setError("Empty");
                    ret1.requestFocus();
                } else {
                    if (phon.isEmpty()) {
                        ret2.setError("Empty");
                        ret2.requestFocus();
                    } else {
                        if (email.isEmpty()) {
                            ret3.setError("Empty");
                            ret3.requestFocus();
                        } else {
                            if (pass2.isEmpty()) {
                                ret4.setError("Empty");
                                ret4.requestFocus();
                            } else {
                                Toast.makeText(MainActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                                ad.dismiss();
                            }
                        }
                    }
                }
            }
        });


    }
}
