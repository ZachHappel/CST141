package cst141.projects.projectfour; 

public class CourseStudent extends CoursePerson{
    
    private Boolean matriculated;
    private Boolean fullTime;
    private String programOfStudy;

    
    public CourseStudent() {
        super(); // call default constructor of parent class
        matriculated = false;
        fullTime = false;
        programOfStudy = "";
    } 

    
    public CourseStudent( String theFullName, String thePhoneNumber, String theUserName, Boolean theMatriculated, Boolean theFullTime, String theProgramOfStudy ) {
        // assign values passed at this constructor to the CoursePerson (parent) constructor
        super( String theFullName, String thePhoneNumber, String theUserName);
        matriculated = theMatriculated;
        fullTime = theFullName;
        programOfStudy = theProgramOfStudy;
        
    } 


    public Boolean getMatriculated() {
        return matriculated;
    } 

    public Boolean getFullTime() {
        return matriculated;
    } 

    public String getProgramOfStudy() {
        return programOfStudy;
    } 

    // ***********************************************************************

    @Override
    public void printInfo() {
        System.out.println(
            "Name: " + super.getFullName() + 
            ", Phone Number: " + super.getPhoneNumber() + 
            ", User Name: " + super.getUserName() + 
            ", Matriculated: " + matriculated + 
            ", Full Time: " + fullTime + 
            ", Program of Study: " + programOfStudy
        );
    } 

    // ***********************************************************************    
    // FIXME: Implement the getAnnualBonus method. A staff's annual bonus is calculated as 7.5% of the employee's annual salary.

    @Override
    public String getEmailAddress() {
        return (super.getUserName()).concat("@mail.sunysuffolk.edu");
    } 
}
