package piece;

import board.ChessBoard;

public class Bishop extends ChessPiece {
	private final PieceType type = PieceType.QUEEN; 

	public Bishop(Integer row, Integer col, Color color) {
		super(row, col, color);
	}

	@Override
	public PieceType getType() {
		return type;
		
	}

	@Override
	public boolean canMoveTo(String rowCol, ChessBoard board) {
		return if((this.row - row) == (this.col - col));
	}

	@Override
	public void moveTo(Integer row, Integer col) {
		this.row = row;
		this.col = col;
	}
}
