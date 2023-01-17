public class Banana extends Fruit{
    public Banana(String name, int weight){
        super(name, weight);
    }
    public void showFruitWeight(){
        System.out.println("The banana weight is in grams " + this.weight);
        super.showFruitWeight();
    }
}
