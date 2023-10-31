package abstract_factory;

// Step 6: Client code that uses the abstract Factory
public class Main {
    public static void main(String[] args) {
        // Choose the platform (Windows or MacOS)
        GUIFactory factory;

        // Example for Windows
        factory = new WindowsFactory();
        Button windowsButton = factory.createButton();
        Checkbox windowsCheckbox = factory.createCheckbox();
        windowsButton.render();
        windowsCheckbox.render();

        // Example for MacOS
        factory = new MacOSFactory();
        Button macosButton = factory.createButton();
        Checkbox macosCheckbox = factory.createCheckbox();
        macosButton.render();
        macosCheckbox.render();
    }
}
