public class Player {
    private String name;
    private boolean white;

    public Player(String name, boolean white) {
        this.name = name;
        this.white = white;
    }

    public String getName() {
        return name;
    }

    public boolean isWhite() {
        return white;
    }
}
