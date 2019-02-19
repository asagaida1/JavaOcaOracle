/*
Создать класс. В классе создать статический метод, который будет
выводить на экран время в формате "час:минута:секунда" в интервале от
0 до 6 часов. Если час больше единицы и минута кратна 10-ти, то метод
нужно закончить. Если же (секунда умноженная на час) больше минуты,
то пора переходить на другую минуту. Продемонстировать данный
метод в действии.
 */

package HomeWork.Lesson14;

public class Test14 {
    static void time(){
        HOUR:
        for (int hour = 0 ; hour<6; hour++){
            MINUTE:
            for (int minute = 0;minute<60;minute++){
                if (hour>1 && minute!=0 && minute%10==0 ){
                    break HOUR;
                }
                SECOND:
                for (int second = 0;second<60;second++){

                    if (second*hour>minute ){
                        continue MINUTE;
                    }

                    System.out.println(hour + " : " +minute+ " : " +second + "   minute%10 :" +minute%10 + "   second*hour:" + second*hour+ "  minute:" + minute);
                }
            }
        }
    }
}

class Test14test {
    public static void main(String[] args) {
        Test14.time();
    }
}
