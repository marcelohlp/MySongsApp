package com.mysongapp.Tests;

import com.mysongapp.Audio.Album;
import com.mysongapp.Audio.Song;

import java.util.ArrayList;
import java.util.Comparator;

public class TestAlbum {

    public static void main(String[] args) {

        // Creatind album Bad (Michael Jackson)
        String artist = "Michael Jackson";
        Album bad = new Album("Thriller", 1982, artist);
        ArrayList<Song> tracks = new ArrayList<>();
        bad.setAlbumTrack(tracks);

        // Add songs to our album
        Song theLadyInMyLife = new Song("The Lady In My Life", 300, 9);
        tracks.add(theLadyInMyLife);
        Song prettyYoungThing = new Song("Pretty Young Thing", 239, 8);
        tracks.add(prettyYoungThing);
        Song humanNature = new Song("Human Nature", 246, 7);
        tracks.add(humanNature);
        Song billieJean = new Song("Billie Jean", 296, 6);
        tracks.add(billieJean);
        Song beatIt = new Song("Beat It", 258, 5);
        tracks.add(beatIt);
        Song thriller = new Song("Thriller", 357, 4);
        tracks.add(thriller);
        Song theGirlIsMine = new Song("The Girl Is Mine", 222, 3);
        tracks.add(theGirlIsMine);
        Song babyBeMine = new Song("Baby Be Mine", 260, 2);
        tracks.add(babyBeMine);
        Song wannaBeStartinSomethin = new Song("Wanna Be Startin' Somethin'", 363, 1);
        tracks.add(wannaBeStartinSomethin);

        // Sorting songs by track number
        tracks.sort(Comparator.comparing(Song::getTrack));

        // Showing album's info
        System.out.println(bad);
        System.out.println("Tracks:");
        for (Song item: tracks) {
            System.out.println(item);
        }

    }

}
