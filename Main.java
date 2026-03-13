public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Tiger", "Ben", 5);
        Dog dog1 = new Dog("Smasher", "Kennedy", 3, "Bulldog");
        System.out.println(animal1);
        System.out.println(dog1);
        Dog dog2 = new Dog("Smasher", "Kennedy", 3, "Bulldog");
        System.out.println("dog1 equals dog2: " + dog1.equals(dog2));
    }
}
