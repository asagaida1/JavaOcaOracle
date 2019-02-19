/*
1. Создать по 4-ре переменные всех всех целочисленных типов в следующем виде:
 - Все 4 переменные типа byte должны равняться 12 и быть записаны в разных системах исчисления.
 - Все 4 переменные типа short должны равняться -1300 и быть записаны в разных системах исчисления.
 - Все 4 переменные типа int должны равняться 0 и быть записаны в разных системах исчисления.
 - Все 4 переменные типа long должны равняться 12345678910 и быть записаны в разных системах исчисления.
 И вывести их на экран

 2. Создать по 2 переменные типов float, double и boolean. и вывести их на экран.

 3. Создать n-ное количество переменных типа данных char всемы возмлжными способами и вывести их на экран.
 */
package HomeWork;

public class Lesson2 {
    public static void main (String [] args){
        byte b1 = 12;
        byte b2 = 014;
        byte b3 = 0xC;
        byte b4 = 0b1100;

        short s1 = -1300;
        short s2 = -02424;
        short s3 = -0x514;
        short s4 = -0b010100010100;

        int i1 = 0;
        int i2 = 00;
        int i3 = 0x0;
        int i4 = 0b0;

        long l1 = 12345678910L;
        long l2 = 0133767016076L;
        long l3 = 0x2DFDC1C3EL;
        long l4 = 0b0010_1101_1111_1101_1100_0001_1100_0011_1110L;

        float f1 = 3.12345671f;
        float f2 = -3.12345679f;

        double d1 = 33.1;
        double d2 = -33.1;

        boolean booL1 = true;
        boolean booL2 = false;

        char ch1 = 'a';
        char ch2 = 100;
        char ch3 = '\u0100';

        int a = 5;
        System.out.println (++a - --a - a-- + a++);
        System.out.println (6   -   5 - 5   + 4);









        System.out.println (b1 + " " + b2 + " " + b3 + " " + b4);
        System.out.println (s1 + " " + s2 + " " + s3 + " " + s4);
        System.out.println (i1 + " " + i2 + " " + i3 + " " + i4);
        System.out.println (l1 + " " + l2 + " " + l3 + " " + l4);
        System.out.println (f1 + " " + f2);
        System.out.println (d1 + " " + d2);
        System.out.println (booL1 + " " + booL2);
        System.out.println (ch1 + " " + ch2 + " " + ch3 );


    }


}
