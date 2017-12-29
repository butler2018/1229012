package com.example.student.a122901_2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click1(View v)
    {
        Intent it = new Intent();
        it.setAction(Intent.ACTION_SEND);//Intent
        it.setType("text/plan");//決定要傳的型態(text)
        it.putExtra(Intent.EXTRA_TEXT,"這是要分享的文字2266");//給要傳的(text)值
        startActivity(it);//送出
    }
    public void click2(View v)
    {
        Intent it = new Intent();
        it.setAction(Intent.ACTION_SEND);//Intent
        it.setType("image/jpeg");//決定要傳的型態(image)
        Uri uri = Uri.parse("android.resource://" +
                getApplicationContext().getPackageName() + "/" + R.drawable.flower);
        it.putExtra(Intent.EXTRA_STREAM, uri);
        startActivity(it);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LOG","This is onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LOG","This is onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LOG","This is onDestroy");
    }



}
