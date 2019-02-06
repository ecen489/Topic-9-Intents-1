package edu.tamu.ece.t9_intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class ImgDisp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img_disp);
        Intent intent=getIntent();
        String extra = intent.getStringExtra("animal");
        Toast.makeText(ImgDisp.this, extra, Toast.LENGTH_SHORT).show();
    }
}
