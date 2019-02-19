/*
Пересоздайте класс Employee таким образом, чтобы
переменная salary была недоступна вне класса, переменная
surname была доступна отовсюду, а переменная id только
внутри пакета. Так же создайте 3 public метода, которые будут
показывать на дисплее значения этих переменных. Создайте
для данного класса 3 разных конструктора с public, default и
private access modifier-ами. В конструкторах присваивайте
переменным класса значения из параметров. Создайте
новые классы в том же и в другом пакете. Попытайтесь в них
создать объекты класса Employee и вывести на экран
значения переменных данного объекта ч помощью метода
println и методов самого класса
*/


package HomeWork.Lesson7;

public class Emloyee {
    private int id;
    public String surname;
    double age;
    double salary;
    String department;

    Emloyee(int id1, String surname1, double age1, double salary1, String departmant1){
        id = id1;
        surname = surname1;
        age = age1;
        salary = salary1;
        department = departmant1;
    }
    Emloyee (){

    }
    public Emloyee (int id1 ){
        this (id1, null, 0.0, 0.0, null);
        System.out.println("id = " + id1);
    }
    Emloyee (int id1, String surname1){
        this (id1, surname1, 0.0, 0.0, null);
        System.out.println("id = " + id1 + " ; " + "surname = " + surname1);
    }
    private Emloyee (int id1, String surname1,double salary1){
        this (id1, surname1, 0.0, salary1, null);
        System.out.println("id = " + id1 + " ; " + "surname = " + surname1 + " ; " + "salary = " + salary1);
    }

    double uvelichenieZarplatyVDvaRaza (){
        salary*=2;
        return salary;
    }
    public void metodOtobrazheniyaPeremennyh1(){
        System.out.println("Значения параметров. Id = " + id + " " + "surname = " +surname + " " +  "salary = " + salary);
    }
    public void metodOtobrazheniyaPeremennyh2(){
        System.out.println("Значения параметров. Id = " + id + " " + "surname = " +surname + " " +  "salary = " + salary);
    }
    public void metodOtobrazheniyaPeremennyh3(){
        System.out.println("Значения параметров. Id = " + id + " " + "surname = " +surname + " " +  "salary = " + salary);
    }

}



class EmployeeTest{

    public static void main(String[] args) {
        Emloyee e1 = new Emloyee(1, "Петров",36.5, 16500.00, "ГРУ" );
        Emloyee e2 = new Emloyee(2, "Баширов",35.0, 18000.00, "ГРУ" );

        System.out.println(e1.surname + " " + "Zarplata" + " " +e1.salary );
        e1.uvelichenieZarplatyVDvaRaza();
        System.out.println(e1.surname + " " + "Zarplata" + " " +e1.salary );

        System.out.println(e2.surname + " " + "Zarplata" + " " +e2.salary );
        e2.uvelichenieZarplatyVDvaRaza();
        System.out.println(e2.surname + " " + "Zarplata" + " " +e2.salary );

        e1.metodOtobrazheniyaPeremennyh1();
        e1.metodOtobrazheniyaPeremennyh2();
        e1.metodOtobrazheniyaPeremennyh3();




    }
}

