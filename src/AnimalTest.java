public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        Animal obj;

        obj=new Animal();
        obj.sound();

        obj=new Dog();
        obj.sound();

        obj= new Cat();
        obj.sound();
    }
}
