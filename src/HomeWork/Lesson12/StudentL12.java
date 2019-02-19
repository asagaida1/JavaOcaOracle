/*
В классе StudentTest написать 2 метода, которые принимают 2 input
параметра - 2 объекта класса Student из Lesson11. Первый метод
сравнивает 2 - х студентов, используя 1 if statement и логические
операторы внутри него и выводит на эктан информацию о том, равны ли
студенты. Второй метод использует nested if statement, сравнивает все
атрибуты студента по отдельности, выводит на экран информацию о том,
равны ли студенты, а если не равны, то в чем именно было обнаружено
первое неравенство.
 */

package HomeWork.Lesson12;

public class StudentL12 {
    String name;
    int cource;
    double sredOtsenka;


    StudentL12 (String name, int cource, double sredOtsenka){
        this.name=name;
        this.cource = cource;
        this.sredOtsenka = sredOtsenka;
    }
}
class TestStudentL12{
    void sravnenieStudentov1(StudentL12 st1, StudentL12 st2){
        if (st1.equals(st2) &&  st1.name==st2.name && st1.cource==st2.cource && st1.sredOtsenka==st2.sredOtsenka){
            System.out.println("Студенты равны");
        }
        else {
            System.out.println("Студенты не равны");
        }
    }

    void sravnenieStudentov2 (StudentL12 st1, StudentL12 st2){
        if (st1.name==st2.name){
            System.out.println("Имена у студентов равны");
            if (st1.cource==st2.cource){
                System.out.println("У студентов курс совпадает");
                if (st1.sredOtsenka==st2.sredOtsenka){
                    System.out.println("У студентов совпадает средняя оценка");
                    System.out.println("Студенты одинаковые, у них совпадает имя, курс и средняя оценка");
                }
                else {
                    System.out.println("У студентов не совпадает средняя оценка");
                }
            }
            else {
                System.out.println("У студентов отличается курс");
            }
        }
        else {
            System.out.println("Имена у студентов не равны");
        }
    }


    public static void main(String[] args) {
        StudentL12 st1 = new StudentL12("Ivan", 35, 9.6);
        StudentL12 st2 = new StudentL12("Ivan", 3, 9.6);
       // st1=st2;
        TestStudentL12 t = new TestStudentL12();
        t.sravnenieStudentov1(st1, st2);
        t.sravnenieStudentov2(st1, st2);

    }

}
