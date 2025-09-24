# ConsoleChessGame

A simple **console-based chess game** implemented in Java, designed to test and practice core Java programming concepts.

## Features

- Classic chess rules with standard chess pieces
- Text-based interface suitable for console/terminal play
- Object-oriented design focusing on Java fundamentals
- Piece movement validation and basic gameplay mechanics
- Clear code structure for easy understanding and extension

## Purpose

This project is primarily intended as a learning exercise to reinforce foundational Java skills such as:

- Classes, inheritance, and polymorphism
- Encapsulation with class fields and methods
- Constructors and object instantiation
- Control flow and input handling in console applications
- Basic error handling and validation

## Requirements

- Java Development Kit (JDK) 8 or higher installed
- Command line/terminal for running the game

## How to Use

1. Clone this repository:

   ```
   git clone https://github.com/Ad-Shaikh/ConsoleChessGame.git
   ```

2. Compile the Java source files:

   ```
   javac *.java
   ```

3. Run the game:

   ```
   java ChessGame
   ```

## Project Structure

```
 ├── ChessGame.java          # Entry point and game loop
 ├── Piece.java         # Abstract base class for chess pieces
 ├── Pawn.java          # Pawn piece class
 ├── Rook.java          # Rook piece class
 ├── ChessBoard.java    # Represents the game board and logic
 └── ...                # Other piece classes and utilities
```

## Future Improvements

- Implement full chess rules including castling, en passant, and promotion
- Add AI opponent or multiplayer support
- Improve input validation and user experience
- Develop a GUI version with graphical piece icons

## Contributing

Contributions and suggestions are welcome! Feel free to open issues or pull requests.

## License

This project is licensed under the MIT License.

---
