package FinalProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class DataEntry 
{
	private final String key;
	private final String data;
	
	public DataEntry(String key, String data)
	{
		this.key = key;
		this.data = data;
	}
	
	public static List<DataEntry> readDataTable(String filepath) throws Exception
	{
		BufferedReader fileContent = new BufferedReader(new FileReader(new File(filepath)));
		List<DataEntry> dataList = new ArrayList<DataEntry>();
		
		// Reads through whole file
        for (String nextLine = fileContent.readLine(); nextLine != null; nextLine = fileContent.readLine())
        {
        	// Does nothing if a line is empty or just contains "\n"
        	if (nextLine.isEmpty())
        	{
        		;
        	}
        	
        	// If line is a header
        	else
        	{
        		String keyEntry = nextLine.substring(0, nextLine.indexOf(','));
        		dataList.add(new DataEntry(keyEntry, nextLine));
        	}
        }
        	
        fileContent.close();
        return dataList;
	}
	public static void main(String[] args)
	{
		
		System.out.println("Data entry class");
		
		DataEntry sigma = new DataEntry("RIZZLER" ,"KAI CENAT");
		System.out.println(sigma);
	}
}
