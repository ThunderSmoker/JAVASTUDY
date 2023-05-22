
// Inheritance.java
class Inheritance {
    private int id;
    private String name;

    // Default constructor
    public Inheritance() {
        this.id = 0;
        this.name = "Default";
    }

    // Parameterized constructor
    public Inheritance(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Static inner class
    public static class StaticInnerClass {
        private String message;

        public StaticInnerClass(String message) {
            this.message = message;
        }

        public void displayMessage() {
            System.out.println("Static Inner Class Message: " + message);
        }
    }

    // Non-static inner class
    public class NonStaticInnerClass {
        private int value;

        public NonStaticInnerClass(int value) {
            this.value = value;
        }

        public void displayValue() {
            System.out.println("Non-Static Inner Class Value: " + value);
        }
    }
}
// SubClass.java
class SubClass extends Inheritance {
    private String description;

    // Constructor chaining with super()
    public SubClass(int id, String name, String description) {
        super(id, name);
        this.description = description;
    }

    // Method overloading
    public void displayInfo() {
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Description: " + description);
    }

    public void displayInfo(String prefix) {
        System.out.println(prefix + "ID: " + getId());
        System.out.println(prefix + "Name: " + getName());
        System.out.println(prefix + "Description: " + description);
    }
}

// Main.java
public class InheritanceMain {
    public static void main(String[] args) {
        Inheritance.StaticInnerClass staticInner = new Inheritance.StaticInnerClass("Hello");
        staticInner.displayMessage();

        Inheritance external = new Inheritance();
        Inheritance.NonStaticInnerClass nonStaticInner = external.new NonStaticInnerClass(42);
        nonStaticInner.displayValue();

        SubClass sub = new SubClass(1, "John", "Subclass object");
        sub.displayInfo();
        sub.displayInfo("Prefix: ");
    }
}
