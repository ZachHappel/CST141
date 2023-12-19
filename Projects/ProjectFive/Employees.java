import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

import java.util.Collections;


// 0 if equal, -1 of comparableObjext les than otherComparable, 1 if comparable
public class Employees {

    public static void main(String[] args) throws Exception {

        // Create ArrayList of object EmployeeData
        ArrayList<EmployeeData> EmployeesList = new ArrayList<>();
        int lineCount = 0;

        // Make sure argument is a textfile
        if (!(args[0].endsWith(".txt"))) throw new Exception("Invalid file name");
        
        // Assign filename argument to variable, create file input bytestream and attach scanner
        String fileName = args[0];
        FileInputStream fileByteStream = new FileInputStream(fileName);
        Scanner inFS = new Scanner(fileByteStream);
      
        // While loop, while next line exists,
        //   Ingest line, split it on commas (,) and directly add as an EmployeeData object to EmployeesList
        System.out.print("\nEmployees - Sorting EmployeeData Objects\n\n" + "Reading from file " + fileName + "...\n");
        
        while(inFS.hasNext()) {
            lineCount++; 
            String line = inFS.nextLine(); 
            String[] lineArr = line.split(",");
            EmployeesList.add(new EmployeeData(lineArr[0], lineArr[1], Integer.valueOf(lineArr[2]), Integer.valueOf(lineArr[3])));
            //System.out.println("Line arr:" + lineArr.toString()); 
         }


         System.out.println("\nLine Count: " + lineCount + "\nEmployeeData objects amount: " + EmployeesList.size() + "\n\nUnsorted: ");
         for (int i = 0; i <= EmployeesList.size() - 1; i++) {
             System.out.println(EmployeesList.get(i));
         }


         Collections.sort(EmployeesList);
         
         System.out.println("\n\nSorted: ");
         for (int i = 0; i <= EmployeesList.size() - 1; i++) {
             System.out.println(EmployeesList.get(i));
         }

        
        //System.out.println(args[0]);
        
    }
    
}
