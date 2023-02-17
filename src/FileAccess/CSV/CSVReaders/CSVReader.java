package FileAccess.CSV.CSVReaders;

import java.io.*;
import java.util.ArrayList;

public abstract class CSVReader {
	File file;

	public CSVReader(File file){
		this.file = file;
	}

	public CSVReader(String path){
		file = new File(path);
	}


	public ArrayList<ArrayList<String>>readFile(){
		ArrayList<ArrayList<String>> employeesData = new ArrayList<>();

		try {
			BufferedReader streamReader = new BufferedReader(new FileReader(file));
			String linea = streamReader.readLine();
			String[] employeeData;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		return datos;
	}
}
