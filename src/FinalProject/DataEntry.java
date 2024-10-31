package FinalProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class DataEntry 
{
	final private String Data;
	
	public DataEntry(String Data)
	{
		this.Data = Data;
	}
	
	public static List<DataEntry> readFastaFile(String filepath) throws Exception
	{
		BufferedReader fileContent = new BufferedReader(new FileReader(new File(filepath)));
		List<DataEntry> DataList = new ArrayList<DataEntry>();
		
		// StringBuffers used to avoid creating a bunch of string objects
		StringBuffer tempHeader = new StringBuffer();
		StringBuffer tempSeq = new StringBuffer();
		
		// Reads through whole file
        for (String nextLine = fileContent.readLine(); nextLine != null; nextLine = fileContent.readLine())
        {
        	// Does nothing if a line is empty or just contains "\n"
        	if (nextLine.isEmpty())
        	{
        		;
        	}
        	
        	// If line is a header
        	else if (nextLine.charAt(0) == '>')
        	{
        		DataList.add(new DataEntry(tempHeader.toString().substring(1), tempSeq.toString));
        		tempHeader.setLength(0);
        		tempSeq.setLength(0);
        		tempHeader.append(nextLine);
        	}
        	
        	// If line is a part of the coding sequence
        	else
        	{
        		tempSeq.append(nextLine.replace("\n", ""));
        	}
        }
        FSList.add(new FastaSequence(tempHeader.toString(), tempSeq.toString()));  // Adds the last entry since it's missed by the loop
        fileContent.close();
        return FSList;
	}
	public static void main(String[] args)
	{
		
		System.out.println("Data entry class");
	}
}
