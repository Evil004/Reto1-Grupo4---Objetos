package FileAccess.CSV.CSVWritters;

import Data.ExtraHours.ExtraHours;
import Data.ExtraHours.ExtraHoursData;

import java.io.File;
import java.util.ArrayList;

/**
 * @author Oscar Fernandez
 */
public class ExtraHoursWritter extends CSVWritter{

    public ExtraHoursWritter(File file) {
        super(file);
    }

    public ExtraHoursWritter(String path){
        super(path);
    }
    @Override
    String getColumns() {
        return ExtraHoursData.getColumns();
    }

    @Override
    public void writeData() {
        ArrayList<ArrayList<String>> extraHoursData = new ArrayList<>();

        ArrayList<ExtraHours> extraHours = ExtraHoursData.getExtraHours();

        for (ExtraHours extraHour: extraHours) {
            ArrayList<String> extraHourData = new ArrayList<>();

            extraHourData.add(extraHour.getNif());
            extraHourData.add(extraHour.getDate());
            extraHourData.add(String.valueOf(extraHour.getStartTime()));
            extraHourData.add(String.valueOf(extraHour.getEndTime()));
            extraHourData.add(String.valueOf(extraHour.getPlace()));

            extraHoursData.add(extraHourData);
        }
        super.writeFile(extraHoursData);
    }



}
