/*
1. Создайте класс Student со следующими переменными: name (используйте
StringBuilder), course, grade. Примените инкапсюляцию к данному классу.
Длинна имени объектов не должна быть менее 3-х символов, оценки должны
быть числами в интермале от 1 до 10, курс должен быть числов от 1 до 4
включительно. Создайте метод showinfo, который будет выводить всю
информацию о студенте, не используя переменные класса напрямую.
Создайте класс TestStudent, в котором создайте объект класса Student,
придайте его переменным значения. Произведите вызов метода showinfo.

 */


package HomeWork.Lesson22.Test1;

public class Student {
    private StringBuilder name;
    private int course;
    private int grade;

    public StringBuilder getName() {
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }

    public void setName(StringBuilder name) {
        if (name.length() > 3) {
            this.name = name;
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course >= 1 && course <= 4) {
            this.course = course;
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 10) {
            this.grade = grade;
        }
    }
    public void showinfo(){
        System.out.println("Имя студента: " + getName());
        System.out.println("Курс: " + getCourse());
        System.out.println("Грейд: " + getGrade());
    }
}
class TestStudent{
    public static void main(String[] args) {
        Student student = new Student();
        student.setName(new StringBuilder("Коля"));
        student.setCourse(2);
        student.setGrade(3);
        student.showinfo();
    }
}
