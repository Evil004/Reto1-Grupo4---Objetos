package FileAccess.CSV.CSVWritters;

import Data.Departments.Department;
import Data.Departments.DepartmentsData;
import java.io.File;
import java.util.ArrayList;

/**
 * @author Pere Prior
 */

public class DepartmentWritter extends CSVWritter{

    public DepartmentWritter(File file) {
        super(file);
    }

    public DepartmentWritter(String path){
        super(path);
    }

    @Override
    String getColumns() {
        return DepartmentsData.getColumns();
    }

    /**
     * Takes the data from the departments and writes them to the CSV file
     */
    @Override
    public void writeData() {

        ArrayList<ArrayList<String>> departmentsData = new ArrayList<>();

        ArrayList<Department> department = DepartmentsData.getDepartments();

        for (Department departments: department) {
            ArrayList<String> departmentData = new ArrayList<>();

            departmentData.add(String.valueOf(departments.getId()));
            departmentData.add(departments.getName());

            departmentsData.add(departmentData);
        }

        super.writeFile(departmentsData);

    }
}
