public class Fruit {
    String name = "";
    int weight = 0;

    public Fruit(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public void showFruitName(){
        System.out.println(this.name);
    }
    public void showFruitWeight(){
        System.out.println(this.weight);
    }
    public static void main(String[] args){
        Fruit fruit = new Banana("Chiquita", 200);
        fruit.showFruitWeight();
    }
    /*
    I'm overriding the method to make a new method for banana that has the explained prints.
    Then i'm calling the super method with super.showFruitWeight();
    We do this with polymorphism, so banana get showFruitWeight but with super we can call the original method.
     */
}
