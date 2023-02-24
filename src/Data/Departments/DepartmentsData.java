package Data.Departments;

import Data.Employees.Employee;

import java.util.ArrayList;
import java.util.Objects;

/**
 * autor/es: JonathanTaban
 * This class stores the data of the Departments.
 */
public class DepartmentsData {
    private static ArrayList<Department> departments = new ArrayList<>();
    private static String columns;

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

    public static String getColumns() {
    	return columns;
    }

    public static void setColumns(String columns) {
    	DepartmentsData.columns = columns;
    }

    public static Department getByID(int id){
            for (Department department : departments) {
                if (department.getId() == id) {
                    return department;
                }

            }
            return null;
    }
}
