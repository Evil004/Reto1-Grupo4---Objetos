package Data.Employees;

public class Employee {


        int id;
        String dni;
        String nombre;
        String apellido1;
        String apellido2;
        String cuenta;
        int nss;
        String antiguedad;
        public String catGrupProfesional;
        int grupCotizacion;
        String email;
        int departamento;

        public Employee(int id, String dni, String nombre, String apellido1, String apellido2, String cuenta, int nss, String antiguedad, String catGrupProfesional, int grupCotizacion, String email, int departamento) {
            this.id = id;
            this.dni = dni;
            this.nombre = nombre;
            this.apellido1 = apellido1;
            this.apellido2 = apellido2;
            this.cuenta = cuenta;
            this.nss = nss;
            this.antiguedad = antiguedad;
            this.catGrupProfesional = catGrupProfesional;
            this.grupCotizacion = grupCotizacion;
            this.email = email;
            this.departamento = departamento;
        }

    public int getId() {
        return id;
    }

    //I want all the getter for this class

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getCuenta() {
        return cuenta;
    }

    public int getNss() {
        return nss;
    }

    public String getAntiguedad() {
        return antiguedad;
    }

    public String getCatGrupProfesional() {
        return catGrupProfesional;
    }

    public int getGrupCotizacion() {
        return grupCotizacion;
    }

    public String getEmail() {
        return email;
    }

    public int getDepartamento() {
        return departamento;
    }




}
