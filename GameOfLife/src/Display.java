import java.util.ArrayList;
import java.util.Iterator;


// Display is simply used for displaying the 2D char Array 
public class Display {

	//private Grid grid;
	
	//private boolean [][] boolArray;
	
	
	public static void Show(Grid grid)
	{
		boolean [][] boolArray;
		boolArray=grid.ReturnGrid();
		
		 ArrayList<ArrayList<Character>> List= new ArrayList<>();
		
		for(int i=0;i<boolArray.length;i++)
		{
			ArrayList<Character> charlist=new ArrayList<>();
			for(int j=0;j<boolArray.length;j++)
			{
				if(boolArray[i][j]==true)
				{
					charlist.add('X');
				}
				else
				{
					charlist.add('.');
				}
			}
			List.add(charlist);
		}
		
		
		for(ArrayList<Character> element:List)
		{
			System.out.println(element.toString().replace("[", "").replace("]", "").replace(",", ""));
		}
			
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//private Gridgen grid;
	//private int gens;
	//private int count;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//public Display(Gridgen grid,int gens) // maybe use grid ?
										   // take in a boolean table 
										   // 
	                                       // take each cell and each cell will have a counter 		//this.grid=grid;
		//this.gens=gens;
		
		//this.count=0;
		//this.Array=grid.ReturnGrid();
		
	
	
		/*this.Array=Array;
		
		for(int i=0;i<Array.length;i++)
		{
			ArrayList<Character> charlist=new ArrayList<>();
			
			for(int j=0;j<Array[0].length;j++)
			{
				if(Array[i][j]==true)
				{
					charlist.add('X');
				}
				else
				{
					charlist.add('O');
				}
				//charlist.add(Array[i][j]);
			}
			
			this.List.add(charlist);
		}*/
		
		//Iterator iter=List.iterator();
		
		//Show();
		
	
	

	/*public void Show()
	{
		
		
		while(this.count-1<this.gens)
		{
		 ArrayList<ArrayList<Character>> List= new ArrayList<>();
		
        this.Array=this.grid.ReturnGrid();
		
		for(int i=0;i<Array.length;i++)
		{
			ArrayList<Character> charlist=new ArrayList<>();
			
			for(int j=0;j<Array[0].length;j++)
			{
				if(Array[i][j]==true)
				{
					charlist.add('X');
				}
				else
				{
					charlist.add('.');
				}
				//charlist.add(Array[i][j]);
			}
			
			List.add(charlist);
		}
		//Iterator<ArrayList<Character>> iter=List.iterator();
		
		/*while(iter.hasNext())
		{
			System.out.println(iter.next() );
		}*/
		
		/*for(ArrayList<Character> element:List)
		{
			
			
			System.out.println(element.toString().replace("[", "").replace("]", "").replace(",", ""));
		}*/
		
		//try {
		  //  Thread.sleep(1500);
			//System.out.println("");
			//if(this.count<this.gens)
			//{
			 // System.out.println("");
			  //grid.Onegeneration();
			//}
		//} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}
		
		//System.out.println(Array[0][0]);
		//this.count++;
		
	
}
	
	
	/*
	ArrayList<ArrayList<Boolean>> List;
	public Display(ArrayList<ArrayList<Boolean>> List)
	{
		this.List=List;
		List.get(0);
	}
	public void  Show()
	
	{
	
		//System.out.println(List.get(0));
        Iterator<ArrayList<Boolean>> iter=this.List.iterator();
		
		while(iter.hasNext())
		{  
			System.out.println(iter.next() );
		}
	}*/

