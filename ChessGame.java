import java.util.Scanner;

public class ChessGame {
    private Board board;
    private Player whitePlayer, blackPlayer;
    private boolean whiteTurn;
    private Scanner scanner;

    public ChessGame() {
        board = new Board();
        scanner = new Scanner(System.in);
        setupPlayers();
        whiteTurn = true;
    }

    private void setupPlayers() {
        System.out.print("Enter name for White: ");
        whitePlayer = new Player(scanner.nextLine(), true);
        System.out.print("Enter name for Black: ");
        blackPlayer = new Player(scanner.nextLine(), false);
    }

    public void play() {
        while (true) {
            board.printBoard();
            Player current = whiteTurn ? whitePlayer : blackPlayer;
            System.out.println(current.getName() + "'s move (" + (current.isWhite() ? "White" : "Black") + ")");
            System.out.print("Enter move (e.g. e2e4) or 'quit': ");
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("quit") || input.equals("q")) {
                System.out.println("Game ended.");
                break;
            }
            if (!input.matches("[a-h][1-8][a-h][1-8]")) {
                System.out.println("Invalid input format!");
                continue;
            }
            int fromCol = input.charAt(0) - 'a';
            int fromRow = 8 - Character.getNumericValue(input.charAt(1));
            int toCol = input.charAt(2) - 'a';
            int toRow = 8 - Character.getNumericValue(input.charAt(3));
            Piece sourcePiece = board.getPiece(fromRow, fromCol);

            if (sourcePiece == null) {
                System.out.println("No piece at source!");
                continue;
            }
            if (sourcePiece.isWhite() != whiteTurn) {
                System.out.println("Not your turn!");
                continue;
            }
            if (!sourcePiece.canMove(board, fromRow, fromCol, toRow, toCol)) {
                System.out.println("Illegal move!");
                continue;
            }
            Piece destPiece = board.getPiece(toRow, toCol);
            if (destPiece instanceof King) {
                System.out.println(current.getName() + " wins! King's captured.");
                break;
            }
            board.setPiece(toRow, toCol, sourcePiece);
            board.setPiece(fromRow, fromCol, null);
            whiteTurn = !whiteTurn;
        }
    }

    public static void main(String[] args) {
        new ChessGame().play();
    }
}
