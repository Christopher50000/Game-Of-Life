import java.util.ArrayList;

// CellFactory class is in charge of creating cells 
public class CellFactory implements ICellFactory {


    // method returns  a new cell that contains its parameters 
	public ICell makeCell(boolean state) {
		// TODO Auto-generated method stub
			return new Cell(state);
			
	}


	

}
