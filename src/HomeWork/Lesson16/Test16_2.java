/*
Не работающий пример.

Создайте класс, в котором создайте метод email. Данный
метод должен принимать в инпут 1 String параметр. Данный
параметр должен содержать в себе email-ы в следующем
виде: ya@yahoo.com; on@mail.ru; ona@gmail.com; , т.е.
После каждого mail должен стоять знак припинанаия ";".
Ваш метод должен выводить на экран информацию о том,
какой постой пользуются, исходя из парметра, т.е.
оутпут должен быть следующего вида:
yahoo
mail
gmail

Продемонстрируйте данный код
 */

package HomeWork.Lesson16;

public class Test16_2 {
    public void email(String s) {

        int a = 0;
        int b = 0;
        int c = 0;
        while (c < s.length() - 1) {

            a = s.indexOf('@', c);
            b = s.indexOf('.', c);
            c = s.indexOf(';', c + 1);
            System.out.println(s.substring(a + 1, b));
        }
    }

    public static void main(String[] args) {
        Test16_2 t = new Test16_2();
        t.email("ya@yahoo.com; on@mail.ru; ona@gmail.com");
    }


}
