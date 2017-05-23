package arin.oops;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {

    private MediaPlayer oopsplayer;
    private MediaPlayer preplayer;
    private MediaPlayer fatplayer;
    Button oopsButton;
    Button preButton;
    Button fatButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        oopsplayer = MediaPlayer.create(MainActivity.this, R.raw.oops);
        preplayer = MediaPlayer.create(MainActivity.this, R.raw.pre);
        fatplayer = MediaPlayer.create(MainActivity.this, R.raw.fat);
        addListenerOnButton();
    }

    public void addListenerOnButton() {
        oopsButton = (Button) findViewById(R.id.button6);
        preButton = (Button) findViewById(R.id.button8);
        fatButton = (Button) findViewById(R.id.button7);
        oopsButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(oopsplayer.isPlaying()) {
                    oopsplayer.seekTo(0);
                }
                oopsplayer.start();
            }
        });
        preButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(preplayer.isPlaying()) {
                    preplayer.seekTo(0);
                }
                preplayer.start();
            }
        });
        fatButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(fatplayer.isPlaying()) {
                    fatplayer.seekTo(0);
                }
                fatplayer.start();
            }
        });
    }
}
