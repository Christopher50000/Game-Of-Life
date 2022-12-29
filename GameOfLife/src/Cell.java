
public class Cell implements ICell {
	
	private boolean currState;
	private boolean nextgenState;
	  
	  

	
	
	 //Cell takes in its position( row and column as well as the boolean Array 
	 // So that we can get the neighbors of the cells 																									// Dont pay attention to 
	                                                                             /// add grid to constructor get rid of an array  have methods from grid , neighbor counter , rule , determine , update , determine uses the rule
	public Cell(boolean state)                         //int row,int column,boolean state,boolean [][] Array)
	{													                           //boolean[][] Array
	
		this.currState=state;
		
		
		
	
		
	}
	
	public boolean GetState()
	{
		return this.currState;
	}
	
	// gets the state of the cell based on position 
	
	public void NextGenCell(boolean newstate)
	{
		this.nextgenState=newstate;
	}
	
	public boolean GetNextGenCell()
	{
		return this.nextgenState;
	}
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	

}
