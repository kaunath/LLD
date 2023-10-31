package factory;

class ConcreteCreatorB extends Creator {
    @Override
    Product createProduct() {
        return new ConcreteProductB();
    }
}
