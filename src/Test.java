import java.util.Random;

public class Test {
    public static void main(String[] args){
        Random r = new Random();
        int z = r.nextInt(10)+1;
        int a = 4;
        int b = 7;

        if(z < b && z > a){
            System.out.println("The random number is in the middle of the range.");
        }
        /*
        The logical && operator doesn't check the second condition if the first condition is false.
        It checks the second condition only if the first one is true.
        The bitwise & operator always checks both conditions whether first condition is true or false.
        The logical || operator doesn't check the second condition if the first condition is true.
        It checks the second condition only if the first one is false.
        The bitwise | operator always checks both conditions whether first condition is true or false.
         */
        String word1 = "cat";
        String word2 = "cat";
        if(word1 == word2){
            System.out.println("They are the same.");
        }
        /*
        This checks if the string value is the same because strings is immutable, and a reference pointing to the string value.
        They are both pointing to the same string object which means they contains the same reference.
        If we have word1 = "cat" and word2 = new String ("cat"); we would have a false for instance.
        Because they are no longer the same cat string we are referencing.
        We could use .equals if we wan't to check content and substring to check specific characters.
        We can use the .equals operator to check if 2 objects are the same.
         */
    }
}
