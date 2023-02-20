package Data.ExtraHours;

import java.io.File;
import java.util.ArrayList;
import static Util.Utilities.*;

/**
 * @author Pere Prior
 */

public class ExtraHoursData {

    private static void cargarHorasExtra(File file) {
        ArrayList<ArrayList<String>> ExtraHourData = readCsv(file.getPath());

        for (int i = 1; i < ExtraHourData.size(); i++) {
            ArrayList<String> ExtraHoursData = ExtraHourData.get(i);
            String nif = ExtraHoursData.get(getIndex(ExtraHourData, "NIF"));
            String fecha = ExtraHoursData.get(getIndex(ExtraHourData, "Fecha"));
            int hora_i = Integer.parseInt(ExtraHoursData.get(getIndex(ExtraHourData, "hora_inicio")));
            int hora_f = Integer.parseInt(ExtraHoursData.get(getIndex(ExtraHourData, "hora_fin")));
            int sitio = Integer.parseInt(ExtraHoursData.get(getIndex(ExtraHourData, "Sitio")));
            extraHours.add(new ExtraHours(nif, fecha, hora_i, hora_f, sitio));
        }
    }

    public static ArrayList<ExtraHours> getExtraHours() {
        return extraHours;
    }

    private static ArrayList<ExtraHours> extraHours = new ArrayList<>();
}
