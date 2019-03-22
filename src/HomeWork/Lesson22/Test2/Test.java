package HomeWork.Lesson22.Test2;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog("Sharik");
        Cat c = new Cat("Murzik");
        System.out.println("Count paw from dog: "+ d.getPaw());
        c.sleep();
    }
}
