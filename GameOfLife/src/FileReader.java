import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

// The File Reader Class is in charge of reading from the file and returning a 
// 2D boolean array 

public class FileReader implements InputFromFile {
	
	private Scanner fileobj;
	private boolean [][] boolArray;
	//private ArrayList<ArrayList<Boolean>> = new ArrayList<ArrayList<Boolean>>()
	private char [][] arr;
	
	private int gens;


	

	public FileReader(String file,int rows,int columns ) throws IOException
	{
		try {
			fileobj=new Scanner(new File(file));
			
			Path filepath=Paths.get(file);
			
			String content=Files.readString(filepath);
			
			System.out.println(content);
			this.boolArray=new boolean[rows][columns];
		
		//	this.DeadCell=DeadCell;
			
			int linecount=0;
			
			while(fileobj.hasNextLine())
			{
				String line = fileobj.nextLine();
		
				
				
				for(int i=0;i<line.length();i++)
				{
				
					
				
					this.boolArray[linecount][i]=line.charAt(i)=='X';
				}
				
			    if (fileobj.hasNextInt())
					this.gens= fileobj.nextInt();
			  
			 
				linecount++;
			}
			this.fileobj.close();
			
			
		} 
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("The file was not found ");
			e.printStackTrace();
		}
	}
	
	

	public boolean [][] getBoolTable()
	{
		return this.boolArray;
	}
	
	public int returnGens()
	{
		return this.gens;
	}
}
		
			
	
	
	
	
	
	


