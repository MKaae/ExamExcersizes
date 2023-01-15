public class Bakery {
    public static void main(String[] args) {
        Bread myBread1 = new Bread("muffin", 2); //Constructor created with this. That way we don't have to create a getter and setter.
        Bread myBread2 = new Bread(); //Second constructor created to have default constructor since it doesn't specify that bread2 should have any parameters.
        //This.name only works because it's a public variable since it wasn't specified otherwise you would need a getter to retrieve the information.
        System.out.println(myBread1.name + " " + myBread1.price);
        System.out.println(Bread.breadCnt);
        //Better way than setting breadCnt to 2 manually. This way anytime a "Bread" is created is made it will count up.
    }
}
/*
Explain what a class is and how do we use it.

A class is a blueprint for creating objects.
Inside a class is variables and methods that we can use.
A class is a logical entity that doesn't use memory until a physical object is created that uses it as a blueprint.

 */