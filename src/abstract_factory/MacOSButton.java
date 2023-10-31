package abstract_factory;

// Step 3: Create concrete Product classes for MacOS
class MacOSButton implements Button {
    @Override
    public void render() {
        System.out.println("Render a MacOS button");
    }
}
