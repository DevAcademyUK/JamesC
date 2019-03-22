package BankingApp;


public class initialiseUser {


    private String iD;
    private String name;
    private String passWord;

    public initialiseUser(String passWord, String iD) {

        this.name = name;
        this.iD = iD;
        this.passWord = passWord;
    }


    String activateAccount(String iD, String passWord) {
        String activateAccount = " ";
        if (iD == "s.jones" && passWord == "password") {
            activateAccount = "welcome "+name;

        } else {
            activateAccount = "Incorrect ID";
        }
        return activateAccount;
    }
}













