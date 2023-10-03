package ProjectsFolder.ProjectWeekThree;

public class TeamPerson {
    private String fullName;
    private int ageYears;
    

    public void setFullName(String firstAndLastName) {
       fullName = firstAndLastName;
    }
    
    public void setAgeYears(int ageInYears) {
       ageYears = ageInYears;
    }
    
    public String getFullName() {
       return fullName;
    }
    
    public int getAgeYears() {
       return ageYears;
    }
    
    public void print() {
       System.out.println("Full name: " + fullName);
       System.out.println("Age (years): " + ageYears);
    } 
}
