
import java.util.Scanner;
import java.io.File;


public class WordCount {
 public static void main(String [] args) throws Exception {

     File file = new File("sadakichi.txt");
     Scanner filescanner = new Scanner(file);
     int words = 0;
        while(filescanner.hasNextLine()){
            String line = filescanner.nextLine();
            words += line.split(" ").length;
        }

    System.out.println("The file has " +words+ " words.");

 }

}
