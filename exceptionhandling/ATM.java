package exceptionhandling;

import java.util.Scanner;

public class ATM {

    private int bal;

    public ATM(int bal) {
        this.bal = bal;
    }

    public int getAmount() {
        return bal;
    }

    public int withdraw(int amt) throws InsuffientBalanceAmountException{
        int balance = 0;
        if(amt > this.bal){
            throw new InsuffientBalanceAmountException("Insuffient balance");
        }else{

        balance = this.bal - amt;
        System.out.println("trancation success");
        }
        return balance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount to with draw:");
        int amt = scanner.nextInt();
        ATM atm = new ATM(20000);
        try{
            atm.withdraw(amt);
        }
        catch(InsuffientBalanceAmountException e){
            System.out.println("insuffient balance");
        }finally{
            scanner.close();
        }        
    }
}

//throw ->used to throw exception object
//        only one object can throw at a time

//throws ->used to throw one or more exceptions at a time
//         later we need to handle the exceptionb when we are calling that line of code 
