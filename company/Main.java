package com.company;
import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        //

        Scanner myobj = new Scanner(System.in);
        System.out.println("enter price name");
int      priceMarker = myobj.nextInt();
        System.out.println("enter pocket money");
int           pocketMoney = myobj.nextInt();
        System.out.println("pocket money" + pocketMoney);
int    foodMoney = myobj.nextInt();
        System.out.println("food money" + foodMoney);

        if ( priceMarker >pocketMoney){
            System.out.println("buy biro");
        }
        else {
            System.out.println("buy marker");
      }
        }
        }
