package week_03;

public class EmployeeDemo {
    public static void main(String[] args) {

        /*******************************************
         * 
         * Create an employee object
         * 
         *******************************************/        
        Employee e = new Employee("Joe", 10023, "Development", 1000);
    
        /*******************************************
         * 
         * Java check employee getSalary when compiling (since the type is employee)
         * 
         *******************************************/
        //float s = e.getSalary(); 

        float s = e.getSalary(true); 
        System.out.println(s);

    
    }
}