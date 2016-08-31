package lab1.my.solution;
public class Startup {
    public static void main(String[] args) {
        HRManager tim = new HRManager();
        tim.hireEmployee("Steve", "Johnson", "554423");
        System.out.println("The employee's status is: " + tim.getEmployeeStatus());

    }
    
    
}
