package com.mysongapp.Audio;

public class Podcast extends Audio {

    int episode;
    String summary;
    String guest;

    public Podcast(String name, String artist, int totalDurationSec, int episode, String guest, String summary) {
        super(name, artist, totalDurationSec);
        this.episode = episode;
        this.summary = summary;
        this.guest = guest;
    }

    public void printPodcastInfo() {
        System.out.println("Episódio: " + episode + "\nConvidado: " + guest);
    }

    public void printSummary() {
        System.out.println("Resumo:\n" + summary);
    }

    public void setEpisode(int episode) {
        this.episode = episode;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }

}
