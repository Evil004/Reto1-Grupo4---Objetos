
import Data.Departments.DepartmentsData;
import Data.Employees.EmployeesData;
import Data.ExtraHours.ExtraHoursData;
import Data.QuoteGroup.QuoteGroupsData;
import FileAccess.CSV.CSVReaders.DepartmentReader;
import FileAccess.CSV.CSVReaders.EmployeeReader;
import FileAccess.CSV.CSVReaders.ExtraHoursReader;
import FileAccess.CSV.CSVReaders.QuoteGroupReader;
import Menus.MainMenu;
import Settings.Settings;

import java.io.File;

public class Main {

	public static void main(String[] args) {

		ReadFiles();
		MainMenu.menu();
	}

	private static void ReadFiles() {
		File csvFolder = new File(Settings.csvFolder);
		EmployeesData employees = null;
		DepartmentsData departments = null;
		ExtraHoursData extraHours = null;
		QuoteGroupsData quoteGroups = null;

		if (csvFolder.listFiles() == null) {
			System.out.println("The folder does not contain any files.");
			return;
		}
		for (File file: csvFolder.listFiles()) {

			if (file.getName().equals(Settings.csvEmployees)) {
				System.out.println("Found employees file");
				EmployeeReader employeeReader = new EmployeeReader(file);
				employees = (EmployeesData) employeeReader.saveReadedData();
			}

			if (file.getName().equals(Settings.csvDepartments)) {
				System.out.println("Found departments file");
				DepartmentReader departmentReader = new DepartmentReader(file);
				departments = (DepartmentsData) departmentReader.saveReadedData();
			}
			if (file.getName().equals(Settings.csvExtraHours)) {
				System.out.println("Found extra hours file");
				ExtraHoursReader extraHoursReader = new ExtraHoursReader(file);
				extraHours = (ExtraHoursData) extraHoursReader.saveReadedData();
			}
			if (file.getName().equals(Settings.csvQuoteGroups)) {
				System.out.println("Found quote groups file");
				QuoteGroupReader quoteGroupReader = new QuoteGroupReader(file);
				QuoteGroupsData quoteGroupsData = (QuoteGroupsData) quoteGroupReader.saveReadedData();
			}

		}
	}
}
