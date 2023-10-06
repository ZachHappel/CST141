package cst141.projects.projectfour; 

public class CourseTeacher extends CoursePerson {

    private Boolean fullTime;

    public CourseTeacher() {
        super();
        fullTime = false;
    } 

    public CourseTeacher(
        String theFullName, 
        String thePhoneNumber, 
        String theUserName, 
        boolean theFullTime) {
            super(theFullName, thePhoneNumber, theUserName);
            fullTime = theFullTime;
    } 

    public Boolean getFullTime() { return fullTime; } 

    @Override public void printInfo() {
        System.out.println(
            "Name: " + super.getFullName() + 
            ", Phone Number: " + super.getPhoneNumber() + 
            ", User Name: " + super.getUserName() + 
            ", Full Time: " + fullTime + 
            ", Email: " + getEmailAddress() 
        );
    } 

    @Override public String getEmailAddress() {
        return (super.getUserName()).concat("@mail.sunysuffolk.edu");
    } 
}
