package practice2;
import java.util.Scanner;
import java.io.*;

public class practice2 {
  public static void main(String[] args) throws Exception {
     File file = new File("../practice2.txt");
     
     Scanner input = new Scanner(file);
     String s1 = new String();
     StringBuilder s2 = new StringBuilder();
     String line = System.getProperty("line.separator");
     
     while (input.hasNext()) {
        s1=input.nextLine();
        s2.append(s1.replaceAll(args[0], "")+line);
     }
     input.close();
     
     PrintWriter output = new PrintWriter(file);
     output.print(s2);
     output.close();
  }
}