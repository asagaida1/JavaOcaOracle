/*
В классе Month создайте метод, у которого 1 параметр типа данных int.
Этот параметр будет указывать порядковый номер месяца. Используя
функционал switch выведите на экран количество дней этого месяца
(для 2015 года). Проверьте работу данного метода в main.

*/

package HomeWork.Lesson13;

public class Month {
    int nomerMesyatsa;

    Month (int nomerMesyatsa){
        this.nomerMesyatsa=nomerMesyatsa;
        switch (nomerMesyatsa){
            default:
                System.out.println("Такого месяца не существует");break;
            case 2:
                System.out.println("В этом месяце 28 дней"); break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("В этом месяце 30 дней"); break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("В этом месяце 31 день"); break;
        }

    }



    public static void main(String[] args) {
        Month m1 = new Month(1);
        Month m2 = new Month(11);
        Month m3 = new Month(13);
    }
}
