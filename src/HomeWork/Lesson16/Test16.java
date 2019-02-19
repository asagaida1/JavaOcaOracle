/*
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

public class Test16 {

    static void mail(String s1) {

        char c1 = '@';
        char c2 = '.';

        I:
        for (int i = 0; i < s1.length() - 1; i++) {

            if (s1.charAt(i) == c1) {
                i++;

                for (; i < s1.length() - 1; i++) {
                    if (s1.charAt(i) == c2) {
                        System.out.println("");
                        continue I;
                    }
                    System.out.print(s1.charAt(i));
                }
            }
        }
    }

    public static void main(String[] args) {
        mail("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
    }
}

