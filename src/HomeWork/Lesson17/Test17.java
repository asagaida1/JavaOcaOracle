/*

Создайте класс, в котором создайте метод ravenstvo. Инпут
параметрами данного метода будут 2 объекта класса
StringBuilder. Метод должен иметь boolean return type,
возвращать true, если значения объектов совпадают, folse -
если не совпадают.

Продемонстрируйте данный код.
 */

package HomeWork.Lesson17;

public class Test17 {
    public boolean ravenstvo (StringBuilder sb1, StringBuilder sb2){
        String s1 = sb1.toString();
        String s2 = sb2.toString();
        boolean a = s1.equals(s2);
        System.out.println(a);
        return a;
    }

    public static void main(String[] args) {
        Test17 t = new Test17();
        StringBuilder sb1 = new StringBuilder("asa");
        StringBuilder sb2 = new StringBuilder("asa");

        t.ravenstvo(sb1, sb2);
        t.ravenstvo(new StringBuilder("ss"), new StringBuilder("cc"));
        t.ravenstvo(new StringBuilder("ss"), new StringBuilder("ss"));
        t.ravenstvo(new StringBuilder(), new StringBuilder());
    }

}
