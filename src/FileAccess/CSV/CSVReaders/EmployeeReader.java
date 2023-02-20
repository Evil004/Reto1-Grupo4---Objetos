package FileAccess.CSV.CSVReaders;

import Data.Employees.Employee;
import Data.Employees.EmployeesData;
import Util.Utilities;

import java.io.File;
import java.util.ArrayList;

public class EmployeeReader extends CSVReader {

	public EmployeeReader(File file) {
		super(file);
	}

	public EmployeeReader(String path) {
		super(path);
	}

	/**
	 * Reads the file and returns the data in a ArrayList<ArrayList<String>>
	 * author: Óscar Fernández
	 *
	 * @return ArrayList<ArrayList < String>> with the data
	 * @return
	 */
	@Override
	public Object saveData() {
		ArrayList<ArrayList<String>> employeesDataString = super.readFile();

		EmployeesData employeesData = new EmployeesData();

		for (ArrayList<String> employeeData: employeesDataString) {

			int id = Integer.parseInt(employeeData.get(0));
			String dni = employeeData.get(1);
			String nombre = employeeData.get(2);
			String apellido1 = employeeData.get(3);
			String apellido2 = employeeData.get(4);
			String cuenta = employeeData.get(5);
			int nss = Integer.parseInt(employeeData.get(6));
			String antiguedad = employeeData.get(7);
			String catGrupProfesional = employeeData.get(8);
			int grupCotizacion = Integer.parseInt(employeeData.get(9));
			String email = employeeData.get(10);
			int departamento = Integer.parseInt(employeeData.get(11));


			Employee employee = new Employee(id, dni, nombre, apellido1, apellido2, cuenta, nss, antiguedad, catGrupProfesional, grupCotizacion, email, departamento);

			employeesData.addEmployee(employee);
		}

		return employeesData;
	}
}
