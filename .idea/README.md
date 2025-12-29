# Vehicle Management System

## A. Project Overview

The Vehicle Management System is a Java application designed to demonstrate core Object-Oriented Programming (OOP) concepts such as inheritance, abstraction, composition, and aggregation.  
The system models different types of vehicles (Car, Motorcycle, and Truck) that share common properties and behaviors through an abstract superclass.

Inheritance is used to create a clear hierarchy between a generic Vehicle and its specific types.  
Abstraction is applied by defining common behavior in an abstract class while allowing subclasses to implement their own logic.  
Composition and aggregation are demonstrated through the relationship between Vehicle and Driver, where each vehicle has a driver, and one driver can be associated with multiple vehicles.

---

## B. Class Hierarchy

### Superclass
**Vehicle (abstract class)**
- Contains common fields such as `brand` and `year`
- Defines abstract methods `startEngine()` and `stopEngine()`
- Provides a concrete method `displayInfo()` for shared behavior

### Subclasses
- **Car**
- **Motorcycle**
- **Truck**

Each subclass extends the `Vehicle` class and:
- Calls the superclass constructor using `super`
- Overrides `startEngine()` and `stopEngine()` to provide vehicle-specific behavior

### Overridden Methods
The `startEngine()` and `stopEngine()` methods are overridden in each subclass to demonstrate polymorphism.  
When these methods are called through a `Vehicle` reference, the correct subclass implementation is executed at runtime.

### Access Modifiers
- `protected` is used in the `Vehicle` class for fields that need to be accessible by subclasses
- `private` is used for subclass-specific fields and for the `Driver` class fields to ensure encapsulation
- Default access is used where package-level visibility is sufficient

---

## C. Instructions to Compile and Run

Navigate to the `src` directory and run the following commands:

```bash
javac *.java
java Main
