package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid
{
	private int row = 20;
	private int column = 12;
	
	@Override
	public String processCommand(String command)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getRows()
	{
		
		return this.row;
	}

	@Override
	public int getCols()
	{
		// TODO Auto-generated method stub
		return this.column;
	}

	@Override
	public Cell getCell(Location loc)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getGridText()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
