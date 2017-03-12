import java.util.ArrayList;

public class SameList {
	final static int MAX_CELL_NUM = 3;
	public static void main(String args[]) {
		Cell cell1 = new Cell(1, 1, "HYQ");
		Cell cell2 = new Cell(1, 2, "ZTE");
		Cell cell3 = new Cell(2, 3, "LTE");
		Cell cell4 = new Cell(3, 3, "RRU");
		Cell cell5 = new Cell(1, 1, "HYQ");
		Cell cell6 = new Cell(2, 3, "ZTE");
		Cell[] cellOne = {cell1, cell2, cell3};
		Cell[] celltwo = {cell4, cell5, cell6};
		
		System.out.println(getSamePart(cellOne, celltwo).toString());
	}
	
	static Cell[] getSamePart(Cell[] cellListOne, Cell[] cellListTwo) {
		Cell[] sameCell = new Cell[MAX_CELL_NUM]; 
		for (int i = 0;i < cellListOne.length && i < MAX_CELL_NUM;i++) {
			for (int j = 0;j < cellListTwo.length && j < MAX_CELL_NUM;j++) {
				if(cellListOne[i].cellId == cellListTwo[j].cellId 
					&& cellListOne[i].enbId == cellListTwo[j].enbId) {
					sameCell[i] = cellListOne[i];
				}
			}
		}
		return sameCell;
	}
	
	class Cell {
		private int enbId;
		private int cellId;
		private String name;
		
		Cell(int enbId, int cellId, String name) {
			this.enbId = enbId;
			this.cellId = cellId;
			this.name = name;
		}
	}
}
