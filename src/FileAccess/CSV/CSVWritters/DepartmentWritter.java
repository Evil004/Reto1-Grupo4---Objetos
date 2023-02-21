package FileAccess.CSV.CSVWritters;

import Data.Employees.Employee;
import Data.Employees.EmployeeQuery;
import Data.Employees.EmployeesData;

import java.io.File;
import static Util.Utilities.*;

public class DepartmentWritter extends CSVWritter{

    public DepartmentWritter(File file) {
        super(file);
    }

    public DepartmentWritter(String path){
        super(path);
    }

    @Override
    public Object writeData() {
        return null;
    }
}
