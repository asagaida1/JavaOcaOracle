package HomeWork.Lesson6;
/*
1. Создайте класс, в котором будут 5 overloaded методов,
которые вычисляют сумму нуля, одного, двух, трех, и четырех
целых чисел соответственно, передают эту сумму в output и
выводят ее на экран. В случае, когда слагаемые отсутствуют
(т.е. когда параметров нет) сумма пусть равняется 0.

2. Измение класс Student так что бы он имел 3 конструктора.
1 - ый принимает все параметры.
2 - ой только id, name, surname, course.
3 - ий не принимает значений.
Создайте в классе StudentTest три объекта с помощью разных
контраукторов.
*/

public class MetodSum {
//    MetodSum(int a1, int b1, int c1, int d1, int e1){
//        int sum = a1+b1+c1+d1+e1;
//        System.out.println("Sum all arguments = " + sum);
//        System.out.println();
//    }
//    MetodSum(){
//        this(0,0,0,0,0);
//    }
//    MetodSum(int a1) {
//        this(a1, 0, 0, 0, 0);
//    }
//    MetodSum(int a1, int b1) {
//        this(a1, b1, 0, 0, 0);
//    }
//    MetodSum(int a1, int b1, int c1) {
//        this(a1, b1, c1, 0, 0);
//    }
//    MetodSum(int a1, int b1, int c1, int d1) {
//        this(a1, b1, c1, d1, 0);
//
//    }
    int metodSum (){
        int sum = 0;
        System.out.println("Summa vseh argumentov: " + sum);
        return sum;
    }
    int metodSum (int a){
        int sum = a;
        System.out.println("Summa vseh argumentov: " + sum);
        return sum;
    }
    int metodSum (int a, int b){
        int sum = a+b;
        System.out.println("Summa vseh argumentov: " + sum);
        return sum;
    }
    int metodSum (int a, int b, int c){
        int sum = a+b+c;
        System.out.println("Summa vseh argumentov: " + sum);
        return sum;
    }
    int metodSum (int a, int b, int c, int d){
        int sum = a+b+c+d;
        System.out.println("Summa vseh argumentov: " + sum);
        return sum;
    }

}

class MetodSumTest{
    public static void main(String[] args) {
        MetodSum ms = new MetodSum();
        ms.metodSum();
        ms.metodSum(1);
        ms.metodSum(2,3);
        ms.metodSum(4,5,6);
        ms.metodSum(7,8,9,10);

//        MetodSum mS5 = new MetodSum(1,2,3,4,5);
//        MetodSum mS0 = new MetodSum();
//        MetodSum mS1 = new MetodSum(6);
//        MetodSum mS2 = new MetodSum(7,8);
//        MetodSum mS3 = new MetodSum(9,10,11);
//        MetodSum mS4 = new MetodSum(12,13,14,15);

    }

}
