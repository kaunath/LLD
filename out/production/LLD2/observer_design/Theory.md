## Observer Design Pattern

1. **Intent**
    - Define a one-to-many dependency between objects.
    - When one object (the subject) changes its state, all its dependents (observers) are notified and updated automatically.

2. **Key Components**
    - **Subject:** The object that is being observed. It maintains a list of observers and notifies them of state changes.
    - **Observer:** Represents the objects interested in the subject's state changes. They register with and get notified by the subject.
    - **Concrete Subject:** A specific implementation of the subject, which can be observed.
    - **Concrete Observer:** A specific implementation of the observer, which receives updates from the subject.

3. **Advantages**
    - Allows loosely coupled design between subjects and observers.
    
4. **When to Use**
    - When you have a one-to-many relationship between objects.
    - When you need to notify multiple objects about changes in a subject's state.
    - To achieve decoupling in a system.

5. **Implementation Steps**
    - Define the subject and observer interfaces.
    - Create concrete subject and observer classes.
    - Maintain a list of observers in the subject.
    - Implement methods for observers to register, unregister, and update.
    - Notify observers when the subject's state changes.

6. **Example**
    - Here we are implementing a notifyCustomers when stock 
   finishes or new stock comes in online shopping app like amazon
