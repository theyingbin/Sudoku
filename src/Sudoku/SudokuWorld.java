package Sudoku;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class SudokuWorld extends World<Piece>{
	private SudokuGame game;
	public SudokuWorld(){
		super(new BoundedGrid<Piece>(9,9));
		game = new SudokuGame(getGrid());
	}
	public SudokuGame getGame(){
		return game;
	}
	public boolean locationClicked(Location loc){
		if(getGrid().get(loc) instanceof LockedPiece){
			return true;
		}
		try{
			String value = JOptionPane.showInputDialog("Input a number (Enter 0 to remove)", "");
			int x=Integer.parseInt(value);
			if(x==0){
				getGrid().remove(loc);
			}
			else if(x>9 || x<1){
				JOptionPane.showMessageDialog(null, "Number must be between 1 to 9 inclusive");
			}else{
				getGrid().put(loc, new Piece(x));
			}
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, "Please enter a number");
			return true;
		}
		if(getRandomEmptyLocation()==null){
			if(checkRows()&&checkCols()&&checkBoxes()){
				setMessage("Congratulations!");
			}
		}
		return true;
	}
	public boolean checkRows(){
		for(int r=0;r<9;r++){
			int sum=0;
			for(int c=0;c<9;c++){
				Location loc=new Location(r,c);
				Piece x=(Piece)(getGrid().get(loc));
				System.out.println(x);
				sum+=x.getValue();
			}
			if(sum!=45){
				return false;
			}
		}
		return true;
	}
	public boolean checkCols(){
		for(int col=0;col<9;col++){
			int sum=0;
			for(int row=0;row<9;row++){
				Location loc=new Location(row,col);
				Piece x=(Piece)(getGrid().get(loc));
				sum+=x.getValue();
			}
			if(sum!=45){
				return false;
			}
		}
		return true;
	}
	public boolean checkBoxes(){
		int sum1=sumBox(new Location(1,1));
		if(sum1!=45){
			return false;
		}
		int sum2=sumBox(new Location(1,4));
		if(sum2!=45){
			return false;
		}
		int sum3=sumBox(new Location(1,7));
		if(sum3!=45){
			return false;
		}
		int sum4=sumBox(new Location(4,1));
		if(sum4!=45){
			return false;
		}
		int sum5=sumBox(new Location(4,4));
		if(sum5!=45){
			return false;
		}
		int sum6=sumBox(new Location(4,7));
		if(sum6!=45){
			return false;
		}
		int sum7=sumBox(new Location(7,1));
		if(sum7!=45){
			return false;
		}
		int sum8=sumBox(new Location(7,4));
		if(sum8!=45){
			return false;
		}
		int sum9=sumBox(new Location(7,7));
		if(sum9!=45){
			return false;
		}
		return true;
	}
	public int sumBox(Location loc){
		ArrayList<Piece> array1=(ArrayList<Piece>)(getGrid().getNeighbors(loc));
		array1.add((Piece)(getGrid().get(loc)));
		int sum=0;
		for(Piece x: array1){
			sum+=x.getValue();
		}
		return sum;
	}
}
