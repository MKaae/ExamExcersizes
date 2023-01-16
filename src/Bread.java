public class Bread {
    public int price = 0;
    public String name = "";
    static int breadCnt = 0;

    public Bread(){
        breadCnt++;
    }
    public Bread(String name, int price){
        this.name = name;
        this.price = price;
        breadCnt++;
    }
    /* Example of getter and setter.

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    */
}
