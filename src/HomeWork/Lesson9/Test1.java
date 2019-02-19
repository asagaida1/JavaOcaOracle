/*
1. Напишите программу, в которой будет созданно 8 объектов, но к
последней строке метода main останется всего 2.

2. Вычислите устно output-ы данных программ, а затем проверьте в IDE.
1)
public class Test1 {
    int a = 1;
    static  int a = 1;
    void abc (int a){
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.abc(3);
    }
}

2)
public class Test2 {
    int a = 1;
    static  int b = 2;
    static  void abc (final  int a) {
        System.out.println(a);
        System.out.println(Test2.b);
    }

    public static void main(String[] args) {
        abc(5);
    }
}

3)
public class Test3 {
    int a = 1;
    static  int b = 2;
    void abc (int a){
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Test3.b);
    }

    public static void main(String[] args) {
        Test3 t = new Test3();
        t.abc(4);
    }
}

 */

package HomeWork.Lesson9;


public class Test1 {
    void abc (){
        String s1 = new String("ABC");
        String s2 = new String("DEF");
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.abc();
        t.abc();
        t.abc();
        t.abc();
        t.abc();
        t.abc();
        t.abc();
        String s1 = new String("123");
        t.abc();
    }

}

class Test2{
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.abc();



    }
}