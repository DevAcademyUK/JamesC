package newBankingApp;

import java.util.Scanner;

public class bankingTerminal {

    Scanner myScanner = new Scanner(System.in);

    double balance = 175;




    // setting the main method
    public static void main(String[] args) {

        bankingTerminal newTerminal = new bankingTerminal();
        newTerminal.initialiseCashPoint();
        newTerminal.initialiseServices();

    }
// setting the login method
    private void initialiseCashPoint(){

        System.out.println("Welcome to BIG BANKING FINANCIAL MONEY GIVERS AND TAKERS AND SOMETIMES HOLDERS FOR A BIT CO LTE");
        //user ID
        System.out.println("Please enter your user ID");
        String userID = myScanner.nextLine();
        //user password
        System.out.println("Hello "+userID);
        System.out.println("Please enter your Password");
        String userPassWord = myScanner.nextLine();


        if (userID.equalsIgnoreCase("l.jones") && userPassWord.equals("dog")) {
            System.out.println("Welcome");


        }
        else System.out.println("Wrong credentials");
    }



    // setting the method that contains the services
    private void initialiseServices(){



        System.out.println("Here are your banking service options: ");
        System.out.println("Check Balance  |  Deposit Money |  Withdraw Money  |  Transfer Money  |  Exit Account");

        //sets the scanner
        String inputT = myScanner.nextLine();



        //sets the selectable options
        switch (inputT){
            case "Check Balance":
                checkBalance();
                break;
        }
        switch (inputT){
            case "Deposit Money":
                depositMoney();
                break;
        }
        switch (inputT){
            case "Withdraw Money":
                withdrawMoney();
                break;
        }

        switch (inputT){
            case "Transfer Money":
                transferMoney();
                break;
        }
        switch (inputT){
            case "Exit Account":
                initialiseCashPoint();
                break;
        }
    }

    private void checkBalance(){
        System.out.println("£"+balance);
        initialiseServices();
    }

    private void depositMoney(){
        System.out.println("how much would you like to deposit?");
        double deposit=  myScanner.nextDouble();
        double newBalance = balance + deposit;
        balance = newBalance;
        System.out.println(deposit + " withdrawn successfully. Your new balance is: "+newBalance);
        initialiseServices();

    }

    private void withdrawMoney(){
        System.out.println("how much would you like to withdraw?");
        double withdraw=  myScanner.nextDouble();
        double newBalance = balance - withdraw;
        balance = newBalance;
        System.out.println(withdraw + " withdrawn successfully. Your new balance is: "+newBalance);
        initialiseServices();

    }

    private void transferMoney() {
        System.out.println("Enter recipient ID:");
        String recipientID = myScanner.nextLine();
        System.out.println("Enter transfer amount");
        double balanceSent = myScanner.nextDouble();
        System.out.println("Are you sure you want to send " + balanceSent + " to " + recipientID + " ?");
        String confirm = myScanner.nextLine();
        if (confirm.equalsIgnoreCase("yes")) {
            System.out.println(+balanceSent + " sent successfully!");
        } else {
            System.out.println("Transaction canceled");
        initialiseServices();
        }

    }


}
