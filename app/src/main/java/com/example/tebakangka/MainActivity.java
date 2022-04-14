package com.example.tebakangka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNo;
    public void randNumGenerator(){
        Random rand = new Random();
        randomNo = rand.nextInt(20) + 1;
    }

    public void tbkangka(View view){
        try {
            String message;
            EditText number = (EditText) findViewById(R.id.inputNo);
            int tebakangka = Integer.parseInt(number.getText().toString());
            if(tebakangka > 0 && tebakangka < 21){
                if (tebakangka < randomNo){
                    message = "Lebih Tinggi !!";
                } else if (tebakangka > randomNo){
                    message = "Lebih Rendah !!";
                } else {
                    message = "Hebat !! Kamu Benar !!";
                    randNumGenerator();
                }
                Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Silakan input sebuah angka antara 1-20 !!", Toast.LENGTH_SHORT).show();
            }
        } catch (Exception e){
            Toast.makeText(this, "Tolong input angka !!", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        randomNo = rand.nextInt(20) + 1;
    }
}