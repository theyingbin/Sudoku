package Sudoku;

public class Piece{
	private int value;
	public Piece(int value)
	{
		this.value=value;
	}
	public int getValue(){
		return value;
	}
	public boolean isLocked(){
		return false;
	}
	public String toString(){
		if(value==0){
			return "";
		}else{
			return value+"";
		}
	}
}