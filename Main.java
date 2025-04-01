// Example of Object-Oriented Programming in Java

// Class representing a generic Animal
class Animal {
    private String name;
    private int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Method to make the animal speak
    public void speak() {
        System.out.println(name + " makes a sound.");
    }
}

// Class representing a Dog, inheriting from Animal
class Dog extends Animal {
    private String breed;

    // Constructor
    public Dog(String name, int age, String breed) {
        super(name, age); // Call the parent class constructor
        this.breed = breed;
    }

    // Getter for breed
    public String getBreed() {
        return breed;
    }

    // Overriding the speak method
    @Override
    public void speak() {
        System.out.println(getName() + " barks!");
    }
}

// Main class to demonstrate OOP concepts
public class Main {
    public static void main(String[] args) {
        // Create an Animal object
        Animal genericAnimal = new Animal("GenericAnimal", 5);
        genericAnimal.speak();

        // Create a Dog object
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        dog.speak();

        // Access properties
        System.out.println(dog.getName() + " is a " + dog.getBreed() + " and is " + dog.getAge() + " years old.");
    }
}