public class King extends Piece {
    public King(boolean white) {
        super(white);
        this.symbol = 'K';
    }

    @Override
    public boolean canMove(Board board, int startRow, int startCol, int endRow, int endCol) {
        int dRow = Math.abs(endRow - startRow), dCol = Math.abs(endCol - startCol);
        if ((dRow <= 1 && dCol <= 1)) {
            Piece target = board.getPiece(endRow, endCol);
            return target == null || target.isWhite() != white;
        }
        return false;
    }
}