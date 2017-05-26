package arin.oops;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.view.View;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {

    private MediaPlayer oopsplayer;
    private MediaPlayer preplayer;
    private MediaPlayer fatplayer;
    private MediaPlayer jonplayer;
    ImageView jon;
    Button oopsButton;
    Button preButton;
    Button fatButton;
    ImageButton arinButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        oopsplayer = MediaPlayer.create(MainActivity.this, R.raw.oops);
        preplayer = MediaPlayer.create(MainActivity.this, R.raw.pre);
        fatplayer = MediaPlayer.create(MainActivity.this, R.raw.fat);
        jonplayer = MediaPlayer.create(MainActivity.this, R.raw.jon);
        jon = (ImageView) findViewById(R.id.imageView);
        jon.setVisibility(View.INVISIBLE);
        addListenerOnButton();
        /*Thread jonDetector = new Thread() {
            public void run() {
                if(jonplayer.isPlaying()) {
                    jon.setVisibility(View.VISIBLE);
                }
                else {
                    jon.setVisibility(View.INVISIBLE);
                }
            }
        };
        jonDetector.start();*/
    }

    public void addListenerOnButton() {
        oopsButton = (Button) findViewById(R.id.button6);
        preButton = (Button) findViewById(R.id.button8);
        fatButton = (Button) findViewById(R.id.button7);
        arinButton = (ImageButton) findViewById(R.id.imageButton2);
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

        arinButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                jon.setVisibility(View.VISIBLE);
                if (jonplayer.isPlaying()) {
                    jonplayer.seekTo(0);
                }
                jonplayer.start();
                while(jonplayer.isPlaying()) {
                }
                jon.setVisibility(View.GONE);
            }
        });
    }
}
