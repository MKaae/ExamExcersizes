import java.util.Scanner;

public class TestProgram {
    public static void main(String[] args){
        for(int i = 1; i < 4; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(i);
            }
            System.out.println("");
        }
        /*
        We use loops when we have a sequence we want repeated until a certain condition is met.
        We use a for loop when we know how many times we want to run a loop before it meets the condition.
        We use a while loop when we have a conditional that we break depending either on the results of the variables,
        that we are running through it, or a conditional we manually break with let's say an input.
        We use a do while loop if we want to run the results at least one time before checking the condition.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Type input for number of numbers.");
        int numberCounter = sc.nextInt();
        System.out.println("Type input for number of rows.");
        int numberOfRows = sc.nextInt();
        for(int i = 1; i <= numberOfRows; i++){
            for(int k = 1; k <= numberCounter; k++){
                System.out.print(i);
            }
            System.out.println("");
        }
        /*
        The problem with explaining why we would use a for loop in the above assignment is that we can get better,
        time complexity by just using a single for loop or changing it to a while loop.
        First assignment with nested for loops is BigO(n^2), but we can make it BigO(n).
        It does require a few more bytes for assigning int counter and the String value, but if the program
        is bigger it most likely wouldn't since we would already have values of numbers as strings, and
        strings is immutable, saved in strings.
        int counter = 1;
        for(int i = a; i < 4; i++){
            System.out.println(String.valueOf(counter) + String.valueOf(counter) + String.valueOf(counter) + String.valueOf(counter) + String.valueOf(counter));
            counter++;
        }
         */
    }
}
