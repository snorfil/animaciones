package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.media.Image;
import android.os.Bundle;
import android.text.BoringLayout;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView img;
    EditText editScaleX,editScaleY,editZ,editPivot;
    Button btn;
    int height;
    int width;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getDimensiones();
        setContentView(R.layout.activity_main);

        initViews();

        listeners();

    }

    private void getDimensiones() {
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        width = metrics.widthPixels;
        height = metrics.heightPixels;
    }

    private void listeners() {
//        img.setOnClickListener(this);
        btn.setOnClickListener(this);

    }

    private void initViews() {
        editScaleX = findViewById(R.id.edit_scalex);
        editScaleY = findViewById(R.id.edit_scaley);
        editZ = findViewById(R.id.editZ);
        editPivot = findViewById(R.id.edit_pivot);
        btn = findViewById(R.id.animate);
        img = findViewById(R.id.img);

    }

    private void scaleX(){
        float scaleX = Float.parseFloat(editScaleX.getText().toString());
        ObjectAnimator anim = ObjectAnimator.ofFloat(img,"scaleX",scaleX);
        anim.setDuration(1000);
        anim.start();
    }

    private void scaleY() {
        float scaleY = Float.parseFloat(editScaleY.getText().toString());

        ObjectAnimator anim = ObjectAnimator.ofFloat(img,"scaleY",scaleY);
        anim.setDuration(1000);
        anim.start();
    }

    private void scaleZ() {
        float z = Float.parseFloat(editZ.getText().toString());
        ObjectAnimator anim = ObjectAnimator.ofFloat(img,"z",z);
        anim.start();
    }

    @Override
    public void onClick(View view)  {
        scaleX();
        scaleY();
        scaleZ();

    }




}