package abstract_factory;

class MacOSCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Render a MacOS checkbox");
    }
}
