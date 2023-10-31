## Factory Design Pattern

- **Intent**: The Factory Design Pattern is a creational design pattern that provides an interface for creating objects in a superclasses but allows subclasses to alter the type of objects that will be created.

- **Key Components**:
    - **Creator (Factory)**: An abstract class or interface that declares the factory method. It doesn't provide a concrete implementation for object creation.
    - **Concrete Creator**: Subclasses of the Creator that implement the factory method to create specific objects.
    - **Product**: The abstract class or interface representing the objects created by the factory.
    - **Concrete Product**: Subclasses of the Product created by the Concrete Creator classes.

- **Advantages**:
    - Encapsulates object creation and promotes loose coupling between clients and objects.
    - Provides a consistent way to create objects, making it easier to manage object lifecycles.
    - Supports open-closed principle, allowing the addition of new product classes without modifying existing code.

- **When to Use**:
    - When a system needs to be independent of how its objects are created, composed, and represented.
    - When a system is configured with multiple families of objects and only one family is active at a time.
    - To delegate the responsibility of instantiating objects to subclasses or other parts of the program.

- **Implementation Steps**:
    1. Define the abstract Creator class or interface with a factory method.
    2. Create concrete classes that implement the factory method to produce specific products.
    3. Define abstract Product classes or interfaces that represent the objects to be created.
    4. Create concrete Product classes that implement the Product interfaces.
    5. Clients use the Creator to create products without being aware of the specific implementations.

- **Example**:
    - Creator: `PageFactory` with a factory method `createPage()`.
    - Concrete Creators: `ReportPageFactory`, `FAQPageFactory`, etc.
    - Product: `Page` abstract class.
    - Concrete Products: `ReportPage`, `FAQPage`, etc.
    - Clients use the `PageFactory` to create different types of `Page` objects based on their needs.
