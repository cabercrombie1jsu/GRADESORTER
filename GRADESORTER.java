import java.io.*;
import java.util.Scanner;

public class LabAssignment1 {
    public static int[] loadGradesFromFile(String newFile) {
        int[] grades = null;
        Scanner sc = null;
       try {
           sc = new Scanner(new File(newFile));
           grades = new int [sc.nextInt()];
       }catch(FileNotFoundException e){
           grades = null; 
       }
       if (grades != null){
            for (int i= 0; i< grades.length;i++){
               grades[i]= sc.nextInt();
            }
        }
        // TODO:
        // Load the grades from the file and return them.
        return grades;
    }

    public static int[] createBins(int[] data, int[] upperBound) {
        int[] bin = null;
        bin = new int[upperBound.length];
        int run = 0;
        for(int i= 0; i < bin.length; i++){
            for(int j = 0;j < data.length; j++){
                if (run == 0){
                    if(data[j] <= upperBound[i]){
                        bin[i] = bin[i] + 1;
                    }
                }
                else{
                    if(data[j] <= upperBound[i] & data[j] > upperBound[i - 1]){
                        bin[i] = bin[i] + 1;
                    }
                }
            }
            run++;
        }
        // TODO:
        // Create the bin array and fill it with the appropriate counts.
        return bin;
    }

}
