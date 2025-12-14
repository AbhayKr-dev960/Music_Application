package com.example.musicapp

import android.media.MediaPlayer
import android.content.Context

class MusicPlayer {

    private var mediaPlayer: MediaPlayer? = null

    fun play(context: Context, resId: Int) {
        stop()
        mediaPlayer = MediaPlayer.create(context, resId)
        mediaPlayer?.start()
    }

    fun pause() {
        mediaPlayer?.pause()
    }

    fun stop() {
        mediaPlayer?.release()
        mediaPlayer = null
    }
}
