
public class CellThread extends Thread{
	
	private int row;
	private int column;
	private IRule Rule;
	private boolean Bool;
	public CellThread(IRule Rule,int r,int c)
	{
			super();
			this.row=r;
			this.column=c;
			this.Rule=Rule;
			
	}
	
	public void run()
	{
		
		this.Bool=Rule.GetNextGen(row, column);
		
	}
	
	public boolean ReturnThread()
	{
		return this.Bool;
	}


}
