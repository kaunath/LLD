package abstract_factory;

class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Render a Windows checkbox");
    }
}
