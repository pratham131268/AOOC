
class Employee{
    private String firstname;
    private String lastname;
    private double monthly_salary;

    Employee(String f,String l, double s){
        this.firstname = f;
        this.lastname = l;
        if(s > 0)
            this.monthly_salary = s;
        else
            this.monthly_salary = 0;
    }

    String getFirstName(){
        return firstname;
    }

    String getLastName(){
        return lastname;
    }

   double getMonthlySalary(){
        return monthly_salary;
    }

    //can use Scanner in set method
    void setFirstName(String f){
        this.firstname = f;
    }

    void setLastName(String l){
        this.lastname = l;
    }

    void setMonthlySalary(double s){
        if(s > 0)
            this.monthly_salary = s;
        else
            monthly_salary = 0;
    }
    
   double getYearlySalary(){
        return(monthly_salary * 12);
   }

   void raise(){
       this.monthly_salary *= 1.10;
   }

   void display(){
       System.out.println("First name: " + firstname);
       System.out.println("last name: " + lastname);
       System.out.println("Monthly salary: "+ monthly_salary);
   }

}

public class EmployeeTest{
    public static void main(String[] args){
        Employee emp1 = new Employee("XYZ","xyz",1111);
        Employee emp2 = new Employee("ABC","abc",2222);
       
        System.out.println("------EMP1 INFO------");
        emp1.display();
        System.out.println("-----EMP2 INFO-------");
        emp2.display();

        System.out.println("-----------------------");

        System.out.println("Employee 1 Yearly Salary: " + emp1.getYearlySalary());
        System.out.println("Employee 2 Yearly Salary: " + emp2.getYearlySalary());

        emp1.raise();
        emp2.raise();

        System.out.println("-----------------------");

       System.out.println("After 10% rise");
       System.out.println("Employee 1 yearly Salray: " + emp1.getYearlySalary());
       System.out.println("Employee 2 yearly Salary: " + emp2.getYearlySalary());

    }
}
