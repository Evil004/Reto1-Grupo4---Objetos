package Data.Departments;

import java.util.ArrayList;

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
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "ID: " + id + " Name: " + name;
    }
}