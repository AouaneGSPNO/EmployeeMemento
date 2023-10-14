public class EmployeeHistory {
  public static void main(String[] args) {

    System.out.println("\n*********************** TEST MEMENTO *************\n");
      Employee Employee = new Employee(1, "ahmed", "54120","manager");

      // Sauvegarde de l'état actuel
      EmployeeState employeeState = Employee.save ();

      // Modification de l'employé
      Employee.setname ("samir");
      Employee.setsalary ("77120");
      Employee.setdesignation ("Chef de projet");

      // Affichage de l'état actuel de l'employé
      System.out.println("État actuel de l'employé : " + Employee);

      // Restauration de l'état précédent
      Employee.restor (employeeState);

      // Affichage de l'état restauré de l'employé
      System.out.println("État restauré de l'employé : " + Employee);
    }



  
}
