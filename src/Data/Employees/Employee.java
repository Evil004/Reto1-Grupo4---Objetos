package Data.Employees;

import Data.QuoteGroup.QuoteGroup;

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

        public String toString(){
            return "ID: " + id + " DNI: " + dni + " Nombre: " + name + " Apellido1: " + surname1 + " Apellido2: " + surname2 + " Cuenta: " + account + " NSS: " + nss + " Antiguedad: " + seniority + " CatGrupProfesional: " + groupProfCat + " GrupCotizacion: " + quoteGroup + " Email: " + email + " Departamento: " + department;
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

    public void setId(int id) {
        this.id = id;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname1(String surname1) {
        this.surname1 = surname1;
    }

    public void setSurname2(String surname2) {
        this.surname2 = surname2;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setNss(int nss) {
        this.nss = nss;
    }

    public void setSeniority(String seniority) {
        this.seniority = seniority;
    }

    public void setGroupProfCat(String groupProfCat) {
        this.groupProfCat = groupProfCat;
    }

    public void setQuoteGroup(int quoteGroup) {
        this.quoteGroup = quoteGroup;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDepartment(int department) {
        this.department = department;
    }




}
