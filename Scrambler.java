import java.util.Scanner;
import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.PrintWriter; // Writes to a file
import java.util.ArrayList;
import java.lang.StringIndexOutOfBoundsException;
public class Scrambler {
    public static String data1;
    public static String data2;
    public static void scrambleTeam(){
       
            try {
                File myUserFile = new File("/workspace/SuperAutoStudents/adjectives.txt");
                Scanner myReader = new Scanner(myUserFile);
                int a = (int)(Math.floor(Math.random()*144)+1);
                    for (int i = 0; i < a; i++){
                        data1 = myReader.nextLine();
                    }
                Game.teamName = "The " + data1;
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            try {
                File myUserFile = new File("/workspace/SuperAutoStudents/nouns.txt");
                Scanner myReader = new Scanner(myUserFile);
                int a = (int)(Math.floor(Math.random()*127)+1);
                    for (int i = 0; i < a; i++){
                        data2 = myReader.nextLine();
                    }
                Game.teamName = Game.teamName + " " + data2;
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        
    }
}
