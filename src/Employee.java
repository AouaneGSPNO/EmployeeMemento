public class Employee {
    private int id;
    private String name;
    private String salary;
    private String designation;

    public Employee(int id,String name, String salary, String designation) {
      this.name = name;
      this.id= id;
      this.salary = salary;
      this.designation = designation;
    }

    // Méthode pour créer un memento (sauvegarder l'état actuel)
    public EmployeeState save() {
      return new EmployeeState (id,name, salary, designation);
    }

    // Méthode pour restaurer l'état à partir d'un memento
    public void restor(EmployeeState employeeState) {
      this.name = employeeState.getname();
      this.salary = employeeState.getsalary();
      this.designation = employeeState.getdesignation();
    }

    public String getname() {
      return name;
    }

    public void setname(String name) {
      this.name = name;
    }

    public String getsalary() {
      return salary;
    }

    public void setsalary(String salary) {
      this.salary = salary;
    }

    public String getdesignation() {
      return designation;
    }

    public void setdesignation(String designation) {
      this.designation = designation;
    }

    @Override
    public String toString() {
      return "Nom : " + name + ", Salaire : " + salary + ", Designation : " + designation;
    }
  }


