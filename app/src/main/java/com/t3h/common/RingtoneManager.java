package com.t3h.common;

import android.content.Context;
import android.media.MediaPlayer;

import com.t3h.final_t3h.R;

public class RingtoneManager {
    private Context context;
    private MediaPlayer mediaPlayer;

    public RingtoneManager(Context context) {
        this.context = context;
        mediaPlayer = MediaPlayer.create(context, R.raw.bphone);
    }

    public void playRingtone() {
        if (!mediaPlayer.isPlaying()) {
            mediaPlayer.setLooping(true);
            mediaPlayer.start();
        }
    }

    public void stopRingtone() {
        if (mediaPlayer != null && mediaPlayer.isPlaying() && mediaPlayer.isLooping()) {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

}