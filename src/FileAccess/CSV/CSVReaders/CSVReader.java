package FileAccess.CSV.CSVReaders;

import FileAccess.IReadable;
import Util.Utilities;

import java.io.*;
import java.util.ArrayList;

public abstract class CSVReader implements IReadable {
	File file;

	public CSVReader(File file){
		this.file = file;
	}

	public CSVReader(String path){
		file = new File(path);
	}


	/**
	 * Reads the file and returns the data in a ArrayList<ArrayList<String>>
	 * author: Óscar Fernández
	 * @return ArrayList<ArrayList<String>> with the data
	 *
	 */
	public ArrayList<ArrayList<String>> readFile(){
		ArrayList<ArrayList<String>> data = new ArrayList<>();

		try {
			BufferedReader streamReader = new BufferedReader(new FileReader(file));
			streamReader.readLine();
			String line = streamReader.readLine();
			String[] dataReaded;

			while (line != null){
				dataReaded = line.split(";");

				ArrayList<String> dataLine = Utilities.arrayToArrayList(dataReaded);

				data.add(dataLine);

				line = streamReader.readLine();

			}
			streamReader.close();


		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		return data;
	}

	/**
	 * Reads the file and returns the data in a ArrayList<ArrayList<String>>
	 *     author: Óscar Fernández
	 *     @return ArrayList<ArrayList<String>> with the data
	 *
	 */
	public String getColumnsNames(){
		String columnsNames;
		try {
			BufferedReader streamReader = new BufferedReader(new FileReader(file));
			String line = streamReader.readLine();
			columnsNames = line;
			streamReader.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return columnsNames;
	}

	/**
	 * Reads the file and returns the data in a ArrayList<ArrayList<String>>
	 *     author: Óscar Fernández
	 */
	public String[] getColumnsNamesArray(){
		String[] columnsNames;
		try {
			BufferedReader streamReader = new BufferedReader(new FileReader(file));
			String line = streamReader.readLine();
			columnsNames = line.split(";");
			streamReader.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return columnsNames;
	}
}
