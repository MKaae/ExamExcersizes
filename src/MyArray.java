public class MyArray {
    public static void main(String[] args){
        int[] a = {4,8,15,16,23,42};
        int[] b = new int[6];
        int sum = 0;
        for(int value: a){
            sum += value;
        }
        System.out.println(sum);
        b = a;
        /*
        When we do b = a, b copies the adresses that is stored inside a that points to the adresses of the variables.
         */
    }
}
