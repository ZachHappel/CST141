package cst141.projects.projectfour; 

public class CourseTeacher extends CoursePerson{

    private Boolean fullTime;


    // ***********************************************************************

    // Default constructor
    public CourseTeacher() {
        super();
        fullTime = false;
    } 

    public CourseTeacher(String theFullName, String thePhoneNumber, String theUserName, boolean theFullTime) {
        super(theFullName, thePhoneNumber, theUserName);
        fullTime = theFullTime;
    } 

    // ***********************************************************************

    // Get the number of people managed
    public Boolean getFullTime() {
        return getFullTime;
    } 

    // ***********************************************************************

    @Override
    public void printInfo() {
        System.out.println(
            "Name: " + super.getFullName() + 
            ", Phone Number: " + super.getPhoneNumber() + 
            ", User Name: " + super.getUserName() + 
            ", Full Time: " + fullTime + 
            ", Email: " + super.getEmailAddress();
        );
    } 

    // ***********************************************************************

    // The annual bonus for a manager is 10% of the annual salary.
    @Override
    public int getEmailAddress() {
        return (int)(annualSalary * 0.10);
    } 
}
