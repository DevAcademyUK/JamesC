package HR_System;


public class sort implements Comparable<sort> {

    public int employeeID;
    public String employeeTitle;
    public String employeeForename;
    public String employeeSurname;
    public String employeeEmail;
    public String employeeDOB;
    public String employeeAddress1;
    public String employeeTownCity;
    public String employeeCountry;
    public String employeePostCode;
    public String employeeContactNumber;
    public String employeePosition;
    public String employeeStartDate;

    public sort(int employeeID, String employeeTitle, String employeeForename, String employeeSurname, String employeeEmail, String employeeDOB, String employeeAddress1, String employeeTownCity, String employeeCountry, String employeePostCode, String employeeContactNumber, String employeePosition, String employeeStartDate) {
        this.employeeID = employeeID;
        this.employeeTitle = employeeTitle;
        this.employeeForename = employeeForename;
        this.employeeSurname = employeeSurname;
        this.employeeEmail = employeeEmail;
        this.employeeDOB = employeeDOB;
        this.employeeAddress1 = employeeAddress1;
        this.employeeTownCity = employeeTownCity;
        this.employeeCountry = employeeCountry;
        this.employeePostCode = employeePostCode;
        this.employeeContactNumber = employeeContactNumber;
        this.employeePosition = employeePosition;
        this.employeeStartDate = employeeStartDate;
    }

    @Override
    public int compareTo(sort o) {
        return 0;
    }
}
