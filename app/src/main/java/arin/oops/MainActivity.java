package arin.oops;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer oopsplayer;
    private MediaPlayer preplayer;
    private MediaPlayer fatplayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        oopsplayer = MediaPlayer.create(MainActivity.this, R.raw.oops);
        preplayer = MediaPlayer.create(MainActivity.this, R.raw.pre);
        fatplayer = MediaPlayer.create(MainActivity.this, R.raw.fat);
    }

    public void playoops(View view) {
        if(oopsplayer.isPlaying()) {
            oopsplayer.seekTo(0);
        }
        oopsplayer.start();
    }

    public void playpre(View view) {
        if(preplayer.isPlaying()) {
            preplayer.seekTo(0);
        }
        preplayer.start();
    }

    public void playfat(View view) {
        if(fatplayer.isPlaying()) {
            fatplayer.seekTo(0);
        }
        fatplayer.start();
    }
}
