public class MethodShow {

    public static void main(String[] args){
        System.out.println(isTrue(7));
        /*
        A method is a block of code that when called performs the actions mentioned in it.
        A parameter is specified in the method name in the parenthesis.
        When the method is run let's say isTrue(7), the 7 is called an argument.

        All methods in Java are either void, meaning no return type. Or they have a return type.
        If they have a return type you must have a return inside the method.
        When we have a method we can read it as "Access_Modifier Static/Non-static ReturnType Method_Name(Parameter){ Block of code}".
        The method signature from that is Method_Name(Argument)

        We declared out method static which means we don't have to create an object of the class to see the methods inside it.
        We don't have to make a MethodShow ms = new MethodShow(); to use isTrue(7).
         */
    }
    public static boolean isTrue(int input){
        if(input < 10){
            return true;
        }
        return false;
    }
    /*
    Can be rewritten to return input < 10; without if statement. Because boolean is returned as false as default.
     */
}
