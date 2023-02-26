package Data.Employees;

import Data.QuoteGroup.QuoteGroup;

/**
 * @author Jose Vicente
 * Employee's Constructor Class
 */
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

        public Employee(int id, String dni, String name, String surname1, String surname2, String account, int nss, String seniority, String groupProfCat, int quoteGroup, String email, int department) {
            this.id = id;
            this.dni = dni;
            this.name = name;
            this.surname1 = surname1;
            this.surname2 = surname2;
            this.account = account;
            this.nss = nss;
            this.seniority = seniority;
            this.groupProfCat = groupProfCat;
            this.quoteGroup = quoteGroup;
            this.email = email;
            this.department = department;
        }

        public String toString(){
            return "ID: " + id + " DNI: " + dni + " Name: " + name + " Surnames: " + surname1 + " " + surname2 + " Account: " + account + " NSS: " + nss + " Seniority: " + seniority + " Profesional Group: " + groupProfCat + " Quote Group: " + quoteGroup + " Email: " + email + " Department: " + department;
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
