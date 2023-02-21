package Data.Departments;

import java.util.ArrayList;
/**
 * autor/es: JonathanTaban
 * This class stores the data of the Departments.
 */
public class DepartmentsData {
    private static ArrayList<Department> departments = new ArrayList<>();

    public DepartmentsData(ArrayList<Department> departments){
        this.departments = departments;
    }

    public DepartmentsData(){
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    /**
     * author: Óscar Fernández
     * @return the departments
     */
    public static ArrayList<Department> getDepartments(){
        return departments;
    }
}
