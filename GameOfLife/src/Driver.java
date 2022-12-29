import java.io.IOException;
import java.util.Arrays;

public class Driver {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

	
	     // FileReader Contains parameters for the file, the dimension values
		InputFromFile file= new FileReader("Testfile.txt",20,20);
		
		// grid takes in the file object and the Rule  which also takes in the file obj and CellFactory
		Grid grid=new Grid(file,new Rule(file,new CellFactory()));               //new ComputeCellList()));
		
		//Line 16 and 17 are used to see each generation 
		//DisplayEachGen disEachGen=new DisplayEachGen(grid);
		//disEachGen.Show(file.returnGens());

		grid.UpdateByGens();
		
		Display.Show(grid);
		
	}

}
