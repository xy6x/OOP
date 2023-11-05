import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        Account a1=new Account("110245","yousef",15400);
        Account a2=new Account("104545","naser",10);
        Account a3=new Account("110014","yaser",504000);


        System.out.println(a1.debit(200));
        System.out.println(a2.credit(5));
        System.out.println(a2.credit(10));
        System.out.println(a1.getBalance());
        System.out.println(a2.getBalance());

a3.transferTo(a1,500);

        System.out.println(a1.getBalance());
        System.out.println(a3.getBalance());
        System.out.println(a1.getBalance());
        System.out.println(a3.getBalance());
        System.out.println(a1.toString("a1"));

        Employee e1 =new Employee("1010","yousef",1500);
        Employee e2 =new Employee("1001","yaser",2500);

        System.out.println(e1.AnnualSalary());
        System.out.println(e1.raisedSalary(0.10));
        System.out.println(e2.toString());










    }
}