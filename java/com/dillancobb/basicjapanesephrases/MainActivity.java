package com.dillancobb.basicjapanesephrases;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    AudioManager audioManager;

    public void btnGoodBye(View view) {
        setMediaPlayer(1);
        mediaPlayer.start();
    }

    public void btnHello(View view) {
        setMediaPlayer(2);
        mediaPlayer.start();
    }

    public void btnHowAreYou(View view) {
        setMediaPlayer(3);
        mediaPlayer.start();
    }

    public void btnMyNameIs(View view) {
        setMediaPlayer(4);
        mediaPlayer.start();
    }

    public void btnNo(View view) {
        setMediaPlayer(5);
        mediaPlayer.start();
    }

    public void btnThankYou(View view) {
        setMediaPlayer(6);
        mediaPlayer.start();
    }

    public void btnYes(View view) {
        setMediaPlayer(7);
        mediaPlayer.start();
    }

    public void btnYoureWelcome(View view) {
        setMediaPlayer(8);
        mediaPlayer.start();
    }

    public void setMediaPlayer(int audio) {
        /* int values for audio files
         *  1 - goodbye
         *  2 - hello
         *  3 - howareyou
         *  4 - mynameis
         *  5 - no
         *  6 - thankyou
         *  7 - yes
         *  8 - yourewelcome
         */

        switch (audio) {
            case 1:
                mediaPlayer = MediaPlayer.create(this, R.raw.goodbye);
                break;

            case 2:
                mediaPlayer = MediaPlayer.create(this, R.raw.hello);
                break;

            case 3:
                mediaPlayer = MediaPlayer.create(this, R.raw.howareyou);
                break;

            case 4:
                mediaPlayer = MediaPlayer.create(this, R.raw.mynameis);
                break;

            case 5:
                mediaPlayer = MediaPlayer.create(this, R.raw.no);
                break;

            case 6:
                mediaPlayer = MediaPlayer.create(this, R.raw.thankyou);
                break;

            case 7:
                mediaPlayer = MediaPlayer.create(this, R.raw.yes);
                break;

            case 8:
                mediaPlayer = MediaPlayer.create(this, R.raw.yourewelcome);
                break;

            default:
                Toast toast = Toast.makeText(this, "Error playing sound file.",
                        Toast.LENGTH_LONG);
        }

        audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
