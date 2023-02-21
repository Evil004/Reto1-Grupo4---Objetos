package FileAccess.CSV.CSVWritters;

import FileAccess.IReadable;
import FileAccess.IWritteable;
import Util.Utilities;

import java.io.*;
import java.util.ArrayList;

/**
 * @author Pere Prior
 */

public abstract class CSVWritter implements IWritteable {

    /*public ArrayList<ArrayList<String>> writeFile(){
        ArrayList<ArrayList<String>> data = new ArrayList<>();

        try {
            BufferedWriter streamWritter = new BufferedWriter(new FileWriter(file));
            streamWritter.newLine();
            String[] dataReaded;

            while (line != null){
                dataReaded = line.split(";");

                ArrayList<String> dataLine = Utilities.arrayToArrayList(dataReaded);

                data.add(dataLine);

                line = streamWritter.readLine();

            }
            streamWritter.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return data;
    }*/

    public CSVWritter(File file){
        this.file = file;
    }

    public CSVWritter(String path){
        file = new File(path);
    }

    File file;
}
