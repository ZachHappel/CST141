package cst141.projects.projectfour; 

public abstract class CoursePerson {

    protected String fullName;
    protected String phoneNumber; 
    protected String userName;
    
    // ***********************************************************************

    // Default constructor. Set protected variables to the empty string or 0
    public CoursePerson() {
        fullName = "";
        phoneNumber = "";
        userName = "";
    } 

    // ***********************************************************************

    // Constructor with parameters to set the private variables
    public CoursePerson(String fullName, String phoneNumber, String userName) {
        //setData(String fullName, String phoneNumber, String userName;
    } 
    
   // ***********************************************************************

   public String getFullName () {
       return fullName;
   }

   public String getPhoneNumber () {
       return phoneNumber;
   }

   public String getUserName () {
       return userName;
   }

   /**
    public void setData(String empFullName, String empDepartmentCode,
                        String empBirthday, int empAnnualSalary) {
        fullName       = empFullName;
        departmentCode = empDepartmentCode;
        birthday       = empBirthday;
        annualSalary   = empAnnualSalary;
    }  **/ 

    // ***********************************************************************

    // Ensure each subclass has a printInfo() method
    abstract void printInfo();

    // ***********************************************************************

    // Ensure each subclass has a getAnnualBonus() method
    abstract String getEmailAddress();
}