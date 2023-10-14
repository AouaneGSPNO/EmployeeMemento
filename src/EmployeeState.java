public class EmployeeState {

  private int id;
  private String nom;
  private String salary;
  private String designation;
  EmployeeState(int id, String name, String salary, String designation) {
    this.designation=designation;
    this.salary=salary;
    this.nom=name;
    this.id=id;
  }

  public String getname() {
    return nom;
  }

  public String getsalary() {
    return salary;
  }

  public String getdesignation() {
    return designation;
  }
}
