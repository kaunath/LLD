package abstract_factory;

// Step 2: Create concrete Product classes for Windows
class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Render a Windows button");
    }
}
