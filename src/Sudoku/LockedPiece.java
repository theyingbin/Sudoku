package Sudoku;


public class LockedPiece extends Piece{
	public LockedPiece(int value){
		super(value);
	}
	public boolean isLocked(){
		return true;
	}
}