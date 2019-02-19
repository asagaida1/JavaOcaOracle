/*
Создайте класс, в котором создайте метод showArray. Инпут
параметром данного метода будет двумерный масив типа
String. Метод должен выводить на экран данный массив в
следующем виде:
{{элемент00,элемент01}, {элемент10}, {элемент20,элемент21}}


 */

package HomeWork.Lesson18;

public class ShowArray {
    public void showArray(String[][] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print("{");
            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array[i][j]);
                if (j!=array[i][j].length()){
                    System.out.print(",");
                }


            }
            if (i == array.length-1) {
                System.out.print("}");
            } else {
                System.out.print("}, ");
            }


        }
        System.out.println("}");

    }

    public static void main(String[] args) {
        String[][] a;
        a = new String[][]{{"q", "w"}, {"e", "r", "d", "s"}, {"t", "y"}};
        ShowArray s = new ShowArray();
        s.showArray(a);



    }
}

