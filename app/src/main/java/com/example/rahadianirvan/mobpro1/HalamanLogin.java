package com.example.rahadianirvan.mobpro1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HalamanLogin extends AppCompatActivity {
    Button btnLogin,btnRegister,btnFacebook,btnGmail,btnTwitter;
    EditText user,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_login);
    }

    public void masuk(View view){
        user = (EditText) findViewById(R.id.username);
        pass = (EditText) findViewById(R.id.password);
            Intent intent = new Intent(this, HalamanMasuk.class);
            startActivity(intent);
    }

    public void daftar(View view){
        Intent intent = new Intent(this, HalamanDaftar.class);
        startActivity(intent);
    }

    public void fb(View view){
        Uri uri = Uri.parse("https://web.facebook.com/rahadianirvan");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void gmail(View view){
        Uri uri = Uri.parse("https://www.gmail.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void twitter(View view){
        Uri uri = Uri.parse("https://www.twitter.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}
