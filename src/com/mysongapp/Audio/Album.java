package com.mysongapp.Audio;

import java.util.ArrayList;

public class Album {

    private String name;
    private int launchYear;
    private String artist;
    private ArrayList<Song> albumTrack;

    public Album() {

    }

    public Album(String name, int launchYear, String artist) {
        this.name = name;
        this.launchYear = launchYear;
        this.artist = artist;
    }

    @Override
    public String toString() {
        return artist + " - " + name + " (" + launchYear + ")";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public ArrayList<Song> getAlbumTrack() {
        return albumTrack;
    }

    public void setAlbumTrack(ArrayList<Song> albumTrack) {
        this.albumTrack = albumTrack;
    }

}
