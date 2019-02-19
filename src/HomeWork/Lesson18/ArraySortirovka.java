/*
Создайте класс, в котором создайте метод sortirovka. Инпут
параметром данного метода будет одномерный массив типа
int. Метод должен возвращать уже отсортированный по
возростанию масив.
Продемонстрируйте данный метод.

*/

package HomeWork.Lesson18;

public class ArraySortirovka {
    public void sortirovka(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int a = array[i];
                if (array[j] < a) {
                    a = array[i];
                    array[i] = array[j];
                    array[j] = a;

                }
            }
        }
        for (int i = 0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
    }


    public static void main(String[] args) {
        ArraySortirovka t = new ArraySortirovka();
        int[] a = new int[]{10,9,8,7,6,5,4,3,2,1,0};

        t.sortirovka(a);
    }
}





