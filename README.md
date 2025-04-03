# SOLID Principles in Java

## Introduction

The **SOLID** principles are a set of five design principles in object-oriented programming that help developers write maintainable, scalable, and robust code. These principles were introduced by **Robert C. Martin (Uncle Bob)** and are widely used in software development.

## SOLID Acronym

Each letter in **SOLID** stands for a design principle:

1. **S** - Single Responsibility Principle (SRP)
2. **O** - Open/Closed Principle (OCP)
3. **L** - Liskov Substitution Principle (LSP)
4. **I** - Interface Segregation Principle (ISP)
5. **D** - Dependency Inversion Principle (DIP)

---

## 1. Single Responsibility Principle (SRP)

> A class should have only one reason to change.

### ✅ **Correct Implementation**

```java
class ReportGenerator {
    public void generateReport() {
        System.out.println("Generating report...");
    }
}

class ReportSaver {
    public void saveReport() {
        System.out.println("Saving report...");
    }
}
```

### ❌ **Incorrect Implementation**

```java
class ReportManager {
    public void generateReport() {
        System.out.println("Generating report...");
    }

    public void saveReport() {
        System.out.println("Saving report...");
    }
}
```

---

## 2. Open/Closed Principle (OCP)

> A class should be open for extension but closed for modification.

### ✅ **Correct Implementation**

```java
interface Notifier {
    void sendNotification(String message);
}

class EmailNotifier implements Notifier {
    public void sendNotification(String message) {
        System.out.println("Sending Email: " + message);
    }
}

class SMSNotifier implements Notifier {
    public void sendNotification(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
```

### ❌ **Incorrect Implementation**

```java
class NotificationService {
    public void sendNotification(String type, String message) {
        if (type.equals("email")) {
            System.out.println("Sending Email: " + message);
        } else if (type.equals("sms")) {
            System.out.println("Sending SMS: " + message);
        }
    }
}
```

---

## 3. Liskov Substitution Principle (LSP)

> Subtypes must be substitutable for their base types without breaking the application.

### ✅ **Correct Implementation**

```java
class Bird {
    public void fly() {
        System.out.println("Flying");
    }
}

class Sparrow extends Bird {}
```

### ❌ **Incorrect Implementation**

```java
class Bird {
    public void fly() {
        System.out.println("Flying");
    }
}

class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly");
    }
}
```

---

## 4. Interface Segregation Principle (ISP)

> A class should not be forced to implement interfaces it does not use.

### ✅ **Correct Implementation**

```java
interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class AllInOnePrinter implements Printer, Scanner {
    public void print() { System.out.println("Printing..."); }
    public void scan() { System.out.println("Scanning..."); }
}

class SimplePrinter implements Printer {
    public void print() { System.out.println("Printing..."); }
}
```

### ❌ **Incorrect Implementation**

```java
interface Machine {
    void print();
    void scan();
}

class PrinterOnly implements Machine {
    public void print() { System.out.println("Printing..."); }
    public void scan() { throw new UnsupportedOperationException("Cannot scan"); }
}
```

---

## 5. Dependency Inversion Principle (DIP)

> High-level modules should not depend on low-level modules. Both should depend on abstractions.

### ✅ **Correct Implementation**

```java
interface Database {
    void save(String data);
}

class MySQLDatabase implements Database {
    public void save(String data) {
        System.out.println("Saving data in MySQL");
    }
}

class Application {
    private Database database;

    public Application(Database database) {
        this.database = database;
    }

    public void saveData(String data) {
        database.save(data);
    }
}
```

### ❌ **Incorrect Implementation**

```java
class Application {
    private MySQLDatabase database = new MySQLDatabase();

    public void saveData(String data) {
        database.save(data);
    }
}
```

---

## Summary

| Principle | Description                                                       |
| --------- | ----------------------------------------------------------------- |
| **SRP**   | A class should have only one reason to change.                    |
| **OCP**   | A class should be open for extension but closed for modification. |
| **LSP**   | Subtypes must be substitutable for their base types.              |
| **ISP**   | A class should not be forced to implement unnecessary methods.    |
| **DIP**   | High-level modules should not depend on low-level modules.        |

## Conclusion

By following the **SOLID** principles, you can create software that is modular, scalable, and easy to maintain. These principles help in reducing dependencies and making code more flexible for future changes.

## References

For a more detailed explanation of SOLID principles, refer to this article: [SOLID Principles Explained in Plain English](https://www.freecodecamp.org/news/solid-principles-explained-in-plain-english/)

