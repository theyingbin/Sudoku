package Sudoku;


import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class SudokuGame {
	private Grid<Piece> theGrid;
	public SudokuGame(Grid<Piece> gr){
		theGrid = gr;
		initialFill();
	}
	public void initialFill(){
		int x=(int)(Math.random()*3);
		if(x==0){
			theGrid.put(new Location(0,0), new LockedPiece(8));
			theGrid.put(new Location(0,3), new LockedPiece(9));
			theGrid.put(new Location(0,4), new LockedPiece(3));
			theGrid.put(new Location(0,8), new LockedPiece(2));
			theGrid.put(new Location(1,2), new LockedPiece(9));
			theGrid.put(new Location(1,7), new LockedPiece(4));
			theGrid.put(new Location(2,0), new LockedPiece(7));
			theGrid.put(new Location(2,2), new LockedPiece(2));
			theGrid.put(new Location(2,3), new LockedPiece(1));
			theGrid.put(new Location(2,6), new LockedPiece(9));
			theGrid.put(new Location(2,7), new LockedPiece(6));
			theGrid.put(new Location(3,0), new LockedPiece(2));
			theGrid.put(new Location(3,7), new LockedPiece(9));
			theGrid.put(new Location(4,1), new LockedPiece(6));
			theGrid.put(new Location(4,7), new LockedPiece(7));
			theGrid.put(new Location(5,1), new LockedPiece(7));
			theGrid.put(new Location(5,5), new LockedPiece(6));
			theGrid.put(new Location(5,8), new LockedPiece(5));
			theGrid.put(new Location(6,1), new LockedPiece(2));
			theGrid.put(new Location(6,2), new LockedPiece(7));
			theGrid.put(new Location(6,5), new LockedPiece(8));
			theGrid.put(new Location(6,6), new LockedPiece(4));
			theGrid.put(new Location(6,8), new LockedPiece(6));
			theGrid.put(new Location(7,1), new LockedPiece(3));
			theGrid.put(new Location(7,6), new LockedPiece(5));
			theGrid.put(new Location(8,0), new LockedPiece(5));
			theGrid.put(new Location(8,4), new LockedPiece(6));
			theGrid.put(new Location(8,5), new LockedPiece(2));
			theGrid.put(new Location(8,8), new LockedPiece(8));
		}
		else if(x==1){
			theGrid.put(new Location(0,0), new LockedPiece(5));
			theGrid.put(new Location(0,1), new LockedPiece(3));
			theGrid.put(new Location(0,4), new LockedPiece(7));
			theGrid.put(new Location(1,0), new LockedPiece(6));
			theGrid.put(new Location(1,3), new LockedPiece(1));
			theGrid.put(new Location(1,4), new LockedPiece(9));
			theGrid.put(new Location(1,5), new LockedPiece(5));
			theGrid.put(new Location(2,1), new LockedPiece(9));
			theGrid.put(new Location(2,2), new LockedPiece(8));
			theGrid.put(new Location(2,7), new LockedPiece(6));
			theGrid.put(new Location(3,0), new LockedPiece(8));
			theGrid.put(new Location(3,4), new LockedPiece(6));
			theGrid.put(new Location(3,8), new LockedPiece(3));
			theGrid.put(new Location(4,0), new LockedPiece(4));
			theGrid.put(new Location(4,3), new LockedPiece(8));
			theGrid.put(new Location(4,5), new LockedPiece(3));
			theGrid.put(new Location(4,8), new LockedPiece(1));
			theGrid.put(new Location(5,0), new LockedPiece(7));
			theGrid.put(new Location(5,4), new LockedPiece(2));
			theGrid.put(new Location(5,8), new LockedPiece(6));
			theGrid.put(new Location(6,1), new LockedPiece(6));
			theGrid.put(new Location(6,6), new LockedPiece(2));
			theGrid.put(new Location(6,7), new LockedPiece(8));
			theGrid.put(new Location(7,3), new LockedPiece(4));
			theGrid.put(new Location(7,4), new LockedPiece(1));
			theGrid.put(new Location(7,5), new LockedPiece(9));
			theGrid.put(new Location(7,8), new LockedPiece(5));
			theGrid.put(new Location(8,4), new LockedPiece(8));
			theGrid.put(new Location(8,7), new LockedPiece(7));
			theGrid.put(new Location(8,8), new LockedPiece(9));
		}
		else{
			theGrid.put(new Location(0,5), new LockedPiece(6));
			theGrid.put(new Location(0,7), new LockedPiece(8));
			theGrid.put(new Location(1,2), new LockedPiece(9));
			theGrid.put(new Location(1,3), new LockedPiece(1));
			theGrid.put(new Location(1,5), new LockedPiece(5));
			theGrid.put(new Location(1,6), new LockedPiece(3));
			theGrid.put(new Location(1,7), new LockedPiece(7));
			theGrid.put(new Location(1,8), new LockedPiece(2));
			theGrid.put(new Location(2,1), new LockedPiece(8));
			theGrid.put(new Location(2,3), new LockedPiece(7));
			theGrid.put(new Location(2,7), new LockedPiece(1));
			theGrid.put(new Location(2,8), new LockedPiece(6));
			theGrid.put(new Location(3,7), new LockedPiece(3));
			theGrid.put(new Location(3,8), new LockedPiece(4));
			theGrid.put(new Location(4,3), new LockedPiece(3));
			theGrid.put(new Location(4,4), new LockedPiece(5));
			theGrid.put(new Location(4,5), new LockedPiece(1));
			theGrid.put(new Location(5,0), new LockedPiece(7));
			theGrid.put(new Location(5,1), new LockedPiece(3));
			theGrid.put(new Location(6,0), new LockedPiece(6));
			theGrid.put(new Location(6,1), new LockedPiece(1));
			theGrid.put(new Location(6,5), new LockedPiece(8));
			theGrid.put(new Location(6,7), new LockedPiece(2));
			theGrid.put(new Location(7,0), new LockedPiece(8));
			theGrid.put(new Location(7,1), new LockedPiece(2));
			theGrid.put(new Location(7,2), new LockedPiece(3));
			theGrid.put(new Location(7,3), new LockedPiece(9));
			theGrid.put(new Location(7,5), new LockedPiece(4));
			theGrid.put(new Location(7,6), new LockedPiece(6));
			theGrid.put(new Location(8,1), new LockedPiece(7));
			theGrid.put(new Location(8,3), new LockedPiece(6));
		}
		for(int r=0;r<9;r++){
			for(int c=0;c<9;c++){
				if(theGrid.get(new Location(r,c))==null){
					theGrid.put(new Location(r,c), new Piece(0));
				}
			}
		}
	}

}