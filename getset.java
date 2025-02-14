//Getter setter
class Company {
    private int emp_id;
    private String emp_name;
    private String emp_company;

    public int getID() {//getter for emp_details
        return emp_id;
    }

    public String getEmpName() {
        return emp_name;
    }

    public String getEmpCompany() {
        return emp_company;
    }

    public void setID(int emp_id) {//setter fro emp_details
        this.emp_id = emp_id;
    }

    public void setEmpName(String emp_name) {
        this.emp_name = emp_name;
    }

    public void setEmpCompany(String emp_company) {
        this.emp_company = emp_company;
    }
}

class GetSet {
    public static void main(String[] args) {
        Company c = new Company();

        System.out.println("Company Details:");
        System.out.println("===============");

        c.setID(4079);
        c.setEmpName("Adarsh Kasaudhan");
        c.setEmpCompany("Microsoft");
        System.out.println("Employee ID: " + c.getID());
        System.out.println("Employee Name: " + c.getEmpName());
        System.out.println("Employee Company: " + c.getEmpCompany());


        System.out.println("********************");
        System.out.println("Company Details:");
        System.out.println("===============");

        c.setID(4078);
        c.setEmpName("Prakhar Kasaudhan");
        c.setEmpCompany("continental");
        System.out.println("Employee ID: " + c.getID());
        System.out.println("Employee Name: " + c.getEmpName());
        System.out.println("Employee Company: " + c.getEmpCompany());
    }
}
