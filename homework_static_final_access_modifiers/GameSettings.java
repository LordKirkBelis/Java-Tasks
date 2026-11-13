package homework_static_final_access_modifiers;

public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    GameSettings(String gameName, int currentPlayers) {
        this.gameName =  gameName;
        this.currentPlayers = currentPlayers;
    }

    static void setMaxPlayers(int newMaxPlayers) {
        maxPlayers = newMaxPlayers;
    }
    void addPlayer() {
        currentPlayers++;
    }
    void printGameStatus() {
        System.out.println("Название: " + gameName + ", текущее количество игроков: " + currentPlayers + ", максимально количество игроков:  " + maxPlayers);
    }

    public static void main(String[] args) {
        GameSettings game1 = new GameSettings("Tetris", 50);
        GameSettings game2 = new GameSettings("Warcraft", 100);
        GameSettings.setMaxPlayers(150);
        game1.addPlayer();
        game1.addPlayer();
        game1.addPlayer();
        game1.printGameStatus();
        game2.printGameStatus();

    }
}
