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
        System.out.println("Would you like to access your today?");

        String activate = myScanner.nextLine();

        if (activate.equalsIgnoreCase("yes")) {
            System.out.println("Please enter your ID");
            String iD = myScanner.nextLine();
            System.out.println("Please enter your password ");
            String passWord = myScanner.nextLine();

            initialiseUser newUser = new initialiseUser(passWord, iD);
        }
        else;

    }


}