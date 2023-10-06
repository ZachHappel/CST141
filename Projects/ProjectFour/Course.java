package cst141.projects.projectfour; 

public class Course {
    private String courseNumber;
    private String CRN;
    private int numberOfCredits; 

    public Course () { }

    public Course (String theCourseNumber, String theCRN, int theNumberOfCredits) {
            courseNumber = theCourseNumber;
            CRN = theCRN;
            numberOfCredits = theNumberOfCredits;
    }

    public String getCourseNumber () { return courseNumber; }
    public String getCRN () { return CRN; }
    public int    getNumberOfCredits () { return numberOfCredits; }

    public void printInfo () {
        System.out.println(
            "Course Number: " + courseNumber +
            ", CRN: " + CRN +
            ", Number of Credits: " + numberOfCredits
        );
    }
}
