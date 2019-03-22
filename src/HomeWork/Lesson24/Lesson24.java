/*
Создайте абстрактный класс Animal, его конструктор пусть имеет параметр, значение которого
назначается переменной String name. В классе Animal создайте абстрактные методы eat и sleep.
Создайте абстрактный класс Fish, кторый является дочерним классом класса Animal, его конструктор
пусть имеет параметр, значение которого назначается переменным name данного и родительского
класса. В классе Fish перезапишите метод sleep так, чтобы он выводил на экран "Vsegda interesno
nabludat kak spyat ribi". Так жк здесь создайте абстрактный метод swim.

Создайте абстрактный класс Bird, который является дочерним классом класса Animal, его конструктор
пусть имеет параметр, значение которого назначается переменным name данного и родительского
класса. Так же здесь создайте абстрактный метод fly.

Создайте интерфейс Speakaable, в котором пусть будет дефолтный метод speak, который выводит на
экран "Somebody speaks". Пусть класс Mammal имплементирует этот интерфейс. Так же пусть класс Bird
имплементирует этот интерфейс и перезаписывает его метод так, что бы он выводил на экран имя+"sings".

Создайте класс Mechenosec, который является дочерним классом класса Fish, его конструктор пусть
имеет параметр, значение которого назначается переменным name данного и родительского класса. В
классе Mechenosec перезапишите метод swim так, чтобы он выводил на экран "Mechenosec krasivaya riba,
kotoraya bistro plavaet!". Также перезапишите метод eat так, чтобы он выводил на экран "Mechenosec
ne hishnaya riba, i ona est obychniy korm!".


Создайте класс Pingvin, который является дочерним классом класса Bird, его конструктор пусть имеет
параметр, значение которого назначается переменным name данного и родительского класса. В классе
Pingvin перезапишите метод eat так, чтобы он выводил на экран "Pingvin lyubit est ribu!". Также
перезапишите метод sleep так чтобы он выводи лна экран "Pingvini spyat prizavshis drug k drugu!". Также
перезапишите метод fly так, чтобы он выводил на экран "Pingvini ne umeyut letat!". Также перезапишите
метод speak так, чтобы он выводил на экран "Pingvini ne umeyut pet kak solovyi".

Создайте класс Lev, который является дочерним классом Mammal, его конструктор пусть имеет
параметр, значение которого назначается переменным name данного и родительского класса. В классе
Lev перезапишите метод eat так, что бы он выводил на экран "Lev, kak lyuboy hishnik lyubit myaso!". Также
перезапишите метод sleep так, чтобы он выводил на экран "Bolshuyu chast dnya lev spit". Также
перезапишите метод run, так чтобы он выводил на экран "Lev-eto ne samaya bistraya koshka!".

В классе Lesson24 создайте метод main, в котором:
1. Создайт объект класса Mechenosec, на который ссылается переменная типа Mechenosec, выведите
переменную name данного объекта и вызовите все методы, которые сможете вызвать с помощью
данной переменной;
2. Создайте объект класса Pingvin, на которую ссылается переменная типа Speakable, вызовите все
методы, которые сможете вызвать с помощью данной переменной;
3. Создайте объекты класса Lev, на котрый ссылается переменная типа Speakable, вызовите все
методы, которые можете вызвать с помощью данной переменной;
4 Создайте ещё один объект Lev, на который ссылается петеменая типа Mammal, выведите
переменную name данного объекта и вызовите все методы, которые сможете вызвать с помощью
данной переменной.
 */

package HomeWork.Lesson24;

public class Lesson24 {
    public static void main(String[] args) {
        Mechenosec mechenosec = new Mechenosec("Mech");
        System.out.println("Mechenosec name = " + mechenosec.name);
        mechenosec.eat();
        mechenosec.swim();
        mechenosec.sleep();

        Speakable pingvin = new Pingvin("Ping");
        System.out.println();
        System.out.println("pingvin name = " + ((Pingvin) pingvin).name);
//        ((Pingvin) pingvin).eat();
//        ((Pingvin) pingvin).fly();
//        ((Pingvin) pingvin).sleep();
        pingvin.speak();

        Animal lev = new Lev("Leo");
        System.out.println();
        System.out.println("Lev name = " +lev.name);
        lev.eat();
        lev.sleep();
//        ((Lev) lev).run();

        Mammal lev2 = new Lev("LeoJunior");
        System.out.println();
        System.out.println("lev2 name = " + lev2.name);
        lev2.run();
        lev2.speak();
        lev2.eat();
        lev2.sleep();







    }

}
