## Decorator Design Pattern

1. **Intent**
    - Attach additional responsibilities to objects dynamically.
    - Provide a flexible alternative to subclassing for extending functionality.

2. **Key Components**
    - **Component:** The abstract class or interface that defines the object's core behavior.
    - **Concrete Component:** The base class that implements the component interface.
    - **Decorator:** The abstract class that contains a reference to a component and implements the component interface. It's the base class for concrete decorators.
    - **Concrete Decorator:** Subclasses of the decorator that add specific behaviors to the component.

3. **Advantages**
    - Supports the open-closed principle: You can add new functionality to objects without modifying their structure.
    - Allows the creation of a flexible and customizable object composition.
    - Encourages single responsibility and separation of concerns.

4. **When to Use**
    - When you need to add responsibilities to objects dynamically and at runtime.
    - To avoid a class explosion(defined below) due to multiple subclasses with different combinations of features.
    - To extend the behavior of objects without altering their source code.

5. **Implementation Steps**
    - Define the component interface (or abstract class).
    - Create a concrete component class (the base object).
    - Create an abstract decorator class that implements the component interface.
    - Create concrete decorator classes that extend the abstract decorator.
    - Decorators maintain a reference to the component and enhance its behavior.

6. **Example**
    - Component: Beverage
    - Concrete Components: Espresso, HouseBlend
    - Decorators: Condiments (e.g., Milk, Sugar)
    - Espresso can be decorated with Milk, Sugar, etc.

**Class explosion**: "Class explosion" is a term used in software development
to describe a situation where you end up with an excessive number
of classes, typically due to an overuse of subclassing or inheritance. 
This can make your codebase complex, harder to manage, and less maintainable. 
Class explosion often occurs when you have a large number of subclasses, 
each with minor variations or unique features, which can lead to an unwieldy 
and tangled class hierarchy.
