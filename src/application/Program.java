package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		while(true) {
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.print("Peça que quer mover: ");
			ChessPosition source = UI.readCHessPosition(sc); 
			
			System.out.println();
			System.out.print("Para onde quer mover: ");
			ChessPosition target = UI.readCHessPosition(sc);
			
			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
		}

	}

}
