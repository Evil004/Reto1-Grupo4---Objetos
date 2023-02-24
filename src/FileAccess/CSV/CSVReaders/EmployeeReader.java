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
	public Object saveReadedData() {
		ArrayList<ArrayList<String>> employeesDataString = super.readFile();

		EmployeesData employeesData = new EmployeesData();

		EmployeesData.setColumns(super.getColumnsNames());

		for (ArrayList<String> employeeData: employeesDataString) {

			String dni = employeeData.get(0);
			String name = employeeData.get(1);
			String surname1 = employeeData.get(2);
			String surname2 = employeeData.get(3);
			String acount = employeeData.get(4);
			String seniority = employeeData.get(5);

			int nss;
			if (employeeData.get(6) == ""){
				nss = 0;
			} else {
				nss = Integer.parseInt(employeeData.get(6));
			}
			String groupProfCat = employeeData.get(7);
			int quoteGroup = Integer.parseInt(employeeData.get(8));
			String email = employeeData.get(9);
			int department = Integer.parseInt(employeeData.get(10));
			int id;
			if (employeeData.get(11) == ""){
				id = EmployeesData.getLastId() + 1;
			} else {
				id = Integer.parseInt(employeeData.get(11));
			}


			Employee employee = new Employee(id, dni, name, surname1, surname2, acount, nss, seniority, groupProfCat, quoteGroup, email, department);

			employeesData.addEmployee(employee);
		}

		return employeesData;
	}
}
