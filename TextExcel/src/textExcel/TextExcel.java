package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;

// Update this file with your own code.

public class TextExcel
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Spreadsheet excel = new Spreadsheet();
		String nextInput = input.next();
		while(!nextInput.equals("quit")){
			excel.processCommand(nextInput);
			nextInput = input.next();
		}
	}
}
