package HomeWork.Lesson4;/*
Создайте 2 класса. 1-й назовите Student. Он должен содержать в себе
следующие атрибуты: номер студенческого билета, имя , фамилию, год
обучения, средняя оценка по математике, средняя оценка по экономике,
средняя оценка по иностранному языку. 2-й класс назовите StudentTest,
В нем Вы должны будете создать 3 разных объекта класса Student,
вывести на экран в читабельном виде среднюю арифметическую оценку
для каждого студента (учитывая все три предмета).

P.S. старайтесь писать код, понятный не только для Вас, а для всех

*/


public class Student {


    int studentId;
    String studentFirstName;
    String studentLastName;
    int yearOfStudy;
    float averageMathematicsGrade;
    float averageEconomicsGrade;
    float averageForeignLanguageGrade;
    float averageAllGrade;

    Float averageAllGrade2(Float f1, Float f2, Float f3) {
        averageMathematicsGrade = f1;
        averageEconomicsGrade = f2;
        averageForeignLanguageGrade = f3;
        Float avg1 = (averageMathematicsGrade + averageEconomicsGrade + averageForeignLanguageGrade) / 3;
        return avg1;
    }

//    Float avg2 (Float f10, Float f11, Float f12) {
//        averageMathematicsGrade = f10;
//        averageEconomicsGrade = f11;
//        averageForeignLanguageGrade = f12;
//        return (averageMathematicsGrade + averageEconomicsGrade + averageForeignLanguageGrade) / 3;

    }






    //Float averageAllGrade2 = (Student.this.averageMathematicsGrade+Student.this.averageEconomicsGrade+Student.this.averageForeignLanguageGrade)/3;



class StudentTest {
    Float srednayaOcenkaStudenta(Student st){
        float srednayaOcenkaStudent = (st.averageMathematicsGrade + st.averageEconomicsGrade + st.averageForeignLanguageGrade)/3;
        System.out.println("Средняя арифметическая оценка студента " + st.studentLastName +" "+ st.studentFirstName +" "+ "равняется: " + srednayaOcenkaStudent);
        return srednayaOcenkaStudent;

    }


    public static void main(String[] args) {
        Student Ivan = new Student();
        Student Petya = new Student();
        Student Sveta = new Student();

        Ivan.studentId = 1;
        Ivan.studentFirstName = "Ivan";
        Ivan.studentLastName = "Ivanov";
        Ivan.yearOfStudy = 2;
        Ivan.averageMathematicsGrade = 4.3F;
        Ivan.averageEconomicsGrade = 3.8F;
        Ivan.averageForeignLanguageGrade = 4.0F;
        Ivan.averageAllGrade = (Ivan.averageMathematicsGrade + Ivan.averageEconomicsGrade + Ivan.averageForeignLanguageGrade) / 3;
//        System.out.println("Ivan.averageAllGrade: " + Ivan.averageAllGrade);
//        float averageAllGrade2 = Ivan.averageAllGrade2(Ivan.averageMathematicsGrade, Ivan.averageEconomicsGrade, Ivan.averageForeignLanguageGrade);
//        System.out.println("Ivan.averageAllGrade2: " + averageAllGrade2);


        Petya.studentId = 2;
        Petya.studentFirstName = "Petya";
        Petya.studentLastName = "Petrov";
        Petya.yearOfStudy = 1;
        Petya.averageMathematicsGrade = 4.1F;
        Petya.averageEconomicsGrade = 3.0F;
        Petya.averageForeignLanguageGrade = 3.1F;
//        Petya.averageAllGrade = (Petya.averageMathematicsGrade + Petya.averageEconomicsGrade + Petya.averageForeignLanguageGrade) / 3;
//        System.out.println("Petya.averageAllGrade: " + Petya.averageAllGrade);
//        System.out.println( "Средняя арифметическая оценка, расчитанная по методу, для Пети. Ровняется: " + Petya.averageAllGrade2(Petya.averageEconomicsGrade, Petya.averageForeignLanguageGrade, Petya.averageMathematicsGrade));


        Sveta.studentId = 3;
        Sveta.studentFirstName = "Sveta";
        Sveta.studentLastName = "Svetlaya";
        Sveta.yearOfStudy = 3;
        Sveta.averageMathematicsGrade = 5.0F;
        Sveta.averageEconomicsGrade = 4.7F;
        Sveta.averageForeignLanguageGrade = 4.6F;
//        Sveta.averageAllGrade = (Sveta.averageMathematicsGrade + Sveta.averageEconomicsGrade + Sveta.averageForeignLanguageGrade) / 3;
//        System.out.println("Sveta.averageAllGrade: " + Sveta.averageAllGrade);
//        System.out.println( "Средняя арифметическая оценка, расчитанная по методу, для Светы. Ровняется: " + Sveta.averageAllGrade2(Sveta.averageEconomicsGrade, Sveta.averageForeignLanguageGrade, Sveta.averageMathematicsGrade));

        StudentTest st = new StudentTest();
        st.srednayaOcenkaStudenta(Ivan);
        st.srednayaOcenkaStudenta(Petya);
        st.srednayaOcenkaStudenta(Sveta);



        //        System.out.println(Ivan.averageAllGrade2);


    }


}
