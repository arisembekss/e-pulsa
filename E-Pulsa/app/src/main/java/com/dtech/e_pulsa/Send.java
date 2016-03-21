package com.dtech.e_pulsa;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Send extends AppCompatActivity {

    SmsManager smsManager;
    Button btn;
    EditText number, message;
    String nomor, pesan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        number = (EditText) findViewById(R.id.number);
        message = (EditText) findViewById(R.id.mess);

         nomor = number.getText().toString();
         pesan = message.getText().toString();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                smsManager.sendTextMessage(nomor, null, pesan, null, null);
            }
        });
    }

}
