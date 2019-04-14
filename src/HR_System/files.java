package HR_System;

import java.util.*;

public class files {

    Scanner myScanner = new Scanner(System.in);
    List<sort> lists = new ArrayList<>();


    public static void main(String[] args) {
        files f = new files();
        f.init();

    }

    private void init() {

        lists.add(new sort(143, "Mr", "James", "Crook", "james@gmail.com","16/03/1997","2 long lane","Newport","Wales","NP015HR","07504632897","CEO","04/05/2015"));
        lists.add(new sort(787, "Miss", "Selena", "Chan", "selena@gmail.com","06/03/1988","6 simple street","Bristol","England","BR028GF","07516633797","Assistant","24/09/2017"));
        lists.add(new sort(326, "Mrs", "Connor", "Stubbs", "connor@gmail.com","19/09/1996","9 tidy road","Bristol","England","BR043NB","07502675169","Caretaker","08/01/2018"));


        startMenu();

    }

    private void startMenu() {


        System.out.println("Log in as...");
        System.out.println("1 - Admin");
        System.out.println("2 - Employee");

        int selection = Integer.parseInt(myScanner.nextLine());
        switch (selection) {
            case 1:
                adminLogin();
                break;

            case 2:
                employeeLogin();
                break;
        }

    }


    private void adminLogin() {

        System.out.println("Enter Administrator Password:");
        String pw = myScanner.nextLine();

        if (pw.equals("dog")) {
            adminMenu();

        } else {
            System.out.println("Incorrect password");

            System.exit(0);
        }
    }

    private void employeeLogin() {


        System.out.println("Enter User ID:");
        String id = myScanner.nextLine();


        System.out.println("Enter User Password:");

        String pw = myScanner.nextLine();
        if (pw.equals("cat")) {
            //employeeMenu();
            System.exit(0);

        } else {
            System.out.println("Incorrect password");
            System.exit(0);
        }

    }

    private void employeeMenu() {
        startMenu();
    }


    //administrator menu
    private void adminMenu() {
        //displays options for HR_System
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome to the staff database...");
        System.out.println("Please select an option from the following list:");
        System.out.println("1 - Show all employees");
        System.out.println("2 - Add Employee");
        int selection = Integer.parseInt(myScanner.nextLine());

        switch (selection) {
            case 1:
                showEmployees();
                break;

            case 2:
                addRecord();
                break;
        }
    }

    public int generateId() {
        int randomId = 0;
        Random rand = new Random();
        for (int j = 0; j < 10; j++) {
            randomId = rand.nextInt(1000);
        }
        return randomId;
    }

    //a method to add a record
    private void addRecord() {
        //asks for user info
        System.out.println("Enter employee title:");
        String title = myScanner.nextLine();
        System.out.println("Enter employee forename:");
        String forename = myScanner.nextLine();
        System.out.println("Enter employee surname:");
        String surname = myScanner.nextLine();
        System.out.println("Enter employee email:");
        String email = myScanner.nextLine();
        System.out.println("Enter employee DOB:");
        String dob = myScanner.nextLine();
        System.out.println("Enter employee address line 1:");
        String address = myScanner.nextLine();
        System.out.println("Enter employee city:");
        String city = myScanner.nextLine();
        System.out.println("Enter employee country:");
        String country = myScanner.nextLine();
        System.out.println("Enter employee postcode:");
        String postcode = myScanner.nextLine();
        System.out.println("Enter employee contact number:");
        String number = myScanner.nextLine();
        System.out.println("Enter employee position:");
        String position = myScanner.nextLine();
        System.out.println("Enter employee start date:");
        String startDate = myScanner.nextLine();


        int id = generateId();

        //converts first letter to uppercase
        title = title.substring(0, 1).toUpperCase() + title.substring(1);
        forename = forename.substring(0, 1).toUpperCase() + forename.substring(1);
        surname = surname.substring(0, 1).toUpperCase() + surname.substring(1);

        //asks for confirmation
        System.out.println("would you like to add the following record: " + title + " " + forename + " " +" " + surname + " " + email + " " +dob +" " + address +" " + city+" "+country +" " + postcode +" " + number +" " +position+" " +startDate);
        System.out.println("Y/N");
        String confirm = myScanner.nextLine();
        if (confirm.equalsIgnoreCase("y")) {

            lists.add(new sort(id, title, forename, surname, email, dob,address,city,country,postcode,number,position,startDate));
            System.out.println("record added successfully");
            adminMenu();
        } else if (confirm.equalsIgnoreCase("n")) {
            System.out.println("record canceled");
            adminMenu();
        } else {
            adminMenu();
        }
    }

    //a method to show existing records
    private void showEmployees() {
        //cycles through array of records stored in lists
        for (sort b : lists) {
            System.out.println("ID: " + b.employeeID + " " + b.employeeTitle + " " + b.employeeForename + " " + b.employeeSurname + " email: ["+ b.employeeEmail + "] DOB: ["+ b.employeeDOB + "] address: ["+ b.employeeAddress1  + " "+ b.employeeTownCity + " "+ b.employeeCountry + " "+ b.employeePostCode + "] contact number: ["+ b.employeeContactNumber + "] position: ["+ b.employeePosition + "] start date: ["+ b.employeeStartDate);
        }
        System.out.println();
        adminMenu();
    }
}

