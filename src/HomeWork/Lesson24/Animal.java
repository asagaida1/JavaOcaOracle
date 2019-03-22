package HomeWork.Lesson24;

abstract public class Animal {
    Animal(String name){
        this.name=name;
    }
    String name;

    abstract void eat();
    abstract void sleep();
}

abstract class Fish extends Animal{

    Fish(String name) {
        super(name);
    }

    abstract void swim ();
    @Override
    void sleep(){
        System.out.println("Vsegda interesno nabludat kak spyat ribi");
    }
}

abstract class Bird extends Animal implements Speakable {
    Bird(String name) {
        super(name);
    }
    abstract void fly();
    @Override
    public void speak(){
        System.out.println(name + " sings");
    }

}
abstract class Mammal extends Animal implements Speakable{
    Mammal(String name) {
        super(name);
    }
    abstract void run();
}
interface Speakable{
    default void speak(){
        System.out.println("Somebody speaks");
    }
}

class Mechenosec extends Fish{
    Mechenosec(String name) {
        super(name);
    }
    @Override
    void swim(){
        System.out.println("Mechenosec krasivaya riba,kotoraya bistro plavaet!");
    }
    @Override
    void eat(){
        System.out.println("Mechenosec ne hishnaya riba, i ona est obychniy korm!");
    }
}
class Pingvin extends Bird{
    Pingvin(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Pingvin lyubit est ribu!");
    }

    @Override
    void sleep() {
        System.out.println("Pingvini spyat prizavshis drug k drugu!");
    }

    @Override
    void fly() {
        System.out.println("Pingvini ne umeyut letat!");
    }

    @Override
    public void speak() {
        System.out.println("Pingvini ne umeyut pet kak solovyi");
    }
}

class Lev extends Mammal{
    Lev(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Lev, kak lyuboy hishnik lyubit myaso!");
    }

    @Override
    void sleep() {
        System.out.println("Bolshuyu chast dnya lev spit");
    }

    @Override
    void run() {
        System.out.println("Lev-eto ne samaya bistraya koshka!");
    }
}

