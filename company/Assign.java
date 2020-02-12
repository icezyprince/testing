package com.company.testing;

import java.util.Scanner;
public class Assign {

    public static void main(String[] args) {
        //

        Scanner myobj = new Scanner(System.in);
        int pinNumber = 2002;
        System.out.println("enter pin number");
        int newpinNumber = myobj.nextInt();

//        System.out.println("choose savingsWithdraw");
//        int accountWithdrawed = myobj.nextInt();
//        System.out.println("");

        if (pinNumber == newpinNumber)
        {
            System.out.println("welcome. your pin is " + newpinNumber);
            System.out.println(" choose what you want to do, 1, widdrew, 2, transfer");
            int moneyavailable= 50000;
            System.out.println("enter amount to withdraw");
            int amoutwithdraw = myobj.nextInt();
            if (amoutwithdraw > moneyavailable){
                System.out.println("insufficient balance");
            }else{
                int savingsWithdraw = myobj.nextInt();

                System.out.println("service not available");
            }


        }
        else

        {
            System.out.println("Scram!!!!!!");
        }
    }}
