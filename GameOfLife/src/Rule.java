import java.util.ArrayList;

// Rule Class is in charge of determining the new state of the 
// Cell based on the number of neighbors it has
// int neighbors is the total number of neighbors a cell has 
// boolean state is the state of the cell (true being alive and 
// false being dead)
public class Rule implements IRule {
	
	private boolean [][] Array;
	
	private ICell [][] CellList;
	
	private ICellFactory Cellfact;
	
	public Rule(InputFromFile file,ICellFactory Cellfact) // use to have compute cell here 
	{
		this.Array=file.getBoolTable();
		
		this.Cellfact=Cellfact;
		
		this.CellList=new ICell[this.Array.length][this.Array[0].length];
		
	}
	
	
	public boolean GetNextGen(int row,int column)
	{
		// issue with making cells every time 
		
		this.CellList[row][column]=Cellfact.makeCell(this.Array[row][column]);
		//System.out.println(this.CellList[0].length);
		
		int TotalNeighbors=Neighborcount(row,column);
		
		
		this.CellList[row][column].NextGenCell((RuleForCell(TotalNeighbors,this.CellList[row][column].GetState())));
	
		//System.out.println(this.CellList[6][5].GetNextGen());
		
	
		
		return this.CellList[row][column].GetNextGenCell();
		
		
	}
	
	public boolean RuleForCell(int neighbors,boolean state)
	{
		//System.out.println(neighbors);
		
	if((neighbors==2 || neighbors==3) && state==true)
	{
		
		return true;
	}
	
	if((neighbors<2 || neighbors>3)&& state==true)
	{
		return false;
		
		
		//Array[row][column]=this.state;
	}
	
	if(neighbors==3 && state==false)
	{
	
		return true;
		

	}
        return false;
	
	}
	
	
	private int Neighborcount(int row,int column)
	{
		return Living(row-1,column-1)+Living(row+1,column+1) // upper left diagonal and bottom right diagonal of cell 
		+ Living(row-1,column)+Living(row+1,column) 					   // top and bottom neighbor of cell 
		+ Living(row,column-1)+Living(row,column+1)                        // left and right neighbor of cell
		+ Living(row+1,column-1)+Living(row-1,column+1); 
	
			
	}
	
	public int Living(int row,int column)
	{    
		if(row<0 || row>=this.Array.length) {  return 0;}
		if(column<0 || column>=this.Array[0].length) {return 0;}

		return (this.Array[row][column]) ? 1:0;
		
		
	}
	
	
	
	
	
	
	
	
	//Updates the Cell based on the number of neighbors each cell has 
	public void Updatecell(IRule Rule)
	{	
	//	this.Array[this.row][this.column]=Rule.RuleForCell(this.neighbornumber,this.Array[this.row][this.column]);
		System.out.println(this.Array);
	}
	
	
	// Calculates the number of neighbors each cell has 
	// uses method Living 
	/*public void CalculateNeighbors()
	{    
		
		
		this.neighbornumber= Living(this.row-1,this.column-1)+Living(this.row+1,this.column+1) // upper left diagonal and bottom right diagonal of cell 
		+ Living(this.row-1,this.column)+Living(this.row+1,this.column) 					   // top and bottom neighbor of cell 
		+ Living(this.row,this.column-1)+Living(this.row,this.column+1)                        // left and right neighbor of cell
		+ Living(this.row+1,this.column-1)+Living(this.row-1,this.column+1); 				   // bottom left diagonal and upper right diagonal neighbor  from cell 
		
	}*/
	
	
	// method that returns 1 or 0 if the cell is alive or not 
	
	/*public int Living(int row,int column)
	{    
		if(row<0 || row>=this.rows) {  return 0;}
		if(column<0 || column>=this.columns) {return 0;}
	
		return (this.Array[row][column]) ? 1:0;
		
		
	}
	
	

	
	public boolean RuleForCell(int neighbors,boolean state)
	{
		//System.out.println(neighbors);
		
	if((neighbors==2 || neighbors==3) && state==true)
	{
		
		return true;
	}
	
	if((neighbors<2 || neighbors>3)&& state==true)
	{
		return false;
		
		
		//Array[row][column]=this.state;
	}
	
	if(neighbors==3 && state==false)
	{
	
		return true;
		

	}
	
	return false;
	
	}*/
	
}


