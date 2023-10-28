## Intent

- Define a family of algorithms.
- Encapsulate each algorithm.
- Make them interchangeable.

## When to Use

- Use it when you have multiple related algorithms and need to choose one at runtime.
- To avoid conditional statements and make code more extensible.
- When you want to encapsulate and isolate different behaviors.

## Advantages

- Allows dynamic selection of algorithms.
- Promotes code flexibility and maintainability.
- Encapsulates algorithms, reducing code duplication.


## Implementation Steps

1. Identify the context class.
2. Define a strategy interface.
3. Create concrete strategy classes.
4. Add a reference to the strategy in the context.
5. Delegate algorithm execution to the strategy in the context.
6. In client code, create context objects and set strategy objects.
