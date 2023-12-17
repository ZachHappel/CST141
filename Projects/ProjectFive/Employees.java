import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class Employees {

    public static void main(String[] args) throws Exception {

        ArrayList<EmployeeData> EmployeesList = new ArrayList<>();

        if (!(args[0].endsWith(".txt"))) throw new Exception("Invalid file name");
        
        String fileName = args[0];
        FileInputStream fileByteStream = new FileInputStream(fileName);
        Scanner inFS = new Scanner(fileByteStream);
      
        while(inFS.hasNext()) {
            System.out.println();
            String line = inFS.nextLine(); 
            String[] lineArr = line.split(",");
            EmployeesList.add(new EmployeeData(lineArr[0], lineArr[1], Integer.valueOf(lineArr[2]), Integer.valueOf(lineArr[3])));
            System.out.println("Line arr:" + lineArr.toString()); 
         }

         for (int i = 0; i <= EmployeesList.size() - 1; i++) {
             System.out.println(EmployeesList.get(i));
         }

        
        //System.out.println(args[0]);
        
    }
    
}
