import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args){
        int counter = 0;
        ArrayList<Integer> a = new ArrayList<>(){
            {
                add(4);
                add(8);
                add(15);
                add(16);
                add(66);
                add(23);
                add(42);
                add(66);
            }
        };
        for(int list: a){
            if(list == 66){
                counter++;
            }
        }
        System.out.println("The amount of 66 is: " + counter);
    }
    /*
    We use ArrayList instead of Arrays when we want a data structure that can change in size. A normal array has a fixed
    size which means we can't change the size by removing data from it, or increase size by adding to it.
     */
}
