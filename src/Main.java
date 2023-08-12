import com.mysongapp.Audio.Album;
import com.mysongapp.Audio.Song;
import com.mysongapp.Audio.Style;

public class Main {

    public static void main(String[] args) {

        Style rock = new Style("Rock");
        Album aerosmith = new Album("Aerosmith", 1973, "Aerosmith");

        String name = "Dream On";
        String autor = "Aerosmith";
        int totalDurationSec = 267;
        String lyrics = """
                Every time that I look in the mirror
                All these lines on my face getting clearer
                The past is gone
                Oh, it went by like dusk to dawn
                Isn't that the way?
                Everybody's got their dues in life to pay, oh, oh, oh
                ...
                """;

        Song dreamOn = new Song(name, autor, totalDurationSec, aerosmith, rock, lyrics);

        dreamOn.addViews();
        dreamOn.addViews();
        dreamOn.addViews();
        dreamOn.addViews();
        dreamOn.addViews();

        dreamOn.addLike();
        dreamOn.addLike();
        dreamOn.addLike();
        dreamOn.addLike();

        dreamOn.printInfo();
        dreamOn.printSongInfo();
        dreamOn.printLikeViews();
        dreamOn.classify();
        dreamOn.printLyrics();

    }

}
