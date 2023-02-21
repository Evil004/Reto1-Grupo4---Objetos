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

	public void addExtraHour(ExtraHours extraHour) {
		extraHours.add(extraHour);
	}
}
