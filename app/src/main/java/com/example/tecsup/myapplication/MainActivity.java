package com.example.tecsup.myapplication;

import android.graphics.Color;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.github.johnpersano.supertoasts.library.Style;
import com.github.johnpersano.supertoasts.library.SuperActivityToast;
import com.github.johnpersano.supertoasts.library.utils.PaletteUtils;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton btn_flotante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_flotante = findViewById(R.id.floatingActionButton2);
        ImageView imageView;
        btn_flotante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "hola", Toast.LENGTH_SHORT).show();
                SuperActivityToast.create(MainActivity.this, new Style(), Style.TYPE_BUTTON)
                        .setButtonText("UNDO")
                        .setButtonIconResource(R.drawable.ic_add_black_24dp)
                        //.setOnButtonClickListener("good_tag_name", null, onButtonClickListener)
                        .setProgressBarColor(Color.WHITE)
                        .setText("Mira aqui")
                        .setDuration(Style.DURATION_LONG)
                        .setFrame(Style.FRAME_LOLLIPOP)
                        .setColor(PaletteUtils.getSolidColor(PaletteUtils.MATERIAL_PURPLE))
                        .setAnimations(Style.ANIMATIONS_POP).show();

            }
        });
        imageView = findViewById(R.id.perrito);
        //Glide.with(this).load("https://st3.depositphotos.com/2398521/18252/i/1600/depositphotos_182520482-stock-photo-pug-dog-face-profile.jpg").into(imageView);
        imageView.setImageResource(R.drawable.ana);
    }
}
