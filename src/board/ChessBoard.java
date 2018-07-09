package board;

import java.util.HashMap;

import piece.Bishop;
import piece.Castle;
import piece.ChessPiece;
import piece.ChessPiece.Color;
import piece.King;
import piece.Knight;
import piece.Pawn;
import piece.Queen;

public class ChessBoard {
	public static final int BOARD_SIZE = 8;
	private HashMap<String, ChessPiece> board;
	private ChessPiece piece;
	
	public ChessBoard()
	{
		board.put("11", new Castle( 1, 1, Color.WHITE));
		board.put("12", new Knight(1,2, Color.WHITE));
		board.put("13", new Bishop(1,3, Color.WHITE));
		board.put("14", new Queen(1,4, Color.WHITE));
		board.put("15", new King(1,5, Color.WHITE));
		board.put("16", new Bishop(1,6, Color.WHITE));
		board.put("17", new Knight(1,7, Color.WHITE));
		board.put("18", new Castle(1,8, Color.WHITE));
		board.put("21", new Pawn(2,1, Color.WHITE));
		board.put("22", new Pawn(2,2, Color.WHITE));
		board.put("23", new Pawn(2,3, Color.WHITE));
		board.put("24", new Pawn(2,4, Color.WHITE));
		board.put("25", new Pawn(2,5, Color.WHITE));
		board.put("26", new Pawn(2,6, Color.WHITE));
		board.put("27", new Pawn(2,7, Color.WHITE));
		board.put("28", new Pawn(2,8, Color.WHITE));
		
		board.put("81", new Castle(8,1, Color.BLACK));
		board.put("82", new Knight(8,2, Color.BLACK));
		board.put("83", new Bishop(8,3, Color.BLACK));
		board.put("84", new Queen(8,4, Color.BLACK));
		board.put("85", new King(8,5, Color.BLACK));
		board.put("86", new Bishop(8,6, Color.BLACK));
		board.put("87", new Knight(8,7, Color.BLACK));
		board.put("88", new Castle(8,8, Color.BLACK));
		board.put("71", new Pawn(7,1, Color.BLACK));
		board.put("72", new Pawn(7,2, Color.BLACK));
		board.put("73", new Pawn(7,3, Color.BLACK));
		board.put("74", new Pawn(7,4, Color.BLACK));
		board.put("75", new Pawn(7,5, Color.BLACK));
		board.put("76", new Pawn(7,6, Color.BLACK));
		board.put("77", new Pawn(7,7, Color.BLACK));
		board.put("78", new Pawn(7,8, Color.BLACK));
	}
	
	public ChessPiece pieceAt(Integer row, Integer col)
	{
		String key = (row.toString()).concat(col.toString());
		return board.get(key);
	}
	
	public void addPiece(ChessPiece piece)
	{
		String key = (piece.getRow().toString()).concat(piece.getCol().toString());
		board.put(key, piece);
	}
	
	public void removePiece(Integer row, Integer col)
	{
		String key = (row.toString()).concat(col.toString());
		board.remove(key);
	}
	
	public HashMap<String, ChessPiece> getBoard() {
		return board;
	}
}
