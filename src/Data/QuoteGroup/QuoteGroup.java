package Data.QuoteGroup;

public class QuoteGroup {
    private int id;
    float salaryBase;

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
    public void getSalaryBase(float salaryBase){
        this.salaryBase = salaryBase;
    }
}
