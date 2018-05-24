import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.opencsv.CSVReader;

public class openCSV {

    public static void main(String[] args)  {
        
    	CSVReader csvReader;

    	if(args.length == 1) {
    		try {
        		System.out.println("Inputted Path: \"" + args[0] + "\"");
        		Reader reader = Files.newBufferedReader(Paths.get(args[0]));
                csvReader = new CSVReader(reader);
                
                String[] nextRecord;
    			while ((nextRecord = csvReader.readNext()) != null) {
                    System.out.println("Name : " + nextRecord[0]);
                    System.out.println("Email : " + nextRecord[1]);
                    System.out.println("Phone : " + nextRecord[2]);
                    System.out.println("Country : " + nextRecord[3]);
    			}

    		} catch(IOException e) {
        		System.out.println("Could not open file.");
        		return;
        	}
    		
    		
    	} else {
    		System.out.println("This program expects one argument.");
    	}
 
    }
}
