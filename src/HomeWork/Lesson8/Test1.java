/*
1. В первом классе создайте два Static метода. 1-ый пусть умножает 3 числа из
параметра метода и возвращает их произведение; 2-ой - делит первое
число из параметра на второе и ничего не возвращает, лишь выводит на
дисплей в читабельном виде целое число и остаток. Во втором классе
по два раза используйте данные методы.

2. В первом классе создайте static final переменную Пи = 3,14.
Используйте данную константу в non-static методе, который принимает в параметре
значение радиуса и вычисляет площадь круга по формуле:
Площадь = Пи * радиус * радиус.

Так же используйте данную константу в static методе,
который принимает в параметре значение радиуса и вычисляет длинну
окружности по формуле: Пощадь = 2 * Пи * радиус.

Создайте ещё один non-static метод, который принимает в параметре значение радиуса и
выводит на экран информацию о радиусе, площади круга и длинне
окружности. Используйте все три метода во 2-ом классе.
 */



package HomeWork.Lesson8;

public class Test1 {

    public static final double pi = 3.14;

    public static int umnozitTriChisla(int a, int b, int c){
        int result = a*b*c;
        System.out.println("Rezultat umnozheniya tryoh chisel = " + result);
        return result;
    }

    public static void  delenieDvuhChisel(int a, int b){
        System.out.println("Tseloe chislo = " + a/b + "; Ostatok ot deleniya = " + a%b);
    }

    public double ploshchadKruga(double radius){
        double result = Test1.pi*radius*radius;
        return result;
    }
    public static double dlinnaOkruzhnosti(double radius2){
        double result = 2 * Test1.pi * radius2;
        return result;
    }

    public void krugInfo (double radius3){
        double ploshadKruga1 = ploshchadKruga(radius3);
        double dlinnaOkruzhnosti1 = dlinnaOkruzhnosti(radius3);
        System.out.println("Pri radiuse = " + radius3+ ", Ploshchad kruga = " + ploshadKruga1 + ";   Dlinna okruzhnosti = " + dlinnaOkruzhnosti1);
    }
}
