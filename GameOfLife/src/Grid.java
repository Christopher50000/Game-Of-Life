import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//The Grid class takes in a boolean array that is read from the file
//and takes a type( an interface ) of a cell factory 


public class Grid  {
	
		// An Array List of ICell is used so we can use methods 
		// for each cell as we iterate through the array list

		
	//	private ArrayList<ArrayList<Thread>>ThreadList = new ArrayList<ArrayList<Thread>>();
		private Thread [][] ThreadList;
		
		
		
		// Grid Array holds the value of the boolean array
		// passed from the file reader
		private boolean [][] GridArray;
		
		private IRule Rule;
		
		private int gens;
		
	    public Grid(InputFromFile File,IRule rule)
	    {
	    	this.GridArray=File.getBoolTable();
	    	
	    	this.gens=File.returnGens();
	    	
	    	Rule=rule;
	    	
	    	ThreadList= new Thread[GridArray.length][GridArray.length];
	    
	    	
	    	
	    	
	    }
	    	
	    //method that creates the threads for each cell 
	    public void NextgenGridTable() throws InterruptedException
	    {		

	    	for(int row=0;row<this.GridArray.length;row++)
	    	{
	    	
	    		
	    		for(int column=0;column<this.GridArray.length;column++)
	    		{
	    		
	    			
	    		
	    			  CellThread t =new CellThread(Rule,row,column);
	    			  t.start();
	    		
	    			  this.ThreadList[row][column]=t;
	    			
	    
	    		}
	    
	    	
	    		
	    		
	    	}
	    	
	    	
	    	
	   
	    	for(int row=0;row<this.GridArray.length;row++)
	    	{
	    	
	    		
	    		for(int column=0;column<this.GridArray.length;column++)
	    		{
	    		//	
	    		
	    			  this.ThreadList[row][column].join();
	    			
	    		
	    		}
	    

	    		
	    		
	    	}
	    
	   
	    	
	    	for(int row=0;row<ThreadList.length;row++)
	    	{
	    	//	ArrayList<Boolean> updatedCellListRow=new ArrayList<Boolean>();
	    		
	    		for(int column=0;column<ThreadList.length;column++)
	    		{	
	    	
		    
	              this.GridArray[row][column]=( (boolean)((CellThread)this.ThreadList[row][column]).ReturnThread());
	    			
		    
		    
	    		}
	    	
	    	}

	    }
	  


	
	    
	    public void UpdateByGens() throws InterruptedException
	    {
	    	
	    	int count=0;
	    	if(this.gens==0)
	    	{
	    		
	    		System.out.println("");
	    	}
	    	
	    	else
	    	{
	    	  while(count<this.gens)
	    	  {
	    		  
	    		  this.NextgenGridTable();
	    		
	    		System.out.println("");
	    		
	    		
	    		
	    		count++;
	    		
	    	  }
	    	
	    	}
	    	
	    }
	    
	    
		
		

		// Method returns boolean array 
		public boolean [][] ReturnGrid()
		{
			
			return this.GridArray;
		}
		
		
		//Method returns char 
		public char ReturnCell(int row,int column)
		{
			return (this.GridArray[row-1][column-1]) ? 'X':'.'; 
			
		}
}
		
		

			
			
		
		
		
	

