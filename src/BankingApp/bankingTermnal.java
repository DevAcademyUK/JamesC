package BankingApp;

import java.util.Scanner;


class bankingTerminal {
    Scanner myScanner = new Scanner(System.in);



    public static void main(String []args){
        bankingTerminal newTerminal = new bankingTerminal();
        newTerminal.initialiseCashpoint();


    }

    private void initialiseCashpoint(){



        System.out.println("Hello customer...");
        System.out.println("Would you like to access your account today?");

        String activate = myScanner.nextLine();
        if (activate.equalsIgnoreCase("yes")) {
            System.out.println("Please enter your ID");
            String iD = myScanner.nextLine();;
            if (iD.equalsIgnoreCase("l.jones")) {
                System.out.println("Please enter your Password");
                String passWord = myScanner.nextLine();
                if (passWord.equalsIgnoreCase("mypassword")) {
                    System.out.println("Welcome");
                } else System.out.println("Wrong credentials");
            } else System.out.println("Wrong credentials");
        } else System.out.println("Goodbye ");


           /* System.out.println("Please enter your Password");
            String passWord = myScanner.nextLine();

            initialiseUser myUser = new initialiseUser(iD, passWord);

            String activateAccount = myUser.activateAccount(iD, passWord);
                                String passWord = myScanner.nextLine();
*/




    }


}