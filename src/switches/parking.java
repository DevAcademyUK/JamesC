package switches;

import java.util.Scanner;

public class parking {

    Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args){


        parking p = new parking();
        p.getInput();
    }
//creating Input form using scanners
    private void getInput() {
        System.out.println("What day is it?");
        String day = myScanner.nextLine();
        System.out.println("How long will you be staying");
        int duration = Integer.parseInt(myScanner.nextLine());
        System.out.println("What position do you hold within the college? (Staff/Student/Visitor)");
        String position = myScanner.nextLine();
        calculateFees(day, duration, position);

    }
//creating constructor for form selections
    private void calculateFees(String day, int duration, String position) {
        int cost;
        int hourlyRate = 0;
        int multiplier = 0;

        switch (position) {
            case "Staff":
                multiplier = 2;
                break;

            case "Student":
                multiplier = 1;
                break;

            case "Visitor":
                multiplier = 3;
                break;

           default:
                System.out.println("Invalid input. Please retry");
                getInput();


        }

        switch (day) {
            case "Monday":
                hourlyRate = 2;
                break;

            case "Tuesday":
                hourlyRate = 2;
                break;

            case "Wednesday":
                hourlyRate = 3;
                break;

            case "Thursday":
                hourlyRate = 2;
                break;

            case "Friday":
                hourlyRate = 3;
                break;

            case "Saturday":
                hourlyRate = 4;
                break;

            case "Sunday":
                hourlyRate = 5;
                break;

            default:
                System.out.println("Invalid input. Please retry");
                getInput();
        }


        cost = (hourlyRate * multiplier) * duration;
        System.out.println("Thanks for parking at the pub. Please pay: "+ cost +"£");

    }




}
