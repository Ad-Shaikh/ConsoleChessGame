public class Bishop extends Piece {
    public Bishop(boolean white) {
        super(white);
        this.symbol = 'B';
    }

    @Override
    public boolean canMove(Board board, int sr, int sc, int er, int ec) {
        if (Math.abs(sr - er) != Math.abs(sc - ec))
            return false;
        int stepR = (er > sr) ? 1 : -1, stepC = (ec > sc) ? 1 : -1;
        int r = sr + stepR, c = sc + stepC;
        while (r != er && c != ec) {
            if (board.getPiece(r, c) != null)
                return false;
            r += stepR;
            c += stepC;
        }
        Piece target = board.getPiece(er, ec);
        return target == null || target.isWhite() != white;
    }
}
