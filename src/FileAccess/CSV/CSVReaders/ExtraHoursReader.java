package FileAccess.CSV.CSVReaders;

import Data.ExtraHours.ExtraHours;

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
	public Object saveData() {
		ArrayList<ArrayList<String>> extraHoursDataString = super.readFile();

		ExtraHoursData extraHoursData = new ExtraHoursData();

		for (ArrayList<String> extraHourData : extraHoursDataString) {

			int id = Integer.parseInt(extraHourData.get(0));
			int idEmpleado = Integer.parseInt(extraHourData.get(1));
			String fecha = extraHourData.get(2);
			int horas = Integer.parseInt(extraHourData.get(3));

			ExtraHours extraHour = new ExtraHours(id, idEmpleado, fecha, horas);

			extraHoursData.addExtraHour(extraHour);
		}

		return extraHoursData;
	}
}
