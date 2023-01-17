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
        When you make b = a, both are pointers to the actual array in memory. So they're the same.
        You either have to make a copy or run numbers from a into b to make 2 separate arrays,
        otherwise any changes to a will change b even if you change after b = a;
         */
    }
}
