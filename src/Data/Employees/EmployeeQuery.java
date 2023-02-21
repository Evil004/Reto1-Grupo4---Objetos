package Data.Employees;
import java.util.ArrayList;


public class EmployeeQuery {
    public static void imprimirDatosEmpleado(Employee employee) {

        System.out.println("\n");
        System.out.println("Id: " + employee.getId());
        System.out.println("DNI: " + employee.getDni());
        System.out.println("Nombre: " + employee.getName());
        System.out.println("Apellidos: " + employee.getSurname1() + " " + employee.getSurname2());
        System.out.println("Cuenta: " + employee.getAccount());
        System.out.println("Antiguedad: " + employee.getSeniority());
        System.out.println("Categoria Grupo Profesional: " + employee.getGroupProfCat());
        System.out.println("Grupo cotizacion: " + employee.getQuoteGroup());
/*
        for (Departamento departamento: departamentos) {

            if (departamento.id == employee.departamento) {

                System.out.println("Departamento: " + departamento.nombre);

            }
        }*/
        System.out.println("Email: " + employee.getEmail());

    }
    public void employeeByCategory(String Category){
        ArrayList<Employee> employees = EmployeesData.getEmployees();
        System.out.println("A1 - A2 - A3 - B1 - B2 -B3");
        String categoria = Util.Utilities.readLine("Introduce la categoria de la que obtener los employees: ");
        for (Employee employee: employees) {
            if (employee.getGroupProfCat().equals(categoria)) {
                imprimirDatosEmpleado(employee);
            }
        }
    }
    public static void employeeByDNI(String dni) {
        ArrayList<Employee> employees = EmployeesData.getEmployees();

        while (true) {
            for (Employee employee: employees) {
                if (employee.getDni().equals(dni)) {
                    imprimirDatosEmpleado(employee);
                    return;
                }
            }
            System.out.println("No existe un empleado con ese DNI");
        }
    }
    public static void employeeByID(int ID) {
        ArrayList<Employee> employees = EmployeesData.getEmployees();
        while (true) {
            for (Employee employee: employees) {
                if (employee.getId() == ID) {
                    imprimirDatosEmpleado(employee);
                    return;
                }
            }
            System.out.println("No se ha encontrado un empleado con ese ID.");
        }

    }
   /* public static void buscarEmpleadoPorDepartamento(int idDep) {
        ArrayList<Employee> employees = EmployeesData.getEmployees();
        //ArrayList<Department> departments = DepartmentsData.getDepartments();

        while (true) {
            boolean flag = false;
            for (Employee employee: employees) {
                if (employee.departamento == idDep) {
                    for (Department department: departments) {
                        if (department.id == idDep) {
                            flag = true;
                            System.out.printf("ID: %-12s Empleado: %-12s Departamento: %-12s \n", employee.id, employee.nombre, departments.get(departments.indexOf(department)).name);
                        }
                    }

                }
            }
            if (flag) {
                return;
            }
            System.out.println("No se ha encontrado un departamento con ese id");
        }

    }*/
}
