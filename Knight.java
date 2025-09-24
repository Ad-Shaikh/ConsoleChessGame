public class Knight extends Piece {
    public Knight(boolean white) {
        super(white);
        this.symbol = 'N';
    }

    @Override
    public boolean canMove(Board board, int startRow, int startCol, int endRow, int endCol) {
        int dRow = Math.abs(endRow - startRow), dCol = Math.abs(endCol - startCol);
        if (dRow * dCol == 2) {
            Piece target = board.getPiece(endRow, endCol);
            return target == null || target.isWhite() != white;
        }
        return false;
    }
}
