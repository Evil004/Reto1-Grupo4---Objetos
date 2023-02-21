package FileAccess.CSV.CSVWritters;



import static Util.Utilities.*;
import java.io.File;

public class EmployeeWritter extends CSVWritter{


    public EmployeeWritter(File file) {
        super(file);
    }

    public EmployeeWritter(String path){
        super(path);
    }
    @Override
    public Object writeData() {
        return null;
    }
}
