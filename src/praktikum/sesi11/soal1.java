package praktikum.sesi11;

// Interface Playable
interface Playable {
    void play();
    void pause();
}

// Kelas VideoGame
class VideoGame implements Playable {
    private String title;
    private String platform;

    public VideoGame(String title, String platform) {
        this.title = title;
        this.platform = platform;
    }

    @Override
    public void play() {
        System.out.println("Playing video game: " + title + " on " + platform);
    }

    @Override
    public void pause() {
        System.out.println("Paused video game: " + title);
    }
}

// Kelas BoardGame
class BoardGame implements Playable {
    private String name;
    private int numberOfPlayers;

    public BoardGame(String name, int numberOfPlayers) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
    }

    @Override
    public void play() {
        System.out.println("Playing board game: " + name + " with " + numberOfPlayers + " players");
    }

    @Override
    public void pause() {
        System.out.println("Paused board game: " + name);
    }
}

// Kelas soal1
public class soal1 {
    public static void main(String[] args) {
        Playable videoGame = new VideoGame("The Legend of Zelda", "Nintendo Switch");
        Playable boardGame = new BoardGame("Monopoly", 4);

        videoGame.play();
        videoGame.pause();
        boardGame.play();
        boardGame.pause();
    }
}