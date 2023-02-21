package Data.Departments;
/**
 * @author Jonathan Taban
 * This class stores the Departments.
 */
public class Department {

    private int id;
    String name;
    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId (){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
}