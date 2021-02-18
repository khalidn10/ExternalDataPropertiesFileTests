package external_test_data_file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWriteExternalData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// Create Properties object
		Properties data = new Properties();
		
		// Create FileInputStream object
		FileInputStream inputFile = new FileInputStream("C:\\Users\\Khalid\\eclipse-workspace\\Section 21\\src\\data.properties");
		
		// Load data.properties file into Properties object
		data.load(inputFile);
		
		// Print 2 variables from data.properties file
		System.out.println("Browser Value: " + data.getProperty("browser"));
		System.out.println("URL Value: " + data.getProperty("url"));
		
		// Set both variables to different values
		data.setProperty("browser", "firefox");
		data.setProperty("url", "https://www.bbc.co.uk/");
		
		// Create FileOutputStream object
		FileOutputStream outputFile = new FileOutputStream("C:\\Users\\Khalid\\eclipse-workspace\\Section 21\\src\\data.properties");
		
		// Write new data values to data.properties file
		data.store(outputFile, null);
	}

}
