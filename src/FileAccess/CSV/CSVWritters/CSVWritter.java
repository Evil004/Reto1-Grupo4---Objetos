package FileAccess.CSV.CSVWritters;

import FileAccess.CSV.CSVReaders.CSVReader;
import FileAccess.IReadable;
import FileAccess.IWritteable;
import Util.Utilities;

import java.io.*;
import java.util.ArrayList;

/**
 * @author Pere Prior, Óscar Fernández
 */

public abstract class CSVWritter implements IWritteable {

    /**
     * @author Óscar Fernandez
     * @param data
     */
    void writeFile(ArrayList<ArrayList<String>> data){

        try {
            BufferedWriter streamWritter = new BufferedWriter(new FileWriter(file));

            streamWritter.write(getColumns());

            for (ArrayList<String> line : data) {
                streamWritter.newLine();
                streamWritter.write(Utilities.arrayListToString(line, ";"));
            }

            streamWritter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public CSVWritter(File file){
        this.file = file;
    }

    public CSVWritter(String path){
        file = new File(path);
    }

    abstract String getColumns();
    File file;
}
