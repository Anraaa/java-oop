package praktikum.sesi11;

// Abstract class Game
abstract class Game {
    protected String title;

    public Game(String title) {
        this.title = title;
    }

    abstract void startGame();
}

// Kelas RPGGame
class RPGGame extends Game {
    private int level;

    public RPGGame(String title, int level) {
        super(title);
        this.level = level;
    }

    @Override
    void startGame() {
        System.out.println("Starting RPG Game: " + title + " at level " + level);
    }
}

// Kelas FPSGame
class FPSGame extends Game {
    private String[] weapons;

    public FPSGame(String title, String[] weapons) {
        super(title);
        this.weapons = weapons;
    }

    @Override
    void startGame() {
        System.out.print("Starting FPS Game: " + title + " with weapons: ");
        for (String weapon : weapons) {
            System.out.print(weapon + " ");
        }
        System.out.println();
    }
}

// Kelas soal2
public class soal2 {
    public static void main(String[] args) {
        Game rpgGame = new RPGGame("Final Fantasy", 10);
        Game fpsGame = new FPSGame("Call of Duty", new String[]{"Rifle", "Pistol", "Sniper"});

        rpgGame.startGame();
        fpsGame.startGame();
    }
}