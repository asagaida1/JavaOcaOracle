/*
2. Создайте класс Animal. При вызове его конструктора пусть на экран выводится "I
am animal". В классе пусть будут переменная eyes, характеризующая количество глаз;
методы eat (выводящий на экран "Animal eats") и drink (выводящий на экран "Animal
drinks").
Создайте класс Pet, который является child классом класса Animal. При вызове его
конструктора пусть на экран выводится "I am pet" и переменной eyes придается
значение 2. В классе пусть будут переменные name; tail, характеризующая
количество хвостов и равная 1; paw, характеризующая колчество лап и равная 4;
методы run (выводящий на экран "Pet runs") и jump (выводящий на экран "Pet
jumps").
Создайте класс Dog, который является child классом класса Pet. При вызове его
конструктора с параметром, который будет передавать имя, пусть на экран
выводится "I am dog and my name is: " + имя питомца. В класс обавьте метод play
(выводящий на экран "Dog plays").
Создайте класс Cat, который является child классом класса Pet. При вызове его
конструктора с параметров, который булет передавать имя, пусть на экран
выводится "I am cat and my name is: " + имя питомца. В класс добавьте метод sleep
(выводящий на экран "Cat sleeps").
Создайте класс Test, в методе main которого выведите на экран количество лап
объекта класса Dog и вызовите метод sleep объкта класса Cat.
 */
package HomeWork.Lesson22.Test2;

public class Animal {
    public Animal (){
        System.out.println("I am animal");
    }
    private int eyes;

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    void eat(){
         System.out.println("Animal eats");
     }
     void drink(){
         System.out.println("Animal drinks");
     }

    public static void main(String[] args) {
        Animal a = new Animal();
        a.drink();
        a.eat();
    }
}


