import java.util.Scanner;

public class Account {
    Scanner s =new Scanner(System.in);
    private String id;
    private String name;
    private  int balance =0;


    public Account(String id, String name){
        this.id =id;
        this.name=name;
    }
    public Account(String id, String name,int balance){
        this.id =id;
        this.name=name;
        this.balance =balance;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }


    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    public int credit(int amount){

        if (amount < balance) {
         balance -=amount;

        }else System.out.println("Balance not allowed");
        setBalance(balance);
        return getBalance();
    }
    public int debit(int amount){
      getBalance();
       balance +=amount;
        setBalance(balance);
        return getBalance();

    }
    public int transferTo(Account another, int amount){
      Scanner s =new Scanner(System.in);
        if (amount < balance) {
            balance -=amount;
            another.debit(amount);


        }else System.out.println("Balance not allowed");
        setBalance(balance);
        getBalance();
        getName();

       return balance;
    }
    public String toString(String sn){

    return        "the Name: "+ getName()+" the Id: "+ getId()+"  The Balance: "+ getBalance();

    };

}

