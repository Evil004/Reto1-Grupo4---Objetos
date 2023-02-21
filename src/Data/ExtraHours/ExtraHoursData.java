package Data.ExtraHours;

import java.io.File;
import java.util.ArrayList;
import static Util.Utilities.*;

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
