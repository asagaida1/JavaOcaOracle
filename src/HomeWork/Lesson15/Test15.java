/*
Переписать домашнее задание из урока 14 так, что бы outer и
inner циклы представляли собой while loop а middle цикл
представлял собой do while loop.

Создать класс. В классе создать статический метод, который будет
выводить на экран время в формате "час:минута:секунда" в интервале от
0 до 6 часов. Если час больше единицы и минута кратна 10-ти, то метод
нужно закончить. Если же (секунда умноженная на час) больше минуты,
то пора переходить на другую минуту. Продемонстировать данный
метод в действии.
 */
package HomeWork.Lesson15;

public class Test15 {
    static void time2(){
        int hour = 0;
        HOUR:
        while (hour <6 ){
            int minute = -1;
            MINUTE:
            do{
                minute++;
                if (hour>1 && minute!=0 && minute%10==0 ){
                    break HOUR;
                }

                int second = 0;
                SECOND:
                while (second<60){

                    System.out.println(hour + ":" + minute + ":" + second);
                    second++;
                    if (second*hour>minute ){
                        continue MINUTE;
                    }
                }
            }
            while (minute<59);
            hour++;
        }
    }

    public static void main(String[] args) {
        time2();
    }


}
