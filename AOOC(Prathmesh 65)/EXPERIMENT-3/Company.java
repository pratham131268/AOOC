class Employee{
    String name;
    String address;
    double salary;
    String job_title;

    Employee(String n, String a, double s, String j){
        name = n;
        address = a;
        salary = s;
        job_title = j;
    }

    double calculate_bonus(){
        return 0.0;
    }

    void performance_report(){
        System.out.println(name + " is gernerating good performance report.");
    }

    void manage_project(){
        System.out.println(name + " is manageing importatnt project.");
    }

}

class Manager extends Employee{
    Manager(String name, String address, double salary){
        super(name, address, salary, "Manager");
    }

    @Override
    double calculate_bonus(){
        return salary * 0.20; 
    }

    @Override
    void performance_report(){
        System.out.println(name + "(Manager) is generating performance report.");
    }

    @Override
    void manage_project(){
        System.out.println(name + " is Mangeing projects.");
    }
}

class Developer extends Employee{
    Developer(String name, String address, double salary){
        super(name, address, salary, "Developer");
    }

    double calculate_bonus(){
        return salary * 0.25;
    }

    void performance_report(){
        System.out.println(name + " (Developer) is generating report");
    }

    void mange_project(){
        System.out.println(name + " is Working on development projects");
    }

}

class Programmer extends Employee{
    Programmer(String name, String address, double salary){
        super(name, address, salary, "Programmer");
    }

    double calculate_bonus(){
        return salary * 0.30;
    }

    void performance_report(){
        System.out.println(name + " (Programmer) is generating report");
    }

    void mange_project(){
        System.out.println(name + " is Working on Coding projects");
    }

}

public class Company{
    public static void main(String[] args){
       Employee manager = new Manager("AV", "123 town", 50000);
       Employee developer = new Developer("DD", "321 town", 65000);
       Employee programmer = new Programmer("pp", "near tower", 80000);

       System.out.println("Manager Bonus: " + manager.calculate_bonus());
       manager.performance_report();
       manager.manage_project();

        System.out.println("-------------------------------------");
        
       System.out.println("Developer Bonus: " + developer.calculate_bonus());
       developer.performance_report();
       developer.manage_project();

       System.out.println("-------------------------------------");

       System.out.println("Programmer Bonus: " + programmer.calculate_bonus());
       programmer.performance_report();
       programmer.manage_project();


    }
}
