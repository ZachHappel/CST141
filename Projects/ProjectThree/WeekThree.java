package ProjectsFolder.ProjectWeekThree;

import java.util.Scanner; 
import java.io.FileInputStream;
import java.io.IOException;

public class WeekThree {

    public static double computeAverage(Scanner scnr, int numCount) {
        double valuesSum = 0;
        int currValue = 0;
  
        for (int i = 0; i < numCount; ++i) {
           System.out.println("Enter number: ");
           currValue = scnr.nextInt(); 
           valuesSum += currValue;
        }
  
        return valuesSum / numCount;
     }



     public static void main(String[] args) throws IOException {
         
        
        // Figure 6.6.1: Computing the average of a list of numbers .
        Scanner scnr = new Scanner(System.in);
        int numValues;
        double averageVal;
        
        System.out.println("Enter number of values: ");
        numValues = scnr.nextInt(); 
        averageVal = computeAverage(scnr, numValues);
        
        System.out.print("Average: ");
        System.out.printf("%.3f", averageVal);
        System.out.println("");

        

        // Figure 7.6.1: SoccerTeam and TeamPerson classes
        SoccerTeam teamCalifornia = new SoccerTeam();
        
        TeamPerson headCoach = new TeamPerson();
        TeamPerson asstCoach = new TeamPerson();
        headCoach.setFullName("Mark Miwerds");
        headCoach.setAgeYears(42);
        asstCoach.setFullName("Stanley Lee");
        asstCoach.setAgeYears(30);
        
        teamCalifornia.setHeadCoach(headCoach);
        teamCalifornia.setAssistantCoach(asstCoach);
        teamCalifornia.print();
        
        
        // Figure 9.4.2: How many times a word appears in a file.
        FileInputStream fileByteStream = null;  
        Scanner inFS = null;                    
        String userWord;
        String currWord;
        int wordFreq = 0;

        
        System.out.println("Opening file wordFile.txt.");  
        fileByteStream = new FileInputStream("wordFile.txt"); // throws IO error if file doesn't exist
        
        System.out.print("Enter a word: ");  
        userWord = scnr.next();

        inFS = new Scanner(fileByteStream);
        
        while (inFS.hasNext()) {
            currWord = inFS.next();
            if(currWord.equals(userWord)) {
                ++wordFreq;
            }
        }

        System.out.println(userWord + " appears in the file " +
                            wordFreq + " times.");

        fileByteStream.close(); // close() may throw IOException if fails
     }

}
