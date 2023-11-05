public class Employee {
    private String id ;
    private String name;
    private double salary;
    public  Employee(String id ,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String setId(String id) {
        this.id = id;
        return id;
    }

    public String setName(String name) {
        this.name = name;
        return  name;
    }

    public double setSalary(double salary) {
        this.salary = salary;
        return salary;
    }
    public double AnnualSalary() {

    return salary*12;
    }
    public double raisedSalary(double amount){
        return salary +=(salary*amount);

     
    }
    public String toString(){


    return "ID: "+ getId()+" Salary: "+getSalary()+" Name: "+getName();
    }

}
