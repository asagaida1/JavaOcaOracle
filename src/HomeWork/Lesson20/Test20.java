/*
Создайте класс, в котором создайте метод abc. Инпут
параметром данного метода будет N-ое количество
параметров типа стринг. Метод должен возвращать уже
отсортированный объект ArayList из неповторяющихся
объектов типа String, взятых из параметра метода и
выводить данный объект на экран.
Продемонстрируйте данный метод.
 */

package HomeWork.Lesson20;



import java.util.ArrayList;
import java.util.Collections;

public class Test20 {
    ArrayList<String> abc(String... s) {
        ArrayList<String> al = new ArrayList<>();
        for (String s1 : s) {
            if (!al.contains(s1)) {
                al.add(s1);
            }

        }
        Collections.sort(al, String::compareToIgnoreCase);


        System.out.println(al);
        return al;
    }

    public static void main(String[] args) {
        Test20 t = new Test20();
        t.abc("Z","z", "A", "a", "a", "A", "C", "b", "D", "e", "F", "G", "h", "A", "A", "A");


    }

}







