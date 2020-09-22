
package bank_management_system;

import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalTime;

public class Customer {
      public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("     Bank Management System");
        
        Date date=new Date();
        DateFormat dateFormate = new SimpleDateFormat("dd/MM/YYYY");
        String curDate=dateFormate.format(date);
        System.out.println("         Date:"+curDate);
        
        LocalTime time=LocalTime.now();
        Date d=new Date();
        String s="hh:mm a";
        SimpleDateFormat sdf=new SimpleDateFormat(s);
        System.out.println("         Time:"+sdf.format(d));
        System.out.println("___________________________________");
        System.out.println(" ");
        
        
        System.out.print("How many customer  want to add : " );
        
        int n = input.nextInt();
        System.out.println("___________________________________");
        Bank C[] = new Bank[n];
        for (int i = 0; i < C.length; i++) {
            C[i] = new Bank();
            C[i].openAccount();
        
        }
        
        int ch;
        do {
            System.out.println("***Main Menu***");
            System.out.println("1.Display All");
            System.out.println("2.Search By Account");
            System.out.println("3.Deposit");
            System.out.println("4.Withdraw");
            System.out.println("5.Exit");
            System.out.println("==================================");
            System.out.print("Choice your option >>>>>>>  "); 
            ch = input.nextInt();
                switch (ch) {
                  case 1:
                  for (Bank C1 : C) {
                            C1.showAccount();
            }
                        break;
                  case 2:
                        System.out.print("Enter Account Number Want to Search...: ");
                        String acn = input.next();
                        boolean found = false;
                   for (Bank C1 : C) {
                      found = C1.search(acn);
                   if (found) {
                       break;
                }
            }
                        if (!found) {
                            System.out.println("Search failed..Account not exist..");
                        }
                        break;
                  case 3:
                        System.out.print("Enter Account Number  : ");
                        acn = input.next();
                        found = false;
                   for (Bank C1 : C) {
                     found = C1.search(acn);
                   if (found) {
                    C1.deposit();
                    break;
                }
            }
                        if (!found) {
                            System.out.println("Search failed..Account not exist..");
                        }
                        break;
                  case 4:
                        System.out.print("Enter Account Number : ");
                        acn = input.next();
                        found = false;
                 for (Bank C1 : C) {
                   found = C1.search(acn);
                  if (found) {
                    C1.withdrawal();
                    break;
                }
            }
                        if (!found) {
                            System.out.println("Search failed..Account not exist..");
                        }
                        break;
                  case 5:
                        System.out.println("..See you again..");
                        break;
                }
            }
            while (ch != 5);
        }
    
}
