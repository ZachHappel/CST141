package cst141.projects.projectfour; 

public class CollegeCoursesMain {


    public static void main (String[] args) {
        Course courseCST141 = new Course("CST141", "95537", 4);
        CourseTeacher courseCST141Teacher = new CourseTeacher("Prof. H.", "631-548-2691", "hassile", true);
        CourseStudent[] courseCST141Student = new CourseStudent[5];
        //                                                                           matric, fulltime
        courseCST141Student[0] = new CourseStudent("Sally", "631-555-1111", "sally01", true, true, "CST");
        courseCST141Student[1] = new CourseStudent("Mohammed", "631-555-2222", "moham56", true, true, "CST");
        courseCST141Student[2] = new CourseStudent("Alex", "631-555-3333", "alex93", false, false, "N/A");
        courseCST141Student[3] = new CourseStudent("Barbara", "631-555-4444", "barba28", true, false, "GenStud");
        courseCST141Student[4] = new CourseStudent("Monique", "631-555-5555", "moniq71", true, true, "CST");

        System.out.println("\nWritten by Zacharie Happel\n");

        System.out.println("Course Info: ");
        courseCST141.printInfo();
        System.out.println("\nTeacher Info: ");
        courseCST141Teacher.printInfo();
        System.out.println("\nCourse Info: ");
        
        for (int i = 0; i <= courseCST141Student.length - 1; i++) {
            System.out.print("Student #" + i + " ");
            courseCST141Student[i].printInfo();
        }
    }
    

}