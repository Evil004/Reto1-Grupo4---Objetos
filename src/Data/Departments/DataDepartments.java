package Data.Departments;

import java.io.File;
import java.util.ArrayList;

public class DataDepartments {
    private static ArrayList<Departments> departments = new ArrayList<>();
    private static int getIndex(ArrayList<ArrayList<String>> dataDepartment, String id) {
        return 0;
    }

    private static ArrayList<ArrayList<String>> readCsv(String path) {
        return null;
    }

    private static void chargeDepartments(File file) {
        ArrayList<ArrayList<String>> dataDepartment = readCsv(file.getPath());

        for (int i = 1; i < dataDepartment.size(); i++) {
            ArrayList<String> datosDepartamento = dataDepartment.get(i);

            int id = Integer.parseInt(datosDepartamento.get(getIndex(dataDepartment, "id")));
            String nombre = datosDepartamento.get(getIndex(dataDepartment, "name"));

            Departments.add(new Departments(id, nombre));
        }
    }
}
