package com.mysongapp.Audio;

public class Album {

    private String name;
    private int launchYear;
    private String artist;

    public Album() {

    }

    public Album(String name, int launchYear, String artist) {
        this.name = name;
        this.launchYear = launchYear;
        this.artist = artist;
    }

    public void printAlbum() {
        System.out.println(name + "\n" + artist + "\n(" + launchYear + ")");
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
}
