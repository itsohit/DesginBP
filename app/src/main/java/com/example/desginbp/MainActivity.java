package com.example.desginbp;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AlertDialog alert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void openDialog(View view){

        View v = LayoutInflater.from(this).inflate(R.layout.dialog_layout,null);
        Button ok = (Button) v.findViewById(R.id.dailog_ok_button);
         ok.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                    alert.dismiss();
             }
         });
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(v);
        alert = builder.create();
        alert.show();
    }
}
