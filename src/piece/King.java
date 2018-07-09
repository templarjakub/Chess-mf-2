package piece;

import board.ChessBoard;

public class King extends ChessPiece{

	public King(Integer row, Integer col, Color color) {
		super(row, col, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canMoveTo(Integer row, Integer col, ChessBoard board) {
		
		//pokud splnuje podminku jednoho z platnych tahu, tak
		if((0<=(this.row - row)<=1 && 0<=(this.col - col)<=1) && (1==(this.row - row) || (this.col - col)==1));
			return true;
		else
			return false;
		for(int i=0; i<=1 i++) {
			for(int j=0, j<=1, j++) {
				if((i=0) && (j=0))
						continue;
				board.pieceAt(row, col);
			}
		}
		board.pieceAt(row, col)
		
		else if()
	}

	@Override
	public void moveTo(Integer row, Integer col) {
		
		
	}

	@Override
	public PieceType getType() {
		// TODO Auto-generated method stub
		return null;
	}
}
