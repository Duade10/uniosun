// Animal class
class Animal {
    private String name;
    private int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Methods
    public void makeSound() {
        System.out.println("Generic animal sound");
    }

    public void run() {
        System.out.println("Generic animal running");
    }
}

// Dog class (subclass of Animal)
class Dog extends Animal {
    // Constructor
    public Dog(String name, int age) {
        super(name, age);
    }

    // Overridden methods
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    @Override
    public void run() {
        System.out.println("Running");
    }
}

// Cat class (subclass of Animal)
class Cat extends Animal {
    // Constructor
    public Cat(String name, int age) {
        super(name, age);
    }

    // Overridden methods
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void run() {
        System.out.println("Running");
    }
}

// TestAnimal class
public class TestAnimal {
    public static void main(String[] args) {
        // Create objects of Dog and Cat
        Dog myDog = new Dog("Buddy", 3);
        Cat myCat = new Cat("Whiskers", 2);

        // Store them in an array of type Animal
        Animal[] animals = { myDog, myCat };

        // Call the makeSound and run methods on each object using polymorphism
        for (Animal animal : animals) {
            System.out.println("Name: " + animal.getName());
            System.out.println("Age: " + animal.getAge());
            animal.makeSound();
            animal.run();
            System.out.println();
        }
    }
}
