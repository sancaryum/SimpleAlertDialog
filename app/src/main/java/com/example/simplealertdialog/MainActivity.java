package com.example.simplealertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.net.MailTo;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void save (View v){

        AlertDialog.Builder uyari = new AlertDialog.Builder(this);

        uyari.setTitle("Save");
        uyari.setMessage("Are you sure?");

        uyari.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //MainActivity contextinde bir toast mesajı oluşturduk.
                Toast.makeText(MainActivity.this,"Saved!", Toast.LENGTH_SHORT).show();

            }
        });

        uyari.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Not Saved!", Toast.LENGTH_LONG).show();
            }
        });


        uyari.show();



    }
}
