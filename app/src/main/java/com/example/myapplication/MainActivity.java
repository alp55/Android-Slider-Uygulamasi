package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ImageView resim;
    int say=0;

    List <Drawable> resimler=new ArrayList<Drawable>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resim= (ImageView) findViewById(R.id.resimkoy);


        resimler.add(getDrawable(R.drawable.alp1));
        resimler.add(getDrawable(R.drawable.alp2));
        resimler.add(getDrawable(R.drawable.alp3));
        resimler.add(getDrawable(R.drawable.alp4));
        resimler.add(getDrawable(R.drawable.alp5));
        resimler.add(getDrawable(R.drawable.alp6));
        resimler.add(getDrawable(R.drawable.alp7));
        resimler.add(getDrawable(R.drawable.alp8));
        resimler.add(getDrawable(R.drawable.alp9));
        resim.setImageDrawable(resimler.get(say));


    }
    public void sag(View view)
    {
        if (say<8)
        {
            say++;
            resim.setImageDrawable(resimler.get(say));
        }


    }
    public void sol(View view)
    {
        if (say>0)
        {
            say--;
            resim.setImageDrawable(resimler.get(say));
        }

    }
    public void son(View view)
    {
        resim.setImageDrawable(resimler.get(8));
    }
    public void ilk(View view)
    {
        resim.setImageDrawable(resimler.get(0));
    }
}
//resimler.setImageDrawable(resimler.get(say+1))
//Toast.makeText(MainActivity.this,"zaten ilk resimdesiniz",Toast)