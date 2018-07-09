package piece;

import board.ChessBoard;

public abstract class ChessPiece {
	
	public static final int WHITES = 0;
	public static final int BLACK = 1;
	protected Integer row;
	protected Integer col;
	protected final Color color;
	
	public enum Color{
		BLACK,
		WHITE;
	}
	
	public ChessPiece(Integer row, Integer col, Color color){
		this.row = row;
		this.col = col;
		this.color = color;
	}
	
	public enum PieceType{
		BISHOP,
		CASTLE,
		KING,
		KNIGHT,
		PAWN,
		QUEEN;
		
		private ChessBoard board;
		
		public ChessPiece findType(ChessBoard board, Integer row, Integer col) {
			
			ChessPiece piece = board.pieceAt(row, col){
				switch(piece.getType())
				{
				case KING: piece.dokingThings();
				case QUEEN: piece.doqueenThings();
				}
			}
		}
		
		public void getType() {
			
		}
	}
	
	public abstract boolean canMoveTo(Integer row, Integer col, ChessBoard board);
	public abstract PieceType getType();
	public abstract void moveTo(Integer row, Integer col);

	public Integer getRow() {
		return row;
	}

	public Integer getCol() {
		return col;
	}

	public Color getColor() {
		return color;
	}
}
