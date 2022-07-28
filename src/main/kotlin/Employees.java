public class Employees {
    private String name;
    private int empID;

   /* public Employee(){

    }*/

    public Employees(String name, int empID) {
        this.name = name;
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }
}
