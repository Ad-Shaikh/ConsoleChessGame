public class Rook extends Piece {
    public Rook(boolean white) { super(white); this.symbol = 'R'; }
    @Override
    public boolean canMove(Board board, int sr, int sc, int er, int ec) {
        if (sr != er && sc != ec) return false;
        int dr = Integer.signum(er-sr), dc = Integer.signum(ec-sc);
        int r = sr + dr, c = sc + dc;
        while ((r != er || c != ec) && (r>=0 && r<8 && c>=0 && c<8)) {
            if (r==er && c==ec) break;
            if (board.getPiece(r, c) != null) return false;
            r += dr; c += dc;
        }
        Piece target = board.getPiece(er, ec);
        return target == null || target.isWhite() != white;
    }
}
