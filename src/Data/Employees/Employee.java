package Data.Employees;

public class Employee {


        private int id;
        private String dni;
        private String name;
        private String surname1;
        private String surname2;
        private String account;
        private int nss;
        private String seniority;
        private  String groupProfCat;
        private int quoteGroup;
        private String email;
        private int department;

        public Employee(int id, String dni, String nombre, String apellido1, String apellido2, String cuenta, int nss, String antiguedad, String catGrupProfesional, int grupCotizacion, String email, int departamento) {
            this.id = id;
            this.dni = dni;
            this.name = nombre;
            this.surname1 = apellido1;
            this.surname2 = apellido2;
            this.account = cuenta;
            this.nss = nss;
            this.seniority = antiguedad;
            this.groupProfCat = catGrupProfesional;
            this.quoteGroup = grupCotizacion;
            this.email = email;
            this.department = departamento;
        }

    public int getId() {
        return id;
    }

    public String getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public String getSurname1() {
        return surname1;
    }

    public String getSurname2() {
        return surname2;
    }

    public String getAccount() {
        return account;
    }

    public int getNss() {
        return nss;
    }

    public String getSeniority() {
        return seniority;
    }

    public String getGroupProfCat() {
        return groupProfCat;
    }

    public int getQuoteGroup() {
        return quoteGroup;
    }

    public String getEmail() {
        return email;
    }

    public int getDepartment() {
        return department;
    }

}
