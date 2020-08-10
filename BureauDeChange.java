import java.util.Scanner;

public class BureauDeChange {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int dollartonaira = 0;
        int nairatodollar=0;
        int eurotonaira=0;
        int nairatoeuro=0;
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
                System.out.println(" PRESS 1 FOR THE RATE OF DOLLARS TO NAIRA, PRESS 2 FOR THE RATE OF NAIRA TO DOLLAR, PRESS 3 FOR THE RATE OF NAIRA TO EUROS, PRESS 4 FOR THE RATE OF EUROS TO NAIRA ");
                int admin=myobj.nextInt();
               // int admins=myobj.nextInt();
                if (admin==1) {
                    System.out.println("ENTER THE NEW DOLLAR RATE TO NAIRA");
                    dollartonaira=myobj.nextInt();
                        System.out.println(" DOLLAR RATE IS $" + dollartonaira);

                } else if (admin==2) {
                    System.out.println("WHAT'S THE NEW NAIRA RATE TO DOLLAR");
                    nairatodollar=myobj.nextInt();
                    System.out.println("NAIRA RATE IS #" + nairatodollar);
                }else if (admin==3) {
                    System.out.println("WHAT'S THE NEW NAIRA RATE TO EUROS");
                    nairatoeuro=myobj.nextInt();
                    System.out.println("NAIRA RATE IS #" + nairatoeuro);
                    // System.out.println("1. DOLLAR @ $380");
                    // System.out.println("2. EURO @ 544");
                    // System.out.println("3. #1 NAIRA @ $0.0021");
                }else if (admin==4) {
                    System.out.println("WHAT'S THE NEW EUROS RATE TO NAIRA");
                    eurotonaira=myobj.nextInt();
                    System.out.println("EUROS RATE IS EUROS" + eurotonaira);
                }else
                  System.out.println("error");
                System.out.println("WOULD YOU LIKE TO LOG IN AS A CLIENT ?");
                System.out.println("IF YES PRESS 1, IF NO PRESS2");
                int client=myobj.nextInt();
                if (client==1) {
                    System.out.println("WELCOME CLIENT");
                }else
                    System.out.println("THANK YOU");{
                    System.out.println("PLEASE PROVIDE YOUR CLIENTS PASSCODE");
                    int clients = myobj.nextInt();
                    if (clients == 2002) {
                        System.out.println("PROCEED WITH YOUR TRANSACTION");
                        System.out.println("PLEASE KINDLY SELECT ONE OF THE FOLLOWING OPTIONS");
                        System.out.println("1. CONVERT DOLLARS($) TO NAIRA(#)");
                        System.out.println("2. CONVERT NAIRA TO DOLLARS($)");
                        System.out.println("3. CONVERT NAIRA(#) TO EUROS ");
                        System.out.println("4. CONVERT EUROS TO NAIRA(#)");
                        int pincode = myobj.nextInt();
                        if (pincode == 1) {
                            System.out.println("INPUT AMOUNT TO BE CONVERTED");
                            int numbas = myobj.nextInt();
                            // int admins=myobj.nextInt();
                            if (pincode == 1)
                                System.out.println("PLEASE WAIT WHILE WE PROCESS YOUR REQUEST");
                            System.out.println("#" + numbas * dollartonaira);
                        } else if (pincode == 2) {
                            System.out.println("INPUT AMOUNT TO BE CONVERTED");
                            int numbas = myobj.nextInt();
                            System.out.println("PLEASE WAIT WHILE WE PROCESS YOUR REQUEST");
                            System.out.println("#" + numbas * nairatodollar);
                        } else if (pincode == 3) {
                            System.out.println("INPUT AMOUNT TO BE CONVERTED");
                            int numbas = myobj.nextInt();
                            System.out.println("PLEASE WAIT WHILE WE PROCESS YOUR REQUEST");
                            System.out.println("EUROS" + numbas / nairatoeuro);
                        } else if (pincode == 4)
                            System.out.println("INPUT AMOUNT TO BE CONVERTED");
                        int numbas = myobj.nextInt();
                        System.out.println("PLEASE WAIT WHILE WE PROCESS YOUR REQUEST");
                        System.out.println(numbas / eurotonaira + "#");
                    } else
                        System.out.println("INCORRECT PIN");
                }
            } else
                System.out.println("INVALID PIN");

        } else if (numbers == 2) {
            System.out.println("WELCOME CLIENT");
            System.out.println("ENTER CLIENT'S PIN");
            int password = myobj.nextInt();
            if (password == 1234) {
                System.out.println("PROCEED WITH YOUR TRANSACTION");
                System.out.println("PLEASE KINDLY SELECT ONE OF THE FOLLOWING OPTIONS");
                System.out.println("1. CONVERT DOLLARS($) TO NAIRA(#)");
                System.out.println("2. CONVERT NAIRA TO DOLLARS($)");
                System.out.println("3. CONVERT NAIRA(#) TO EUROS");
                System.out.println("4. CONVERT EURO TO NAIRA(#)");
                int pincode = myobj.nextInt();
                if (pincode == 1) {
                    System.out.println("INPUT AMOUNT TO BE CONVERTED");
                    int numbas = myobj.nextInt();
                    System.out.println("PLEASE WAIT WHILE WE PROCESS YOUR REQUEST");
                    System.out.println("#" + dollartonaira * numbas);
                } else if (pincode == 2) {
                    System.out.println("INPUT AMOUNT TO BE CONVERTED");
                    int numbas = myobj.nextInt();
                    System.out.println("PLEASE WAIT WHILE WE PROCESS YOUR REQUEST");
                    System.out.println("$" + numbas * nairatodollar);
                } else if (pincode == 3) {
                    System.out.println("INPUT AMOUNT TO BE CONVERTED");
                    int numbas = myobj.nextInt();
                    System.out.println("PLEASE WAIT WHILE WE PROCESS YOUR REQUEST");
                    System.out.println("EUROS" + numbas / nairatoeuro);
                } else if (pincode == 4) {
                    System.out.println("INPUT AMOUNT TO BE CONVERTED");
                    int numbas = myobj.nextInt();
                    System.out.println("PLEASE WAIT WHILE WE PROCESS YOUR REQUEST");
                    System.out.println(numbas / eurotonaira + " #");
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