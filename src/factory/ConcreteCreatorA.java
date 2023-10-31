package factory;

// Step 4: Create concrete Creator classes with factory methods
class ConcreteCreatorA extends Creator {
    @Override
    Product createProduct() {
        return new ConcreteProductA();
    }
}
