public class ComputerStore {
    public static void main(String[] args){
        Computer pc1 = new Computer();
        /*
        A constructor in Java is a special method used to initialize objects.
        A constructor always have the same name as the class.
        A constructor can't have a return type and can't be abstract, final or static.
        A default constructor has no parameter arguments.
         */
        pc1.model = "Lenovo";
        pc1.showModel();
        /*
        The idea with data members is the variables that the object is initialized with.
        The idea of the methods is the methods that the initialized object have.
         */
        Object pc2 = new Computer();
        /*
        You create an object of Computer that isn't a Computer.
        So to use any methods of pc2 you have to cast it with Computer since you didn't use class reference to make it.
        Casting it like this ((Computer)pc2).model = "newName"; would work for instance.
         */
    }
}
