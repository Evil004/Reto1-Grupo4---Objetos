package Data.ExtraHours;

import java.util.ArrayList;

/**
 * @author Pere Prior
 */

public class ExtraHoursData {

    public static ArrayList<ExtraHours> getExtraHours() {
        return extraHours;
    }

    private static ArrayList<ExtraHours> extraHours = new ArrayList<>();

	private static String columns;

	public void addExtraHour(ExtraHours extraHour) {
		extraHours.add(extraHour);
	}

	public static String getColumns() {
		return columns;
	}

	public static void setColumns(String columns) {
		ExtraHoursData.columns = columns;
	}

}
