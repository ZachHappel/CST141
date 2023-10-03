package ProjectsFolder.ProjectWeekThree;

public class SoccerTeam {
    private TeamPerson headCoach;
    private TeamPerson assistantCoach;
    

    public void setHeadCoach(TeamPerson teamPerson) {
        headCoach = teamPerson;
    }
    
    public void setAssistantCoach(TeamPerson teamPerson) {
        assistantCoach = teamPerson;
    }
    
    public TeamPerson getHeadCoach() {
        return headCoach;
    }
    
    public TeamPerson getAssistantCoach() {
        return assistantCoach;
    }
    
    public void print() {
        System.out.println("HEAD COACH: ");
        headCoach.print();
        System.out.println();
        
        System.out.println("ASSISTANT COACH: ");
        assistantCoach.print();
        System.out.println();
    }
}
