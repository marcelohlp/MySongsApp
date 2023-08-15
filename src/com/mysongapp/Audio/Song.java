package com.mysongapp.Audio;

public class Song extends Audio{

    private String lyrics;
    private Album album;
    private Style style;
    private int track;

    public Song() {

    }

    public Song(String name, int totalDurationSec, int track){
        this.setName(name);
        this.setTotalDurationSec(totalDurationSec);
        this.track = track;
    }

    public Song(String name, String artist, int totalDurationSec, Album album, Style style, String lyrics, int track) {
        super(name, artist, totalDurationSec);
        this.album = album;
        this.style = style;
        this.lyrics = lyrics;
        this.track = track;
    }

    @Override
    public String toString() {
        return this.track + " - " + this.getName();
    }

    public int getTrack() {
        return track;
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
