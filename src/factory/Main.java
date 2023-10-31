package factory;

// Step 5: Client code
public class Main {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        Product productA = creatorA.createProduct();
        productA.display();

        Creator creatorB = new ConcreteCreatorB();
        Product productB = creatorB.createProduct();
        productB.display();
    }
}
