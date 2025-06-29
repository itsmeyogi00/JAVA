import java.util.Scanner;

public class BankAccount{
    int AccountNumber;
    float Balance;
    String OwnerName;
    public int Deposit;
    public float NewBalance;

    // creating a Constructor
    public BankAccount(int AccountNumber,float Balance,String Ownername){
        this.AccountNumber=AccountNumber;
        this.Balance=Balance;
        this.OwnerName= Ownername;
    }
    // method to deposit the money in the account
    public void depositMoney(){
        System.out.println("AccountNumber: "+AccountNumber);
        System.out.println("Balance: "+Balance);
        System.out.println("Holders Name: "+OwnerName);
        System.out.print("Enter the amount you want to deposit; ");
        Scanner scanner= new Scanner(System.in);
        Deposit=scanner.nextInt();
        if(Deposit>=0) {
            NewBalance=Deposit+Balance;
            System.out.println("New Balance:"+NewBalance);
        }
    }

    public static void main(String[] args) {
        BankAccount ba= new BankAccount(12312312,1000,"Yogesh");
        ba.depositMoney();
    }

}