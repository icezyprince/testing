import java.util.Scanner;

public class BureauDeChange {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("WELCOME TO BUREAU DE CHANGE");
        System.out.println("1. ADMINISTRATOR");
        System.out.println("2. CLIENT");
        System.out.println("SELECT (1) FOR ADMINISTRATOR , (2) FOR CLIENT");
        int numbers = myobj.nextInt();
        if (numbers == 1) {
            System.out.println("WELCOME ADMINISTRATOR");
            System.out.println("ENTER ADMINISTRATORS PIN");
            int pinnumber = myobj.nextInt();
            if (pinnumber == 2002) {
                System.out.println("RATES FOR CURRENCIES");
                System.out.println("1. DOLLAR @ $380");
                System.out.println("2. EURO @ 544");
                System.out.println("3. #1 NAIRA @ $0.0021");
            } else
                System.out.println("INVALID PIN");
            //System.out.println(" DO YOU WANT TO LOG OUT ?");
            //System.out.println("PLEASE PROVIDE YOUR PIN TO LOGOUT");
            //int logout=myobj.nextInt();
            //if (logout==2002)
            // System.out.println("WELCOME TO BUREAU DE CHANGE");
        } else if (numbers == 2) {
            System.out.println("WELCOME CLIENT");
            System.out.println("ENTER CLIENT'S PIN");
            int password = myobj.nextInt();
            if (password == 1234) {
                System.out.println("PROCEED WITH YOUR TRANSACTION");
                System.out.println("PLEASE KINDLY SELECT ONE OF THE FOLLOWING OPTIONS");
                System.out.println("1. CONVERT DOLLARS($) TO NAIRA(#)");
                System.out.println("2. CONVERT EUROS TO NAIRA($)");
                System.out.println("3. CONVERT NAIRA(#) TO DOLLARS($)");
                System.out.println("4. CONVERT NAIRA(#) TO EURO");
                int pincode = myobj.nextInt();
                if (pincode == 1) {
                    System.out.println("INPUT AMOUNT TO BE CONVERTED");
                    int numbas = myobj.nextInt();
                    System.out.println("PLEASE WAIT WHILE WE PROCESS YOUR REQUEST");
                    System.out.println("#" + 380 * numbas);
                } else if (pincode == 2) {
                    System.out.println("INPUT AMOUNT TO BE CONVERTED");
                    int numbas = myobj.nextInt();
                    System.out.println("PLEASE WAIT WHILE WE PROCESS YOUR REQUEST");
                    System.out.println("#" + numbas * 574);
                } else if (pincode == 3) {
                    System.out.println("INPUT AMOUNT TO BE CONVERTED");
                    int numbas = myobj.nextInt();
                    System.out.println("PLEASE WAIT WHILE WE PROCESS YOUR REQUEST");
                    System.out.println("$" + numbas / 380);
                } else if (pincode == 4) {
                    System.out.println("INPUT AMOUNT TO BE CONVERTED");
                    int numbas = myobj.nextInt();
                    System.out.println("PLEASE WAIT WHILE WE PROCESS YOUR REQUEST");
                    System.out.println(numbas / 545 + " EUROS");
            } else
                System.out.println("INCORRECT PIN");
                System.out.println("WOULD YOU LIKE TO RECEIVE AN EMAIL FOR THIS TRANSACTION");
                System.out.println("IF YES PRESS 1, IF NO PRESS 2");
                int email = myobj.nextInt();
                if (email == 1) {
                    System.out.println("PLEASE PROVIDE YOUR EMAIL ADDRESS BELOW");

                } else if (email == 2) {
                    System.out.println("THANKS FOR YOUR PATRONAGE!!!");
                }
        } else
            System.out.println("INCORRECT INPUT");

            System.out.println("THANKS FOR YOUR PATRONAGE ");
        }
    }
}