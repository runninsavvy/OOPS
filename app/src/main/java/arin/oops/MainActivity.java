package arin.oops;

import android.os.AsyncTask;
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
    AsyncTask<Void, Void, Void> asyncTask;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        oopsplayer = MediaPlayer.create(MainActivity.this, R.raw.oops);
        preplayer = MediaPlayer.create(MainActivity.this, R.raw.pre);
        fatplayer = MediaPlayer.create(MainActivity.this, R.raw.fat);
        jonplayer = MediaPlayer.create(MainActivity.this, R.raw.jon);
        jon = (ImageView) findViewById(R.id.imageView);
        addListenerOnButton();
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
                if (jonplayer.isPlaying()) {
                    jonplayer.seekTo(0);
                }
                jonplayer.start();
                startLooker();
            }
        });
    }

    public void startLooker() {
        asyncTask = new AsyncTask<Void, Void, Void>() {
            @Override
            protected void onPreExecute() {
                jon.setVisibility(View.VISIBLE);
            }
            @Override
            protected Void doInBackground(Void...params) {
                while (jonplayer.isPlaying()) {
                }
                return null;
            }
            @Override
            protected void onPostExecute(Void a) {
                jon.setVisibility(View.INVISIBLE);
            }
            @Override
            protected void onProgressUpdate(Void...params) {
            }
        }.execute();
    }
}
