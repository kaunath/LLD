package factory;

// Step 2: Create concrete Product classes
class ConcreteProductA extends Product {
    @Override
    void display() {
        System.out.println("This is Product A");
    }
}
