package com.mysongapp.Audio;

public class Song extends Audio{

    private String lyrics;
    private Album album;
    private Style style;

    public Song(String name, String artist, int totalDurationSec, Album album, Style style, String lyrics) {
        super(name, artist, totalDurationSec);
        this.album = album;
        this.style = style;
        this.lyrics = lyrics;
    }

    public void printSongInfo() {
        System.out.println(album.getName() + " (" + style.getStyleName() + ")");
    }

    public void printLyrics() {
        System.out.println("Letra:\n" + lyrics);
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

}
