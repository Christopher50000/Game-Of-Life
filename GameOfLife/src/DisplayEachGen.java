import java.util.ArrayList;
import java.util.Iterator;


public class DisplayEachGen {

	private int count;
	private Grid grid;
	private int gens;

	public DisplayEachGen(Grid grid)
	{
		this.grid=grid;
	}
	
	public void Show(int gens)
	{ 
		
		this.gens=gens;
	
		
		// ArrayList<ArrayList<Boolean>> BooleanList= new ArrayList<>();
		 
		// BooleanList=this.grid.ReturnGrid();
		 
		 //System.out.println(BooleanList.get(0));
	
		
	
		boolean [][] BooleanList=grid.ReturnGrid();
		
		while(this.count-1<this.gens)	
		{
		
			 
		 ArrayList<ArrayList<Character>> CharacterList= new ArrayList<>();
		
     
		
		for(int i=0;i<BooleanList.length;i++)
		{
			ArrayList<Character> charlistrow=new ArrayList<>();
			
			for(int j=0;j<BooleanList.length;j++)
			{
				if(BooleanList[i][j])
				{
					charlistrow.add('X');
				}
				else
				{
					charlistrow.add('.');
				}
				//charlist.add(Array[i][j]);
			}
			
			CharacterList.add(charlistrow);
		}

		
	
		
		for(ArrayList<Character> element:CharacterList)
		{
			
			
			System.out.println(element.toString().replace("[", "").replace("]", "").replace(",", ""));
		}
		
		try {
		    Thread.sleep(1500);
			System.out.println("");
			if(this.count<this.gens)
			{
			  System.out.println("");
			  this.grid.NextgenGridTable();
			}
		} catch (InterruptedException e) {
			 //TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println(Array[0][0]);
		this.count++;
		
	
}
	}
}
	

