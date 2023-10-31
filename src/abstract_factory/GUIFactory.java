package abstract_factory;

// Step 4: Define the abstract Factory interface
interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
