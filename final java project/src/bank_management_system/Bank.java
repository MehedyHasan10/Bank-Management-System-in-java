
package bank_management_system;

import java.util.Scanner;

public class Bank {
    String accno;
    String name; 
    String type;
    double balance;
   
    Scanner input = new Scanner(System.in);
    
    Bank(){
        
    }
    Bank(String accno,String name,double balance,String type){
        this.accno=accno;
        this.name=name;
        this.type=type;
        this.balance=balance;
    }
    
    void openAccount() {
        System.out.println("     ^^^^Creat an Account^^^^");
        System.out.print("Enter Account Number: ");
        accno = input.nextLine();
        System.out.print("Enter Name: ");
        name = input.nextLine();
        System.out.print("Enter Account Type: ");
        type = input.nextLine();
        System.out.print("Enter Balance: ");
        balance = input.nextDouble();
        System.out.println("        ^^^Thank You^^^");
        System.out.println("-----------------------------------");
    }
    
    void showAccount() {
        System.out.println("-----------------------------");
        System.out.println("| Account number:" +accno);  
        System.out.println("| Name:" +name);
        System.out.println("| Account Type:" +type);
        System.out.println("| Balance:" +balance);
        System.out.println("-----------------------------");
    }
   
    void deposit() {
        double amt;
        System.out.print("Enter amount you want to deposit : ");
        amt = input.nextDouble();
        balance = balance + amt;
    }
   
    void withdrawal() {
        double amt;
        System.out.print("Enter amount you Want to withdraw : ");
        amt = input.nextDouble();
        if (balance >= amt) {
            balance = balance - amt;
        } else {
            System.out.println("Less balance..Transaction failed..");
        }
    }
    
    boolean search(String acn) {
        if (accno.equals(acn)) {
            showAccount();
            return (true);
        }
        return (false);
    }
}

    

