package Data.Employees;
import Data.Departments.Department;
import Data.Departments.DepartmentsData;
import Util.Utilities;
import java.util.ArrayList;

/**
 * @author Jose Vicente
 * Class to do actions about employees as consult, removes or add
 */
public class EmployeeQuery {
    /**
     * Method to get a list of employees by his quotegroup
     * @param category
     * @return Employee
     */
    public static void employeeByCategory(String category){
        ArrayList<Employee> employees = EmployeesData.getEmployees();
        for (Employee employee: employees) {
            if (employee.getGroupProfCat().equals(category)) {
                System.out.println(employee);;

            }
        }
    }

    /**
     * Methot to get data about employee by his DNI
     * @param dni
     */
    public static void employeeByDNI(String dni) {
        ArrayList<Employee> employees = EmployeesData.getEmployees();


            for (Employee employee: employees) {
                if (employee.getDni().equals(dni)) {
                    System.out.println(employee);
                    return;
                }
            }
            System.out.println("There is no employee with that DNI");

    }

    /**
     * Method to obtain employee data by his ID
     * @param ID
     * @return Employee
     */
    public static Employee employeeByID(int ID) {
        ArrayList<Employee> employees = EmployeesData.getEmployees();

            for (Employee employee: employees) {
                if (employee.getId() == ID) {
                    System.out.println(employee);
                    return employee;
                }
            }
            System.out.println("There is no employee with that ID.");

        return null;
    }

    /**
     * Method to  obtain a list of employees by his department
     * @param idDep
     */
   public static void employeesByDepartment(int idDep) {
        ArrayList<Employee> employees = EmployeesData.getEmployees();
        ArrayList<Department> departments = DepartmentsData.getDepartments();


            boolean flag = false;
            for (Employee employee: employees) {
                if (employee.getDepartment() == idDep) {
                    for (Department department: departments) {
                        if (department.getId() == idDep) {
                            flag = true;
                            System.out.printf("ID: %-12s Employee: %-12s Department: %-12s \n", employee.getId(), employee.getName(), departments.get(departments.indexOf(department)).getName());
                        }
                    }

                }
            }
            if (flag) {
                return;
            }
            System.out.println("There is no department with that ID");
        }

    /**
     * Method to add employee to arraylist
     */
    public static void incorporeEmployee() {
        ArrayList<Employee> employees = EmployeesData.getEmployees();
        Employee employee = createEmployee();
        EmployeesData.addEmployee(employee);
        System.out.println("A new employee has been created");
    }

    /**
     * Method to create a new employee
     * @return Employee
     */
    private static Employee createEmployee() {
        ArrayList<Employee> employees = EmployeesData.getEmployees();

        int id = employees.get(employees.size() - 1).getId() + 1;
        String dni = Utilities.readLine("Enter the employee's DNI: ");
        String nombre = Utilities.readLine("Enter the employee's name: ");
        String apellido1 = Utilities.readLine("Enter the employee's first surname: ");
        String apellido2 = Utilities.readLine("Enter the employee's second surname: ");
        String cuenta = Utilities.readLine("Enter the employee's account: ");
        int nss = Utilities.readNumber("Enter the employee's social security name: ");
        String antiguedad = Utilities.readLine("Enter the employee's seniority: ");
        String catGrupProfesional = Utilities.readLine("Enter the employee's profesional group: ");
        int grupCotizacion = Utilities.readNumber("Enter the employee's quote group: ");
        int departamento = Utilities.readNumber("Enter the employee's department: ");
        String email = Utilities.readLine("Enter the employee's email: ");


        return new Employee(id, dni, nombre, apellido1, apellido2, cuenta, nss, antiguedad, catGrupProfesional, grupCotizacion, email, departamento);
    }

    /**
     * Method to modify an existent exployee personal data.
     * @param id
     * {@link #createEmployee()}
     */
    public static void modifyPersonalData(int id) {
        ArrayList<Employee> employees = EmployeesData.getEmployees();


            Employee employeeToModify = EmployeesData.getEmployeeByID(id);

            Employee auxEmployee = createEmployee();

            employeeToModify.setDni(auxEmployee.getDni());
            employeeToModify.setName(auxEmployee.getName());
            employeeToModify.setSurname1(auxEmployee.getSurname1());
            employeeToModify.setSurname2(auxEmployee.getSurname2());
            employeeToModify.setAccount(auxEmployee.getAccount());
            employeeToModify.setNss(auxEmployee.getNss());
            employeeToModify.setSeniority(auxEmployee.getSeniority());
            employeeToModify.setGroupProfCat(auxEmployee.getGroupProfCat());
            employeeToModify.setQuoteGroup(auxEmployee.getQuoteGroup());
            employeeToModify.setEmail(auxEmployee.getEmail());
            employeeToModify.setDepartment(auxEmployee.getDepartment());


    }

    /**
     * Method to delete an employee by his ID.
     * @param id
     */
    public static void deleteEmployeeData(int id) {
        Employee employee = EmployeesData.getEmployeeByID(id);

        if (employee != null) {
            System.out.println("You are going to delete the employee " + employee.getName());
            String decision = Utilities.readLine("Do you want to continue? (yes/no)");

            if (decision.equals("yes")) {
                EmployeesData.removeEmployee(employee);
                System.out.println("Employee has been deleted");
            } else if (decision.equals("no")) {
                System.out.println("Deletion canceled");
            } else {
                System.out.println("Enter a valid answer");
            }
        } else {
            System.out.println("No employee found with id " + id);
        }
    }

}
