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
	public Object saveReadedData() {
		ArrayList<ArrayList<String>> departmentsDataString = super.readFile();

		DepartmentsData departmentsData = new DepartmentsData();

		DepartmentsData.setColumns(super.getColumnsNames());
		
		for (ArrayList<String> departmentData : departmentsDataString ) {

			int id = Integer.parseInt(departmentData.get(0));
			String name = departmentData.get(1);

			Department department = new Department(id, name);

			departmentsData.addDepartment(department);
		}

		return departmentsData;
	}


}
