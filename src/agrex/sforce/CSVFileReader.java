package agrex.sforce;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import au.com.bytecode.opencsv.CSVReader;

public class CSVFileReader {
    public static void main(String[] args) {

        try {
            String csvFilename = "D:/Download/Test.csv";
            CSVReader csvReader = new CSVReader(new FileReader(csvFilename));
            String[] col = null;
            List<Map<String, String>> lstMapCSV = new ArrayList<Map<String, String>>();
            Map<String, String> map = new HashMap<String, String>();
                while ((col=csvReader.readNext()) != null) 
                {
                	
                	for(int i=0;i<col.length;i++){
                		map.put(col[i], col[i]);
                	}
       
                	lstMapCSV.add(map);
                	
                }
            for (int i = 0 ; i < lstMapCSV.size() ; i++) {
            	Map<String, String> myMap = lstMapCSV.get(i);
              
            }
            
            csvReader.close();
        }
        catch(ArrayIndexOutOfBoundsException ae)
        {
            System.out.println(ae+" : error here");
        }catch (FileNotFoundException e) 
        {
            System.out.println("asd");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("");
            e.printStackTrace();
        }
    }
}