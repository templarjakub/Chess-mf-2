package piece;

import board.ChessBoard;

public class Castle extends ChessPiece {

	public Castle(Integer row, Integer col, Color color) {
		super(row, col, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canMoveTo(Integer row, Integer col, ChessBoard board) {
		return if(((this.row - row)!= 0 && (this.col-col) == 0) || ((this.row - row) == 0 && (this.col-col) != 0));
	}

	@Override
	public PieceType getType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void moveTo(Integer row, Integer col) {
		// TODO Auto-generated method stub
		
	}

}
