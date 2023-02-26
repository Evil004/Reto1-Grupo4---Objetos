package test.FileAccess.CSV.CSVReadders;

import Data.Departments.DepartmentsData;
import Data.Employees.EmployeesData;
import Data.ExtraHours.ExtraHoursData;
import Data.QuoteGroup.QuoteGroupsData;
import FileAccess.CSV.CSVReaders.DepartmentReader;
import FileAccess.CSV.CSVReaders.EmployeeReader;
import FileAccess.CSV.CSVReaders.ExtraHoursReader;
import FileAccess.CSV.CSVReaders.QuoteGroupReader;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Óscar Fernández
 */
class ReadersTests {

	@Test
	public void testDepartmentReader(){
		DepartmentReader departmentReader = new DepartmentReader("src/test/FileAccess/CSV/CSVReadders/DepartmentsTest.csv");
		departmentReader.saveReadedData();

		assertEquals("id;Nombre", departmentReader.getColumnsNames());

		assertEquals(1, DepartmentsData.getDepartments().get(0).getId());
		assertEquals("Department 1", DepartmentsData.getDepartments().get(0).getName());

		assertEquals(2, DepartmentsData.getDepartments().get(1).getId());
		assertEquals("Department 2", DepartmentsData.getDepartments().get(1).getName());

	}


	@Test
	public void testEmployeeReader(){
		EmployeeReader employeeReader = new EmployeeReader("src/test/FileAccess/CSV/CSVReadders/EmployeesTest.csv");
		employeeReader.saveReadedData();

		assertEquals("NIF;Nombre;Apellido1;Apellido2;Cuenta;Antiguedad;NSS;Grupo_profesional;Grupo_Cotizacion;Email;Departamento;id", employeeReader.getColumnsNames());

		assertEquals("12345678-A", EmployeesData.getEmployees().get(0).getDni());
		assertEquals("1a", EmployeesData.getEmployees().get(0).getName());
		assertEquals("1b", EmployeesData.getEmployees().get(0).getSurname1());
		assertEquals("1c", EmployeesData.getEmployees().get(0).getSurname2());
		assertEquals("1d", EmployeesData.getEmployees().get(0).getAccount());
		assertEquals("01/01/2001", EmployeesData.getEmployees().get(0).getSeniority());
		assertEquals(0, EmployeesData.getEmployees().get(0).getNss());
		assertEquals("A1", EmployeesData.getEmployees().get(0).getGroupProfCat());
		assertEquals(1, EmployeesData.getEmployees().get(0).getQuoteGroup());
		assertEquals("a1@gmail.com", EmployeesData.getEmployees().get(0).getEmail());
		assertEquals(1,EmployeesData.getEmployees().get(0).getId());

	}

	@Test
	public void testExtraHoursReader(){
		ExtraHoursReader extraHoursReader = new ExtraHoursReader("src/test/FileAccess/CSV/CSVReadders/ExtraHoursTest.csv");
		extraHoursReader.saveReadedData();

		assertEquals("NIF;Fecha;hora_inicio;hora_fin;Sitio", extraHoursReader.getColumnsNames());

		assertEquals("12345678-A", ExtraHoursData.getExtraHours().get(0).getNif());
		assertEquals("01/01/2001", ExtraHoursData.getExtraHours().get(0).getDate());
		assertEquals(1, ExtraHoursData.getExtraHours().get(0).getStartTime());
		assertEquals(10, ExtraHoursData.getExtraHours().get(0).getEndTime());
		assertEquals(1, ExtraHoursData.getExtraHours().get(0).getPlace());

		assertEquals("12345678-B", ExtraHoursData.getExtraHours().get(1).getNif());
		assertEquals("02/02/2002", ExtraHoursData.getExtraHours().get(1).getDate());
		assertEquals(2, ExtraHoursData.getExtraHours().get(1).getStartTime());
		assertEquals(11, ExtraHoursData.getExtraHours().get(1).getEndTime());
		assertEquals(2, ExtraHoursData.getExtraHours().get(1).getPlace());

	}

	@Test
	public void QuoteGRoupTest() {
		QuoteGroupReader quoteGroupReader = new QuoteGroupReader("src/test/FileAccess/CSV/CSVReadders/QuoteGroupsTest.csv");
		quoteGroupReader.saveReadedData();

		assertEquals(1, QuoteGroupsData.getQuoteGroups().get(0).getId());
		assertEquals(1100, QuoteGroupsData.getQuoteGroups().get(0).getSalaryBase());

		assertEquals(2, QuoteGroupsData.getQuoteGroups().get(1).getId());
		assertEquals(1200, QuoteGroupsData.getQuoteGroups().get(1).getSalaryBase());

	}
}