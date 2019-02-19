package HomeWork.Lesson5;

public class Emloyee {
    int id;
    String surname;
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
    double uvelichenieZarplatyVDvaRaza (){
        salary*=2;
        return salary;
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



    }
}

