package praktikum.sesi11;

// Kelas GameSettings
class GameSettings {
    public static final int MAX_PLAYERS = 4;
}

// Kelas soal3
public class soal3 {
    public static void main(String[] args) {
        System.out.println("Maximum number of players: " + GameSettings.MAX_PLAYERS);
        
        // Uncommenting the line below will cause a compilation error
        // GameSettings.MAX_PLAYERS = 6; // Error: cannot assign a value to final variable MAX_PLAYERS
    }
}