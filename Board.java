public class Board {
    private Piece[][] board;

    public Board() {
        board = new Piece[8][8];
        setup();
    }

    public Piece getPiece(int row, int col) {
        return (row >= 0 && row < 8 && col >= 0 && col < 8) ? board[row][col] : null;
    }

    public void setPiece(int row, int col, Piece piece) {
        board[row][col] = piece;
    }

    public void setup() {
        // Pawns
        for (int i = 0; i < 8; i++) {
            board[1][i] = new Pawn(false);
            board[6][i] = new Pawn(true);
        }
        // Other pieces
        board[0][0] = new Rook(false);
        board[0][7] = new Rook(false);
        board[7][0] = new Rook(true);
        board[7][7] = new Rook(true);
        board[0][1] = new Knight(false);
        board[0][6] = new Knight(false);
        board[7][1] = new Knight(true);
        board[7][6] = new Knight(true);
        board[0][2] = new Bishop(false);
        board[0][5] = new Bishop(false);
        board[7][2] = new Bishop(true);
        board[7][5] = new Bishop(true);
        board[0][3] = new Queen(false);
        board[0][4] = new King(false);
        board[7][3] = new Queen(true);
        board[7][4] = new King(true);
    }

    public void printBoard() {
        System.out.println("\n  a b c d e f g h");
        for (int row = 0; row < 8; row++) {
            System.out.print((8 - row) + " ");
            for (int col = 0; col < 8; col++) {
                Piece p = board[row][col];
                System.out.print((p == null ? "." : p.getSymbol()) + " ");
            }
            System.out.println(8 - row);
        }
        System.out.println("  a b c d e f g h");
    }
}
