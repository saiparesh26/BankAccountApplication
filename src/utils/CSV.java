package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {
	
	// This method will read data from csv file
	public static List<String[]> read(String file) {
		List<String[]> data = new LinkedList<>();
		String dataRow;
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			
			while(( dataRow = br.readLine()) != null){				
				String[] contents = dataRow.split(",");
				data.add(contents);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Could not find file");
		} catch (IOException e) {
			System.out.println("Could not read file");
		}
		return data;
	}
}
