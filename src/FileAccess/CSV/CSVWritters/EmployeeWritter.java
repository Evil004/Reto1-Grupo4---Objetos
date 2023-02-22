package FileAccess.CSV.CSVWritters;


import Data.Employees.Employee;
import Data.Employees.EmployeesData;


import java.io.File;
import java.util.ArrayList;

/**
 * @author Óscar Fernandez
 */
public class EmployeeWritter extends CSVWritter {


	public EmployeeWritter(File file) {
		super(file);
	}

	public EmployeeWritter(String path) {
		super(path);
	}

	@Override
	String getColumns() {
		return EmployeesData.getColumns();
	}


	@Override
	public void writeData() {
		ArrayList<ArrayList<String>> employeesData = new ArrayList<>();

		ArrayList<Employee> employees = EmployeesData.getEmployees();

		for (Employee employee: employees) {
			ArrayList<String> employeeData = new ArrayList<>();

			employeeData.add(employee.getDni());
			employeeData.add(employee.getName());
			employeeData.add(employee.getSurname1());
			employeeData.add(employee.getSurname2());
			employeeData.add(employee.getAccount());
			employeeData.add(employee.getSeniority());
			employeeData.add(String.valueOf(employee.getNss()));
			employeeData.add(employee.getGroupProfCat());
			employeeData.add(String.valueOf(employee.getQuoteGroup()));
			employeeData.add(employee.getEmail());
			employeeData.add(String.valueOf(employee.getDepartment()));
			employeeData.add(String.valueOf(employee.getId()));


			employeesData.add(employeeData);
		}

		super.writeFile(employeesData);

	}
}
