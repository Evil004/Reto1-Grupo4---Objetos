package FileAccess.CSV.CSVReaders;

import Data.ExtraHours.ExtraHours;
import Data.ExtraHours.ExtraHoursData;

import java.io.File;
import java.util.ArrayList;

public class ExtraHoursReader extends CSVReader {

	public ExtraHoursReader(String path) {
		super(path);
	}

	public ExtraHoursReader(File file) {
		super(file);
	}

	@Override
	public Object saveReadedData() {
		ArrayList<ArrayList<String>> extraHoursDataString = super.readFile();

		ExtraHoursData extraHoursData = new ExtraHoursData();

		ExtraHoursData.setColumns(super.getColumnsNames());

		for (ArrayList<String> extraHourData : extraHoursDataString) {

			String nif = extraHourData.get(0);
			String date = extraHourData.get(1);
			int startHour = Integer.parseInt(extraHourData.get(2));
			int endHour = Integer.parseInt(extraHourData.get(3));
			int place = Integer.parseInt(extraHourData.get(4));

			ExtraHours extraHour = new ExtraHours(nif, date, startHour, endHour, place);

			extraHoursData.addExtraHour(extraHour);
		}

		return extraHoursData;
	}
}
