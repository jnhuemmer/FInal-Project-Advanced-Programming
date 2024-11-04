package FinalProject;

import java.util.ArrayList;
import java.util.List;

public class FinalProjectMain 
{
	public static void main (String [] args) throws Exception
	{
		String microbiomeFilePath = "C:\\Users\\Jacob\\Desktop\\Wormhole\\Fall_2024\\AdvancedProgramming\\FinalProject\\TableS8_T2T_KrakenUniq_BIO_Fullset.csv";
		String metadataFilePath = "C:\\Users\\Jacob\\Desktop\\Wormhole\\Fall_2024\\AdvancedProgramming\\FinalProject\\TableS9_metadata_KrakenUniq_BIO_Fullset.csv";

		
		
		List<DataEntry> test = DataEntry.readDataTable(metadataFilePath);
		System.out.println(test);
		
	}
}

