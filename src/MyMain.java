import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /*
        Scanner is a class in the java.util package. We use it to read inputs into our programs.
         */
        int age = 0;
        boolean success = false;
        while(!success){
           try {
               String temp = s.next();
               age = Integer.parseInt(temp);
               success = true;
           }catch(NumberFormatException NFE){
               System.out.println("This is not a number.");
           }
        }
        /*
        To scan from a file instead we could do:
        File file = new File("Test.txt");
        Scanner sc = new Scanner(file);
         */
    }
}
