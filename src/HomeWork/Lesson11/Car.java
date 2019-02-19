/*
Создайте класс Car с тремя переменными: цвет, мотор и количество
дверей. Затем создайте класс CarTest, в котором должны быть 2 метода.
1-й изменяет количество дверей объекта класса Car на количество,
прописанное в параметре метода. 2-й принимает в параметры 2 объекта
класса Car и меняет их цвета местами. Примените оба метода в main и
выведете на Экран атрибуты всех объектов.
 */

package HomeWork.Lesson11;

public class Car {
    String color;
    String motor;
    int countDoors;

    Car(String color, String motor, int countDoors){
        this.color=color;
        this.motor=motor;
        this.countDoors=countDoors;
    }

    void carInfo (Car c){
        System.out.println("color:" + c.color + "; motor:" + c.motor + "; countDoors : " + c.countDoors);
        System.out.println();
    }

    void changeCountDoorsInCar(Car c, int countDoors){
        c.countDoors=countDoors;
    }

    void changeColourBetweenCar (Car c1, Car c2){
        String colorTest;
        colorTest = c2.color;
        c2.color = c1.color;
        c1.color = colorTest;


    }


}

class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("Red", "V6", 4);
        Car c2 = new Car("Black", "V8", 5);
        c1.carInfo(c1);
        c2.carInfo(c2);
        c1.changeCountDoorsInCar(c1,7);
        c1.carInfo(c1);
        c2.changeCountDoorsInCar(c2,8);
        c1.carInfo(c1);
        c2.carInfo(c2);

        c1.changeColourBetweenCar(c1, c2);
        c1.carInfo(c1);
        c2.carInfo(c2);



    }





}
