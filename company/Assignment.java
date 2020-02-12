package com.company.testing;
import java.util.Scanner;
public class Assignment{
public static void main(String[] args) {
    Scanner myobj = new Scanner(System.in);
    System.out.println("welcome input age");
    int age=myobj.nextInt();
    //int age = 0;
    if (age <= 10) {
        System.out.println(" go to birthday parties");
    } else if (age <= 17) {
        System.out.println(" go to school parties");
    } else if (age <= 40) {
        System.out.println(" go to clubbing");
    } else if (age <= 75) {
        System.out.println(" go to anniversaries");
    } else if (age <= 100) {
        System.out.println(" stay at home");
    }else if (age>100) {
        System.out.println("enjoy life");
    }
}
}
