package lab1;
public class HRManager {
    private Employee employee;
    
    public void hireEmployee(String firstName, String lastName,String ssn){
        Employee e = new Employee();
        
        e.setFirstName(firstName);
        e.setLastName(lastName);
        e.setSsn(ssn);
        e.doOrientation("A101");
        employee = e;
        
        
    }
    
    public String getEmployeeStatus(){
        return employee.getStatus();
    }
}
