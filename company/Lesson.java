package com.company;

import java.util.Scanner;
public class Lesson<elementry> {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("input elementry");
        int elementry = myobj.nextInt();
        if (elementry <= 1)
            System.out.println(" go to kindergartin");
        else if (elementry <= 2)
            System.out.println(" go to primary 1");
        else if (elementry <= 3)
            System.out.println(" go to primary 2");
        else if (elementry <= 4)
            System.out.println(" go to primary 3");
        else if (elementry <= 5)
            System.out.println(" go to primary 4");
        else if (elementry <= 6)
            System.out.println(" go to primary 5");
        else if (elementry <= 7)
            System.out.println(" go to primary 6");


    }
}