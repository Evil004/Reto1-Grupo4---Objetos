package Data.Departments;

import java.io.File;
import java.util.ArrayList;
/**
 * autor/es: JonathanTaban
 * This class stores the data of the Departments.
 */
public class DepartmentsData {
    private static ArrayList<Departments> departments = new ArrayList<>();

    public DepartmentsData(ArrayList<Departments> departments){
        this.departments = departments;
    }

    public DepartmentsData(){
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Departments department) {
        departments.add(department);
    }
}
