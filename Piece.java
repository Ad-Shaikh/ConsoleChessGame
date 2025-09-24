public abstract class Piece {
    protected boolean white;
    protected char symbol;

    public Piece(boolean white) {
        this.white = white;
    }

    public boolean isWhite() {
        return white;
    }

    public char getSymbol() {
        return white ? Character.toUpperCase(symbol) : Character.toLowerCase(symbol);
    }

    public abstract boolean canMove(Board board, int startRow, int startCol, int endRow, int endCol);
}
