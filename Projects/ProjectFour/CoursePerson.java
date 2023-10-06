package cst141.projects.projectfour; 

public abstract class CoursePerson {
    
    protected String fullName;
    protected String phoneNumber; 
    protected String userName;
    
    public CoursePerson() {
        fullName = "";
        phoneNumber = "";
        userName = "";
    } 

    public CoursePerson(
        String theFullName,
        String thePhoneNumber, 
        String theUserName) { 
            fullName = theFullName;
            phoneNumber = thePhoneNumber;
            userName = theUserName; 
    } 
    
   public String getFullName () { return fullName;}
   public String getPhoneNumber () { return phoneNumber; }
   public String getUserName () { return userName; }
   
   abstract void printInfo();
   abstract String getEmailAddress();

}