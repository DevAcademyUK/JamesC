package BankingApp;

import java.util.Scanner;


class bankingTerminal {



    //instance variable for scanner
    private Scanner myScanner = new Scanner(System.in);

    public static void main(String []args){

        bankingTerminal newTerminal = new bankingTerminal();
        newTerminal.initialiseCashpoint();

    }

//new method to initialise the cashpoint
    private void initialiseCashpoint(){


        System.out.println("Hello customer...");
        System.out.println("Would you like to access your account today?");



        String activate = myScanner.nextLine();

        if (activate.equalsIgnoreCase("yes")) {
            System.out.println("Please enter your ID");
            String iD = myScanner.nextLine();
            if (iD.equalsIgnoreCase("l.jones")) {
                System.out.println("Please enter your Password");
                String passWord = myScanner.nextLine();
                //a case sensitive input required for password
                if (passWord.equals("dog")) {
                    //enables user to move on to the next class
                   initialiseServices();
                }
                else System.out.println("Wrong credentials");
                initialiseServices();
            }
        }


       /* String activate = myScanner.nextLine();

        if (activate.equalsIgnoreCase("yes")) {
            System.out.println("Please enter your ID");
            String iD = myScanner.nextLine();
            if (iD.equalsIgnoreCase("l.jones")) {
                System.out.println("Please enter your Password");
                String passWord = myScanner.nextLine();
                //a case sensitive input required for password
                if (passWord.equals("dog")) {
                    //enables user to move on to the next class
                   initialiseServices();
                }
                else System.out.println("Wrong credentials");
                initialiseServices();
            } else System.out.println("Wrong credentials");
           initialiseCashpoint();
        } else System.out.println("Goodbye ");
        initialiseCashpoint(); */

    }


//new method to initialise (and offer) customers services
    private void initialiseServices(){

        float balance = 175;

        float deposit;
        deposit = myScanner.nextFloat();


        System.out.println("Welcome! Here are your banking service options: ");
        System.out.println("Check Balance  |  Deposit Money |  Withdraw Money  |  Transfer Money  |  Exit Account");

        String activate = myScanner.nextLine();
        if (activate.equalsIgnoreCase("Check Balance")){
            System.out.println(balance);
            initialiseServices();

        }else if (activate.equalsIgnoreCase("Deposit Money")){
            float newBalance = balance + deposit;
            System.out.println(deposit+" + "+balance+" + "+newBalance);
            initialiseServices();

        }else if (activate.equalsIgnoreCase("Withdraw Money")){
            float withdraw = myScanner.nextFloat();
            float newBalance = balance - withdraw;
            System.out.println(withdraw+" + "+balance+" + "+newBalance);
            initialiseServices();

        }else if (activate.equalsIgnoreCase("Transfer Money")){
            System.out.println("Please enter ID of recipient");
            String recipientId = myScanner.nextLine();
            System.out.println("You have entered: "+ recipientId + "Please enter amount to transfer");
            float amountToTransfer = myScanner.nextFloat();
            System.out.println("Type 'yes' to transfer"+amountToTransfer+" to "+recipientId+"?");
            String confirm = myScanner.nextLine();
            if (confirm.equalsIgnoreCase("yes")) {
                System.out.println(amountToTransfer+" sent successfully to user: "+ recipientId);
            } else {
                initialiseServices();
            }

        } else {
            initialiseCashpoint();
        }


    }


}