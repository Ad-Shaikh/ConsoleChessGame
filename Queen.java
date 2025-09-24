public class Queen extends Piece {
    public Queen(boolean white) { super(white); this.symbol = 'Q'; }
    @Override
    public boolean canMove(Board board, int sr, int sc, int er, int ec) {
        if (sr==er || sc==ec)
            return (new Rook(white)).canMove(board, sr, sc, er, ec);
        if (Math.abs(sr-er)==Math.abs(sc-ec))
            return (new Bishop(white)).canMove(board, sr, sc, er, ec);
        return false;
    }
}
