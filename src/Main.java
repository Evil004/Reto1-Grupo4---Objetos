
import Data.Departments.Department;
import Data.Departments.DepartmentsData;
import Data.Employees.Employee;
import Data.Employees.EmployeeQuery;
import Data.Employees.EmployeesData;
import Data.ExtraHours.ExtraHours;
import Data.ExtraHours.ExtraHoursData;
import Data.QuoteGroup.QuoteGroup;
import Data.QuoteGroup.QuoteGroupsData;
import FileAccess.CSV.CSVReaders.DepartmentReader;
import FileAccess.CSV.CSVReaders.EmployeeReader;
import FileAccess.CSV.CSVReaders.ExtraHoursReader;
import FileAccess.CSV.CSVReaders.QuoteGroupReader;
import FileAccess.CSV.CSVWritters.DepartmentWritter;
import FileAccess.CSV.CSVWritters.EmployeeWritter;
import FileAccess.CSV.CSVWritters.ExtraHoursWritter;
import FileAccess.CSV.CSVWritters.QuoteGroupWritter;
import Settings.Settings;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		File csvFolder = new File(Settings.csvFolder);

		System.out.println(csvFolder.getCanonicalPath());
		System.out.println(csvFolder.exists());
		EmployeesData employees = null;
		DepartmentsData departments = null;
		ExtraHoursData extraHours = null;
		QuoteGroupsData quoteGroups = null;

		for (File file: csvFolder.listFiles()) {

			if (file.getName().equals(Settings.csvEmployees)) {
				System.out.println("Found employees file");
				EmployeeReader employeeReader = new EmployeeReader(file);
				employees = (EmployeesData) employeeReader.saveData();
			}

			if (file.getName().equals(Settings.csvDepartments)) {
				System.out.println("Found departments file");
				DepartmentReader departmentReader = new DepartmentReader(file);
				departments = (DepartmentsData) departmentReader.saveData();
			}
			if (file.getName().equals(Settings.csvExtraHours)) {
				System.out.println("Found extra hours file");
				ExtraHoursReader extraHoursReader = new ExtraHoursReader(file);
				extraHours = (ExtraHoursData) extraHoursReader.saveData();
			}
			if (file.getName().equals(Settings.csvQuoteGroups)) {
				System.out.println("Found quote groups file");
				QuoteGroupReader quoteGroupReader = new QuoteGroupReader(file);
				QuoteGroupsData quoteGroupsData = (QuoteGroupsData) quoteGroupReader.saveData();
			}

		}
		EmployeeQuery.employeesByDepartment(1);






		for (File file: csvFolder.listFiles()) {
			if (file.getName().equals(Settings.csvEmployees)) {
				EmployeeWritter employeeWritter = new EmployeeWritter(file);
				employeeWritter.writeData();
			}
			if (file.getName().equals(Settings.csvDepartments)) {
				DepartmentWritter departmentWritter = new DepartmentWritter(file);
				departmentWritter.writeData();

			}
			if(file.getName().equals(Settings.csvExtraHours)){
				ExtraHoursWritter extraHoursWritter = new ExtraHoursWritter(file);
				extraHoursWritter.writeData();
			}
			if (file.getName().equals(Settings.csvQuoteGroups)) {
				QuoteGroupWritter quoteGroupWritter = new QuoteGroupWritter(file);
				quoteGroupWritter.writeData();
			}

		}
	}
}
