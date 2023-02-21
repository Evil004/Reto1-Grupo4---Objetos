package FileAccess.CSV.CSVReaders;

import Data.Departments.Department;
import Data.Departments.DepartmentsData;

import java.io.File;
import java.util.ArrayList;

public class DepartmentReader extends CSVReader {

	public DepartmentReader(String path) {
		super(path);
	}

	public DepartmentReader(File file) {
		super(file);
	}

	@Override
	public Object saveData() {
		ArrayList<ArrayList<String>> departmentsDataString = super.readFile();

		DepartmentsData departmentsData = new DepartmentsData();
		
		for (ArrayList<String> departmentData : departmentsDataString ) {

			int id = Integer.parseInt(departmentData.get(0));
			String nombre = departmentData.get(1);

			Department department = new Department(id, nombre);

			departmentsData.addDepartment(department);
		}

		return departmentsData;
	}


}
