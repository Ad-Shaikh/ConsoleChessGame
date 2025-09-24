public class Pawn extends Piece {
    public Pawn(boolean white) {
        super(white);
        this.symbol = 'P';
    }

    @Override
    public boolean canMove(Board board, int sr, int sc, int er, int ec) {
        int dir = (white ? -1 : 1);
        if (sc == ec) {
            if (er - sr == dir && board.getPiece(er, ec) == null)
                return true;
            if ((white && sr == 6 || !white && sr == 1) && er - sr == 2 * dir
                    && board.getPiece(sr + dir, sc) == null && board.getPiece(er, ec) == null)
                return true;
        } else if (Math.abs(sc - ec) == 1 && er - sr == dir && board.getPiece(er, ec) != null
                && board.getPiece(er, ec).isWhite() != white)
            return true;
        return false;
    }
}
