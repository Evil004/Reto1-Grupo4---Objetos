package Data.QuoteGroup;

public class QuoteGroup {
    private int id;
    private float salaryBase;

    public QuoteGroup(int id, float salaryBase) {
        this.id = id;
        this.salaryBase = salaryBase;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public float getSalaryBase(){
        return salaryBase;
    }

    public String toString(){
        return "ID: " + id + " Salary Base: " + salaryBase;
    }


    public void setSalaryBase(float salaryBase) {
        this.salaryBase = salaryBase;
    }
}
