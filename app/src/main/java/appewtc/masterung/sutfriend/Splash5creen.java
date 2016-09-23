package appewtc.masterung.sutfriend;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash5creen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash5creen);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Splash5creen.this, MainActivity.class));
            finish();
            }
        }, 8000);

        // Soun Effect
        MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.intro_tata);
        mediaPlayer.start();

    } //Main Mwthod
} //Main Class
